package com.ruoyi.cms.domain;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.validator.group.UpdateGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Transient;

import javax.validation.constraints.NotNull;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-16 9:11
 */
@ApiModel
@Data
public class OssUser {
    /**
    * 主键ID
    */
    @TableId
    @ApiModelProperty(value="主键ID")
    @ExcelProperty("用户ID")
    @NotNull(groups = {UpdateGroup.class})
    private Long id;

    /**
    * OSS用户名
    */
    @ApiModelProperty(value="OSS用户名")
    @NotNull(groups = {AddGroup.class})
    @ExcelProperty("用户名")
    private String username;

    /**
    * OSS用户密码
    */
    @ApiModelProperty(value="OSS用户密码")
    @NotNull(groups = {AddGroup.class})
    @ExcelIgnore
    private String password;

    @Transient
    @TableField(exist = false)
    @JsonIgnore
    @ExcelIgnore
    private String uuid;

    @Transient
    @TableField(exist = false)
    @JsonIgnore
    @ExcelIgnore
    private long expireTime;
}
