package com.ruoyi.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.demo.mapper.DemoBookMapper;
import com.ruoyi.demo.domain.DemoBook;
import com.ruoyi.demo.service.IDemoBookService;

/**
 * 图书Service业务层处理
 *
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
public class DemoBookServiceImpl implements IDemoBookService {
    @Autowired
    private DemoBookMapper demoBookMapper;

    /**
     * 查询图书
     *
     * @param id 图书ID
     * @return 图书
     */
    @Override
    public DemoBook selectDemoBookById(Long id) {
        return demoBookMapper.selectDemoBookById(id);
    }

    /**
     * 查询图书列表
     *
     * @param demoBook 图书
     * @return 图书
     */
    @Override
    public List<DemoBook> selectDemoBookList(DemoBook demoBook) {
        return demoBookMapper.selectDemoBookList(demoBook);
    }

    /**
     * 新增图书
     *
     * @param demoBook 图书
     * @return 结果
     */
    @Override
    public int insertDemoBook(DemoBook demoBook) {
        return demoBookMapper.insertDemoBook(demoBook);
    }

    /**
     * 修改图书
     *
     * @param demoBook 图书
     * @return 结果
     */
    @Override
    public int updateDemoBook(DemoBook demoBook) {
        return demoBookMapper.updateDemoBook(demoBook);
    }

    /**
     * 批量删除图书
     *
     * @param ids 需要删除的图书ID
     * @return 结果
     */
    @Override
    public int deleteDemoBookByIds(Long[] ids) {
        return demoBookMapper.deleteDemoBookByIds(ids);
    }

    /**
     * 删除图书信息
     *
     * @param id 图书ID
     * @return 结果
     */
    @Override
    public int deleteDemoBookById(Long id) {
        return demoBookMapper.deleteDemoBookById(id);
    }
}
