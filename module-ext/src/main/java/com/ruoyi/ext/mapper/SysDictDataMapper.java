package com.ruoyi.ext.mapper;

import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysDictData;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 字典表 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysDictDataMapper")
public interface SysDictDataMapper extends BaseMapper<SysDictData> {
    /**
     * 根据条件分页查询字典数据
     *
     * @return 字典数据集合信息
     */
    public PageQuery<SysDictData> queryByCondition(PageQuery<SysDictData> pageQuery);


    public default List<SysDictData> selectDictDataList(SysDictData dictData) {
        PageQuery<SysDictData> page = new PageQuery<SysDictData>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(dictData);
        return queryByCondition(page).getList();
    }

    /**
     * 根据字典类型查询字典数据
     *
     * @param dictType 字典类型
     * @return 字典数据集合信息
     */
    public List<SysDictData> selectDictDataByType(String dictType);

    /**
     * 根据字典类型和字典键值查询字典数据信息
     *
     * @param dictType  字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    public String selectDictLabel(String dictType, String dictValue);

    /**
     * 根据字典数据ID查询信息
     *
     * @param dictCode 字典数据ID
     * @return 字典数据
     */
    public default SysDictData selectDictDataById(Long dictCode) {
        return this.single(dictCode);
    }

    ;

    /**
     * 查询字典数据
     *
     * @param dictType 字典类型
     * @return 字典数据
     */
    public default int countDictDataByType(String dictType) {
        SysDictData param = new SysDictData();
        param.setDictType(dictType);
        Long count = this.templateCount(param);
        return count.intValue();
    }

    ;

    /**
     * 通过字典ID删除字典数据信息
     *
     * @param dictCode 字典数据ID
     * @return 结果
     */
    public default int deleteDictDataById(Long dictCode) {
        return this.deleteById(dictCode);
    }

    /**
     * 批量删除字典数据
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    public default int deleteDictDataByIds(String[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_dict_data where dict_code in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 新增字典数据信息
     *
     * @param dictData 字典数据信息
     * @return 结果
     */
    public default int insertDictData(SysDictData dictData) {
        dictData.setCreateTime(new Date());
        this.insertTemplate(dictData, true);
        return 1;
    }

    /**
     * 修改字典数据信息
     *
     * @param dictData 字典数据信息
     * @return 结果
     */
    public default int updateDictData(SysDictData dictData) {
        return this.updateTemplateById(dictData);
    }

    /**
     * 同步修改字典类型
     *
     * @param oldDictType 旧字典类型
     * @param newDictType 新旧字典类型
     * @return 结果
     */
    public default int updateDictDataType(String oldDictType, String newDictType) {
        return this.getSQLManager().executeUpdate("update sys_dict_data set dict_type = #newDictType# where dict_type = #oldDictType#",
                SqlParam.create().set("oldDictType", oldDictType).set("newDictType", newDictType));
    }


}
