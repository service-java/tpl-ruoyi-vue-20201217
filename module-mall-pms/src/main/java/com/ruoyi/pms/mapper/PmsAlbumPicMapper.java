package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsAlbumPic;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsAlbumPicMapper extends BaseMapper<PmsAlbumPic> {
    int updateBatch(List<PmsAlbumPic> list);

    int updateBatchSelective(List<PmsAlbumPic> list);

    int batchInsert(@Param("list") List<PmsAlbumPic> list);

    int insertOrUpdate(PmsAlbumPic record);

    int insertOrUpdateSelective(PmsAlbumPic record);
}