package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ruoyi.cms.domain.OssUser;
import com.ruoyi.cms.mapper.OssUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-16 9:11
 */
@Service
public class OssUserService extends ServiceImpl<OssUserMapper, OssUser> {

    @Resource
    private OssUserMapper ossUserMapper;



    public int deleteByPrimaryKey(Long id) {
        return ossUserMapper.deleteByPrimaryKey(id);
    }


    public int insert(OssUser record) {
        return ossUserMapper.insert(record);
    }


    public int insertOrUpdate(OssUser record) {
        return ossUserMapper.insertOrUpdate(record);
    }


    public int insertOrUpdateSelective(OssUser record) {
        return ossUserMapper.insertOrUpdateSelective(record);
    }


    public int insertSelective(OssUser record) {
        return ossUserMapper.insertSelective(record);
    }



    public OssUser selectByPrimaryKey(Long id) {
        return ossUserMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(OssUser record) {
        return ossUserMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(OssUser record) {
        return ossUserMapper.updateByPrimaryKey(record);
    }


    public int updateBatch(List<OssUser> list) {
        return ossUserMapper.updateBatch(list);
    }


    public int updateBatchSelective(List<OssUser> list) {
        return ossUserMapper.updateBatchSelective(list);
    }


    public int batchInsert(List<OssUser> list) {
        return ossUserMapper.batchInsert(list);
    }

}
