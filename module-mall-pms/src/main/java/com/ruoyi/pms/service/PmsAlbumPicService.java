package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsAlbumPic;
import com.ruoyi.pms.mapper.PmsAlbumPicMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsAlbumPicService extends ServiceImpl<PmsAlbumPicMapper, PmsAlbumPic> {


    public int updateBatch(List<PmsAlbumPic> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsAlbumPic> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsAlbumPic> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsAlbumPic record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsAlbumPic record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
