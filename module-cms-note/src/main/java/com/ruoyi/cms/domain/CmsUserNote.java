package com.ruoyi.cms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2021-02-07 1:12
 */
@ApiModel(value="com-ruoyi-note-domain-CmsUserNote")
@Data
@TableName(value = "cms_user_note")
public class CmsUserNote implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "oss_user_id")
    @ApiModelProperty(value="")
    private Integer ossUserId;

    @TableField(value = "note_note_id")
    @ApiModelProperty(value="")
    private Integer noteNoteId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_OSS_USER_ID = "oss_user_id";

    public static final String COL_NOTE_NOTE_ID = "note_note_id";
}
