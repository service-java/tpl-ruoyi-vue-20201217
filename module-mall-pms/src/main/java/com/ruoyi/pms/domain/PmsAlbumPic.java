package com.ruoyi.pms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
/**
    * 画册图片表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsAlbumPic")
@Data
@TableName(value = "pms_album_pic")
public class PmsAlbumPic {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "album_id")
    @ApiModelProperty(value="")
    private Long albumId;

    @TableField(value = "pic")
    @ApiModelProperty(value="")
    private String pic;

    public static final String COL_ID = "id";

    public static final String COL_ALBUM_ID = "album_id";

    public static final String COL_PIC = "pic";
}