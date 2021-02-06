package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysNotice;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 公告 数据层
 *
 * @author ruoyi
 */

@SqlResource("SysNoticeMapper")
public interface SysNoticeMapper extends BaseMapper<SysNotice> {


    /**
     * 查询公告列表
     *
     * @param notice 公告信息
     * @return 公告集合
     */

    public PageQuery<SysNotice> queryByCondition(PageQuery<SysNotice> pageQuery);

    public default List<SysNotice> selectNoticeList(SysNotice notice) {
        PageQuery<SysNotice> page = new PageQuery<SysNotice>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(notice);
        return queryByCondition(page).getList();
    }

    /**
     * 查询公告信息
     *
     * @param noticeId 公告ID
     * @return 公告信息
     */
    public default SysNotice selectNoticeById(Long noticeId) {
        return this.single(noticeId);
    }

    /**
     * 新增公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    public default int insertNotice(SysNotice notice) {
        notice.setCreateTime(new Date());
        this.insert(notice, true);
        return 1;
    }

    /**
     * 修改公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    public default int updateNotice(SysNotice notice) {
        return this.updateTemplateById(notice);
    }

    /**
     * 批量删除公告
     *
     * @param noticeIds 需要删除的数据ID
     * @return 结果
     */
    public default int deleteNoticeByIds(String[] noticeIds) {
        return this.getSQLManager().executeUpdate("delete from sys_notice where notice_id in (#join(ids)#) ", SqlParam.create().set("ids", noticeIds));
    }
}
