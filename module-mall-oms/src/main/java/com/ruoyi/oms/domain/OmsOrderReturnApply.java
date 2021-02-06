package com.ruoyi.oms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
/**
    * 订单退货申请
    */
@ApiModel(value="com-ruoyi-oms-domain-OmsOrderReturnApply")
@Data
@TableName(value = "oms_order_return_apply")
public class OmsOrderReturnApply {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
     * 收货地址表id
     */
    @TableField(value = "company_address_id")
    @ApiModelProperty(value="收货地址表id")
    private Long companyAddressId;

    /**
     * 退货商品id
     */
    @TableField(value = "product_id")
    @ApiModelProperty(value="退货商品id")
    private Long productId;

    /**
     * 订单编号
     */
    @TableField(value = "order_sn")
    @ApiModelProperty(value="订单编号")
    private String orderSn;

    /**
     * 申请时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="申请时间")
    private Date createTime;

    /**
     * 会员用户名
     */
    @TableField(value = "member_username")
    @ApiModelProperty(value="会员用户名")
    private String memberUsername;

    /**
     * 退款金额
     */
    @TableField(value = "return_amount")
    @ApiModelProperty(value="退款金额")
    private BigDecimal returnAmount;

    /**
     * 退货人姓名
     */
    @TableField(value = "return_name")
    @ApiModelProperty(value="退货人姓名")
    private String returnName;

    /**
     * 退货人电话
     */
    @TableField(value = "return_phone")
    @ApiModelProperty(value="退货人电话")
    private String returnPhone;

    /**
     * 申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    /**
     * 处理时间
     */
    @TableField(value = "handle_time")
    @ApiModelProperty(value="处理时间")
    private Date handleTime;

    /**
     * 商品图片
     */
    @TableField(value = "product_pic")
    @ApiModelProperty(value="商品图片")
    private String productPic;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
     * 商品品牌
     */
    @TableField(value = "product_brand")
    @ApiModelProperty(value="商品品牌")
    private String productBrand;

    /**
     * 商品销售属性：颜色：红色；尺码：xl;
     */
    @TableField(value = "product_attr")
    @ApiModelProperty(value="商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;

    /**
     * 退货数量
     */
    @TableField(value = "product_count")
    @ApiModelProperty(value="退货数量")
    private Integer productCount;

    /**
     * 商品单价
     */
    @TableField(value = "product_price")
    @ApiModelProperty(value="商品单价")
    private BigDecimal productPrice;

    /**
     * 商品实际支付单价
     */
    @TableField(value = "product_real_price")
    @ApiModelProperty(value="商品实际支付单价")
    private BigDecimal productRealPrice;

    /**
     * 原因
     */
    @TableField(value = "reason")
    @ApiModelProperty(value="原因")
    private String reason;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="描述")
    private String description;

    /**
     * 凭证图片，以逗号隔开
     */
    @TableField(value = "proof_pics")
    @ApiModelProperty(value="凭证图片，以逗号隔开")
    private String proofPics;

    /**
     * 处理备注
     */
    @TableField(value = "handle_note")
    @ApiModelProperty(value="处理备注")
    private String handleNote;

    /**
     * 处理人员
     */
    @TableField(value = "handle_man")
    @ApiModelProperty(value="处理人员")
    private String handleMan;

    /**
     * 收货人
     */
    @TableField(value = "receive_man")
    @ApiModelProperty(value="收货人")
    private String receiveMan;

    /**
     * 收货时间
     */
    @TableField(value = "receive_time")
    @ApiModelProperty(value="收货时间")
    private Date receiveTime;

    /**
     * 收货备注
     */
    @TableField(value = "receive_note")
    @ApiModelProperty(value="收货备注")
    private String receiveNote;

    public static final String COL_ID = "id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_COMPANY_ADDRESS_ID = "company_address_id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_ORDER_SN = "order_sn";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_MEMBER_USERNAME = "member_username";

    public static final String COL_RETURN_AMOUNT = "return_amount";

    public static final String COL_RETURN_NAME = "return_name";

    public static final String COL_RETURN_PHONE = "return_phone";

    public static final String COL_STATUS = "status";

    public static final String COL_HANDLE_TIME = "handle_time";

    public static final String COL_PRODUCT_PIC = "product_pic";

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_PRODUCT_BRAND = "product_brand";

    public static final String COL_PRODUCT_ATTR = "product_attr";

    public static final String COL_PRODUCT_COUNT = "product_count";

    public static final String COL_PRODUCT_PRICE = "product_price";

    public static final String COL_PRODUCT_REAL_PRICE = "product_real_price";

    public static final String COL_REASON = "reason";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_PROOF_PICS = "proof_pics";

    public static final String COL_HANDLE_NOTE = "handle_note";

    public static final String COL_HANDLE_MAN = "handle_man";

    public static final String COL_RECEIVE_MAN = "receive_man";

    public static final String COL_RECEIVE_TIME = "receive_time";

    public static final String COL_RECEIVE_NOTE = "receive_note";
}
