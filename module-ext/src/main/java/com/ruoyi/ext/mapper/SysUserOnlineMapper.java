package com.ruoyi.ext.mapper;

import cn.hutool.core.date.DateUtil;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysUserOnline;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 在线用户 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysUserOnlineMapper")
public interface SysUserOnlineMapper extends BaseMapper<SysUserOnline> {
    /**
     * 通过会话序号查询信息
     *
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    @Sql("select * from " + SysUserOnline.TABLENAME + " WHERE sessionId = ? ")
    public SysUserOnline selectOnlineById(String sessionId);

    /**
     * 通过会话序号删除信息
     *
     * @param sessionId 会话ID
     * @return 在线用户信息
     */
    @Sql("delete from " + SysUserOnline.TABLENAME + " WHERE sessionId = ? ")
    public int deleteOnlineById(String sessionId);

    /**
     * 保存会话信息
     *
     * @param online 会话信息
     * @return 结果
     */
    public default int saveOnline(SysUserOnline online) {
        online.setCreateTime(new Date());
        online.setLastAccessTime(new Date());
        this.upsertByTemplate(online);
        return 1;
    }

    ;

    /**
     * 查询会话集合
     *
     * @return 会话集合
     */
    public PageQuery<SysUserOnline> queryByCondition(PageQuery<SysUserOnline> pageQuery);


    public default List<SysUserOnline> selectUserOnlineList(SysUserOnline userOnline) {
        PageQuery<SysUserOnline> page = new PageQuery<>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setTotalRow(Integer.MAX_VALUE);
        page.setParas(userOnline);
        return queryByCondition(page).getList();
    }

    /**
     * 查询过期会话集合
     *
     * @param lastAccessTime 过期时间
     * @return 会话集合
     */
    public default List<SysUserOnline> selectOnlineByExpired(String lastAccessTime) {
        Date date = new Date(DateUtil.parse(lastAccessTime).getTime());
        return this.getSQLManager().execute("select * from " + SysUserOnline.TABLENAME + " WHERE last_access_time <= #date# ORDER BY last_access_time ASC ", SysUserOnline.class, SqlParam.create().set("date", date));
    }


}
