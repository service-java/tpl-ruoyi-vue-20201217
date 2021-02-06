package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysOperLog;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 操作日志 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysOperLogMapper")
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {
    /**
     * 新增操作日志
     *
     * @param operLog 操作日志对象
     */
    public default void insertOperlog(SysOperLog operLog) {
        operLog.setCreateTime(new Date());
        operLog.setOperTime(operLog.getCreateTime());
        this.insert(operLog, true);
    }

    /**
     * 查询系统操作日志集合
     *
     * @param operLog 操作日志对象
     * @return 操作日志集合
     */
    public PageQuery<SysOperLog> queryByCondition(PageQuery<SysOperLog> pageQuery);

    public default List<SysOperLog> selectOperLogList(SysOperLog operLog) {
        PageQuery<SysOperLog> page = new PageQuery<SysOperLog>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(operLog);
        return queryByCondition(page).getList();
    }

    /**
     * 批量删除系统操作日志
     *
     * @param ids 需要删除的数据
     * @return 结果
     */
    public default int deleteOperLogByIds(String[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_oper_log where oper_id in (#join(ids)#) ",
                SqlParam.create().set("ids", ids));
    }

    /**
     * 查询操作日志详细
     *
     * @param operId 操作ID
     * @return 操作日志对象
     */
    public default SysOperLog selectOperLogById(Long operId) {
        return this.single(operId);
    }

    /**
     * 清空操作日志
     */
    public default void cleanOperLog() {
        this.executeUpdate("truncate table sys_oper_log");
    }


}
