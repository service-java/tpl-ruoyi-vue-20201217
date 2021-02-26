package com.ruoyi.note.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-26 12:16
 */
@ApiModel(value = "com-ruoyi-note-domain-NoteCareer")
@Data
@TableName(value = "note_career")
public class NoteCareer {
    public static final String COL_IS_RECOMMAND = "is_recommand";
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 父级ID(顶层ID为null)
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value = "父级ID(顶层ID为null)")
    private Long parentId;

    /**
     * 是否推荐
     */
    @TableField(value = "is_recommended")
    @ApiModelProperty(value = "是否推荐")
    private Byte isRecommended;

    @TableField(exist = false)
    private List<NoteCareer> children;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_IS_RECOMMENDED = "is_recommended";
}
