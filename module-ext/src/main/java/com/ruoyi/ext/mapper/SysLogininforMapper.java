package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysLogininfor;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 系统访问日志情况信息 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysLogininforMapper")
public interface SysLogininforMapper extends BaseMapper<SysLogininfor> {
    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    public default void insertLogininfor(SysLogininfor logininfor) {
        logininfor.setCreateTime(new Date());
        logininfor.setLoginTime(new Date());
        this.insert(logininfor, true);
    }

    /**
     * 查询系统登录日志集合
     *
     * @return 登录记录集合
     */
    public PageQuery<SysLogininfor> queryByCondition(PageQuery<SysLogininfor> pageQuery);


    public default List<SysLogininfor> selectLogininforList(SysLogininfor logininfor) {
        PageQuery<SysLogininfor> page = new PageQuery<SysLogininfor>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(logininfor);
        return queryByCondition(page).getList();
    }

    /**
     * 批量删除系统登录日志
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    public default int deleteLogininforByIds(String[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_logininfor where info_id in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 清空系统登录日志
     *
     * @return 结果
     */
    public default int cleanLogininfor() {
        this.executeUpdate("truncate table sys_logininfor");
        return 1;
    }

}
