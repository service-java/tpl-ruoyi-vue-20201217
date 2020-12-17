package com.ruoyi.demo.service;

import java.util.List;

import com.ruoyi.demo.domain.DemoBook;

/**
 * 图书Service接口
 *
 * @author ruoyi
 * @date 2020-12-11
 */
public interface IDemoBookService {
    /**
     * 查询图书
     *
     * @param id 图书ID
     * @return 图书
     */
    public DemoBook selectDemoBookById(Long id);

    /**
     * 查询图书列表
     *
     * @param demoBook 图书
     * @return 图书集合
     */
    public List<DemoBook> selectDemoBookList(DemoBook demoBook);

    /**
     * 新增图书
     *
     * @param demoBook 图书
     * @return 结果
     */
    public int insertDemoBook(DemoBook demoBook);

    /**
     * 修改图书
     *
     * @param demoBook 图书
     * @return 结果
     */
    public int updateDemoBook(DemoBook demoBook);

    /**
     * 批量删除图书
     *
     * @param ids 需要删除的图书ID
     * @return 结果
     */
    public int deleteDemoBookByIds(Long[] ids);

    /**
     * 删除图书信息
     *
     * @param id 图书ID
     * @return 结果
     */
    public int deleteDemoBookById(Long id);
}
