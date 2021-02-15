package com.ruoyi.nvc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2021-02-15 15:57
 */
/**
    * 作家邀请码表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcAuthorCode")
@Data
@TableName(value = "nvc_author_code")
public class NvcAuthorCode {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 邀请码
     */
    @TableField(value = "invite_code")
    @ApiModelProperty(value="邀请码")
    private String inviteCode;

    /**
     * 有效时间
     */
    @TableField(value = "validity_time")
    @ApiModelProperty(value="有效时间")
    private Date validityTime;

    /**
     * 是否使用过，0：未使用，1:使用过
     */
    @TableField(value = "is_use")
    @ApiModelProperty(value="是否使用过，0：未使用，1:使用过")
    private Boolean isUse;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 创建人ID
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value="创建人ID")
    private Long createUserId;

    public static final String COL_ID = "id";

    public static final String COL_INVITE_CODE = "invite_code";

    public static final String COL_VALIDITY_TIME = "validity_time";

    public static final String COL_IS_USE = "is_use";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_USER_ID = "create_user_id";
}