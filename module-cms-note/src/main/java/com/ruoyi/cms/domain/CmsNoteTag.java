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
@ApiModel(value="com-ruoyi-note-domain-CmsNoteTag")
@Data
@TableName(value = "cms_note_tag")
public class CmsNoteTag implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "note_id")
    @ApiModelProperty(value="")
    private Integer noteId;

    @TableField(value = "tag_id")
    @ApiModelProperty(value="")
    private Integer tagId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NOTE_ID = "note_id";

    public static final String COL_TAG_ID = "tag_id";
}
