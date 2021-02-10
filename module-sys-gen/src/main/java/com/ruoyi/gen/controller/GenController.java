package com.ruoyi.gen.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.sys.controller.BaseController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.util.text.Convert;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.gen.domain.GenTable;
import com.ruoyi.gen.domain.GenTableColumn;
import com.ruoyi.gen.service.IGenTableColumnService;
import com.ruoyi.gen.service.IGenTableService;

/**
 * 代码生成 操作处理
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/tool/gen")
public class GenController extends BaseController {
    @Autowired
    private IGenTableService genTableService;

    @Autowired
    private IGenTableColumnService genTableColumnService;

    /**
     * 查询代码生成列表
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:list')")
    @GetMapping("/list")
    public TableDataVo genList(GenTable genTable) {
        startPage();
        List<GenTable> list = genTableService.selectGenTableList(genTable);
        return getDataTable(list);
    }

    /**
     * 修改代码生成业务
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:query')")
    @GetMapping(value = "/{talbleId}")
    public ResultVo getInfo(@PathVariable Long talbleId) {
        GenTable table = genTableService.selectGenTableById(talbleId);
        List<GenTableColumn> list = genTableColumnService.selectGenTableColumnListByTableId(talbleId);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("info", table);
        map.put("rows", list);
        return ResultVo.success(map);
    }

    /**
     * 查询数据库列表
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:list')")
    @GetMapping("/db/list")
    public TableDataVo dataList(GenTable genTable) {
        startPage();
        List<GenTable> list = genTableService.selectDbTableList(genTable);
        return getDataTable(list);
    }

    /**
     * 查询数据表字段列表
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:list')")
    @GetMapping(value = "/column/{talbleId}")
    public TableDataVo columnList(Long tableId) {
        TableDataVo dataInfo = new TableDataVo();
        List<GenTableColumn> list = genTableColumnService.selectGenTableColumnListByTableId(tableId);
        dataInfo.setRows(list);
        dataInfo.setTotal(list.size());
        return dataInfo;
    }

    /**
     * 导入表结构（保存）
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:list')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.IMPORT)
    @PostMapping("/importTable")
    public ResultVo importTableSave(String tables) {
        String[] tableNames = Convert.toStrArray(tables);
        // 查询表信息
        List<GenTable> tableList = genTableService.selectDbTableListByNames(tableNames);
        genTableService.importGenTable(tableList);
        return ResultVo.success();
    }

    /**
     * 修改保存代码生成业务
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:edit')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo editSave(@Validated @RequestBody GenTable genTable) {
        genTableService.validateEdit(genTable);
        genTableService.updateGenTable(genTable);
        return ResultVo.success();
    }

    /**
     * 删除代码生成
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:remove')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{tableIds}")
    public ResultVo remove(@PathVariable Long[] tableIds) {
        genTableService.deleteGenTableByIds(tableIds);
        return ResultVo.success();
    }

    /**
     * 预览代码
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:preview')")
    @GetMapping("/preview/{tableId}")
    public ResultVo preview(@PathVariable("tableId") Long tableId) throws IOException {
        Map<String, String> dataMap = genTableService.previewCode(tableId);
        return ResultVo.success(dataMap);
    }

    /**
     * 生成代码（下载方式）
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:code')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.GENCODE)
    @GetMapping("/download/{tableName}")
    public void download(HttpServletResponse response, @PathVariable("tableName") String tableName) throws IOException {
        byte[] data = genTableService.downloadCode(tableName);
        genCode(response, data);
    }

    /**
     * 生成代码（自定义路径）
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:code')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.GENCODE)
    @GetMapping("/genCode/{tableName}")
    public ResultVo genCode(@PathVariable("tableName") String tableName) {
        genTableService.generatorCode(tableName);
        return ResultVo.success();
    }

    /**
     * 同步数据库
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:edit')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.UPDATE)
    @GetMapping("/synchDb/{tableName}")
    public ResultVo synchDb(@PathVariable("tableName") String tableName) {
        genTableService.synchDb(tableName);
        return ResultVo.success();
    }

    /**
     * 批量生成代码
     */
    @PreAuthorize("@ss.hasPermission('tool:gen:code')")
    @Log(title = "代码生成", businessType = BusinessTypeEnum.GENCODE)
    @GetMapping("/batchGenCode")
    public void batchGenCode(HttpServletResponse response, String tables) throws IOException {
        String[] tableNames = Convert.toStrArray(tables);
        byte[] data = genTableService.downloadCode(tableNames);
        genCode(response, data);
    }

    /**
     * 生成zip文件
     */
    private void genCode(HttpServletResponse response, byte[] data) throws IOException {
        response.reset();
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Expose-Headers", "Content-Disposition");
        response.setHeader("Content-Disposition", "attachment; filename=\"ruoyi.zip\"");
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");
        IOUtils.write(data, response.getOutputStream());
    }
}
