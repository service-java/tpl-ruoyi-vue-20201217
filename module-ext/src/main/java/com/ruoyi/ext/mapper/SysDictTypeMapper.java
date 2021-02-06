package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysDictType;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * 字典表 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysDictTypeMapper")
public interface SysDictTypeMapper extends BaseMapper<SysDictType> {
    /**
     * 根据条件分页查询字典类型
     *
     * @return 字典类型集合信息
     */
    public PageQuery<SysDictType> queryByCondition(PageQuery<SysDictType> pageQuery);

    public default List<SysDictType> selectDictTypeList(SysDictType dictType) {
        PageQuery<SysDictType> page = new PageQuery<SysDictType>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(dictType);
        return queryByCondition(page).getList();
    }

    /**
     * 根据所有字典类型
     *
     * @return 字典类型集合信息
     */
    public default List<SysDictType> selectDictTypeAll() {
        return this.all();
    }

    /**
     * 根据字典类型ID查询信息
     *
     * @param dictId 字典类型ID
     * @return 字典类型
     */
    public default SysDictType selectDictTypeById(Long dictId) {
        return this.single(dictId);
    }

    /**
     * 根据字典类型查询信息
     *
     * @param dictType 字典类型
     * @return 字典类型
     */
    @Sql("select * form sys_dict_type  where dict_type = ? ")
    public SysDictType selectDictTypeByType(String dictType);

    /**
     * 通过字典ID删除字典信息
     *
     * @param dictId 字典ID
     * @return 结果
     */
    public default int deleteDictTypeById(Long dictId) {
        return this.deleteById(dictId);
    }

    /**
     * 批量删除字典类型
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    public default int deleteDictTypeByIds(Long[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_dict_type where dict_id  in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 新增字典类型信息
     *
     * @param dictType 字典类型信息
     * @return 结果
     */
    public default int insertDictType(SysDictType dictType) {
        this.insert(dictType, true);
        return 1;
    }

    /**
     * 修改字典类型信息
     *
     * @param dictType 字典类型信息
     * @return 结果
     */
    public default int updateDictType(SysDictType dictType) {
        return this.updateTemplateById(dictType);
    }

    /**
     * 校验字典类型称是否唯一
     *
     * @param dictType 字典类型
     * @return 结果
     */
    public default SysDictType checkDictTypeUnique(String dictType) {
        SysDictType sysDictType = new SysDictType();
        sysDictType.setDictType(dictType);
        return this.templateOne(sysDictType);
    }


}
