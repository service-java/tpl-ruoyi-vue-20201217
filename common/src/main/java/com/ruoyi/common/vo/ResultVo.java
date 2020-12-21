package com.ruoyi.common.vo;

import java.util.HashMap;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.constant.HttpStatusConstants;
import com.ruoyi.common.util.StringUtils;

/**
 * 操作消息提醒
 *
 * @author ruoyi
 */
public class ResultVo extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";

    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";

    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public ResultVo() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public ResultVo(int code, String msg) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public ResultVo(int code, String msg, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data)) {
            super.put(DATA_TAG, data);
        }
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static ResultVo success() {
        return ResultVo.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static ResultVo success(Object data) {
        return ResultVo.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static ResultVo success(String msg) {
        return ResultVo.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static ResultVo success(String msg, Object data) {
        return new ResultVo(0, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static ResultVo error() {
        return ResultVo.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static ResultVo error(String msg) {
        return ResultVo.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static ResultVo error(String msg, Object data) {
        return new ResultVo(HttpStatusConstants.ERROR, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static ResultVo error(int code, String msg) {
        return new ResultVo(code, msg, null);
    }

    public static ResultVo responseByRows(int rows) {
        return rows > 0 ? ResultVo.success() : ResultVo.error();
    }
    public static ResultVo responseByBool(Boolean isOk) {
        return isOk ? ResultVo.success() : ResultVo.error();
    }

    /**
     * 给AjaxResult扩展方法
     */
    public ResultVo set(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public ResultVo setCode(int code) {
        super.put(CODE_TAG, code);
        return this;
    }

    public ResultVo setMsg(String msg) {
        super.put(MSG_TAG, msg);
        return this;
    }

    public ResultVo setData(Object data) {
        super.put(DATA_TAG, data);
        return this;
    }

}
