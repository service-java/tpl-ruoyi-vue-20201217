package com.ruoyi.demo.controller;

import java.util.List;

import com.ruoyi.sys.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.demo.domain.DemoBook;
import com.ruoyi.demo.service.IDemoBookService;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.common.vo.TableDataVo;

/**
 * 图书Controller
 *
 * @author ruoyi
 * @date 2020-12-11
 */
@RestController
@RequestMapping("/system/book")
public class DemoBookController extends BaseController {
    @Autowired
    private IDemoBookService demoBookService;

    /**
     * 查询图书列表
     */
    @PreAuthorize("@ss.hasPermission('system:book:list')")
    @GetMapping("/list")
    public TableDataVo list(DemoBook demoBook) {
        startPage();
        List<DemoBook> list = demoBookService.selectDemoBookList(demoBook);
        return getDataTable(list);
    }

    /**
     * 导出图书列表
     */
    @PreAuthorize("@ss.hasPermission('system:book:export')")
    @Log(title = "图书", businessType = BusinessTypeEnum.EXPORT)
    @GetMapping("/export")
    public ResultVo export(DemoBook demoBook) {
        List<DemoBook> list = demoBookService.selectDemoBookList(demoBook);
        ExcelUtils<DemoBook> util = new ExcelUtils<DemoBook>(DemoBook.class);
        return util.exportExcel(list, "book");
    }

    /**
     * 获取图书详细信息
     */
    @PreAuthorize("@ss.hasPermission('system:book:query')")
    @GetMapping(value = "/{id}")
    public ResultVo getInfo(@PathVariable("id") Long id) {
        return ResultVo.success(demoBookService.selectDemoBookById(id));
    }

    /**
     * 新增图书
     */
    @PreAuthorize("@ss.hasPermission('system:book:add')")
    @Log(title = "图书", businessType = BusinessTypeEnum.INSERT)
    @PostMapping
    public ResultVo add(@RequestBody DemoBook demoBook) {
        return responseByRows(demoBookService.insertDemoBook(demoBook));
    }

    /**
     * 修改图书
     */
    @PreAuthorize("@ss.hasPermission('system:book:edit')")
    @Log(title = "图书", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo edit(@RequestBody DemoBook demoBook) {
        return responseByRows(demoBookService.updateDemoBook(demoBook));
    }

    /**
     * 删除图书
     */
    @PreAuthorize("@ss.hasPermission('system:book:remove')")
    @Log(title = "图书", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{ids}")
    public ResultVo remove(@PathVariable Long[] ids) {
        return responseByRows(demoBookService.deleteDemoBookByIds(ids));
    }
}
