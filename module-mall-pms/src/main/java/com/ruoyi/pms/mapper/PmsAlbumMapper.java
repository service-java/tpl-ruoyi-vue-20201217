package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsAlbum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsAlbumMapper extends BaseMapper<PmsAlbum> {
    int updateBatch(List<PmsAlbum> list);

    int updateBatchSelective(List<PmsAlbum> list);

    int batchInsert(@Param("list") List<PmsAlbum> list);

    int insertOrUpdate(PmsAlbum record);

    int insertOrUpdateSelective(PmsAlbum record);
}
