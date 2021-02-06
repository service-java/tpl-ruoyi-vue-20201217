package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysPost;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 岗位信息 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysPostMapper")
public interface SysPostMapper extends BaseMapper<SysPost> {
    /**
     * 查询岗位数据集合
     *
     * @param post 岗位信息
     * @return 岗位数据集合
     */
    public PageQuery<SysPost> queryByCondition(PageQuery<SysPost> pageQuery);


    public default List<SysPost> selectPostList(SysPost post) {
        PageQuery<SysPost> page = new PageQuery<SysPost>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(post);
        return queryByCondition(page).getList();
    }

    /**
     * 查询所有岗位
     *
     * @return 岗位列表
     */
    public default List<SysPost> selectPostAll() {
        return this.all();
    }

    /**
     * 根据用户ID查询岗位
     *
     * @param userId 用户ID
     * @return 岗位列表
     */
    @Sql("SELECT p.post_id, p.post_name, p.post_code\r\n" +
            "		FROM sys_user u\r\n" +
            "			 LEFT JOIN sys_user_post up ON u.user_id = up.user_id\r\n" +
            "			 LEFT JOIN sys_post p ON up.post_id = p.post_id\r\n" +
            "		WHERE up.user_id = ? ")
    public List<SysPost> selectPostsByUserId(Long userId);

    /**
     * 通过岗位ID查询岗位信息
     *
     * @param postId 岗位ID
     * @return 角色对象信息
     */
    public default SysPost selectPostById(Long postId) {
        return this.single(postId);
    }

    /**
     * 批量删除岗位信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public default int deletePostByIds(Long[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_post where post_id in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 修改岗位信息
     *
     * @param post 岗位信息
     * @return 结果
     */
    public default int updatePost(SysPost post) {
        post.setUpdateTime(new Date());
        return this.updateTemplateById(post);
    }

    /**
     * 新增岗位信息
     *
     * @param post 岗位信息
     * @return 结果
     */
    public default int insertPost(SysPost post) {
        post.setCreateTime(new Date());
        this.insertTemplate(post, true);
        return 1;
    }

    /**
     * 校验岗位名称
     *
     * @param postName 岗位名称
     * @return 结果
     */
    @Sql("select * from sys_post where post_name = ?")
    public SysPost checkPostNameUnique(String postName);

    /**
     * 校验岗位编码
     *
     * @param postCode 岗位编码
     * @return 结果
     */
    @Sql("select * from sys_post where post_code = ?")
    public SysPost checkPostCodeUnique(String postCode);


}
