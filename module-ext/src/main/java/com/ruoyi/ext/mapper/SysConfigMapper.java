package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysConfig;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 参数配置 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysConfigMapper")
public interface SysConfigMapper extends BaseMapper<SysConfig> {

    /**
     * 查询参数配置列表
     *
     * @return 参数配置集合
     */
    public PageQuery<SysConfig> queryByCondition(PageQuery<SysConfig> pageQuery);


    public default List<SysConfig> selectConfigList(SysConfig config) {
        PageQuery<SysConfig> page = new PageQuery<SysConfig>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(config);
        return queryByCondition(page).getList();
    }

    /**
     * 查询参数配置信息
     *
     * @param config 参数配置信息
     * @return 参数配置信息
     */
    public SysConfig selectConfig(SysConfig config);


    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键名
     * @return 参数配置信息
     */
    @Sql("select * from sys_config where config_key = ?")
    public SysConfig checkConfigKeyUnique(String configKey);

    /**
     * 新增参数配置
     *
     * @param config 参数配置信息
     * @return 结果
     */
    public default int insertConfig(SysConfig config) {
        config.setCreateTime(new Date());
        this.insert(config, true);
        return 1;
    }

    /**
     * 修改参数配置
     *
     * @param config 参数配置信息
     * @return 结果
     */
    public default int updateConfig(SysConfig config) {
        config.setUpdateTime(new Date());
        return this.updateTemplateById(config);
    }

    /**
     * 批量删除参数配置
     *
     * @param configIds 需要删除的数据ID
     * @return 结果
     */
    public default int deleteConfigByIds(String[] configIds) {
        return this.getSQLManager().executeUpdate("delete from sys_config where config_id in (#join(ids)#)",
                SqlParam.create().set("ids", configIds));
    }

}
