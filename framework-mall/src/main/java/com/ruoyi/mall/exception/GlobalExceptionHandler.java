package com.ruoyi.mall.exception;

import com.ruoyi.common.constant.HttpStatusConstants;
import com.ruoyi.common.exception.BaseException;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.common.exception.DemoModeException;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.vo.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 全局异常处理器
 *
 * @author ruoyi
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 基础异常
     */
    @ExceptionHandler(BaseException.class)
    public ResultVo baseException(BaseException e) {
        return ResultVo.error(e.getMessage());
    }

    /**
     * 业务异常
     */
    @ExceptionHandler(CustomException.class)
    public ResultVo businessException(CustomException e) {
        if (StringUtils.isNull(e.getCode())) {
            return ResultVo.error(e.getMessage());
        }
        return ResultVo.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResultVo handlerNoFoundException(Exception e) {
        log.error(e.getMessage(), e);
        return ResultVo.error(HttpStatusConstants.NOT_FOUND, "路径不存在，请检查路径是否正确");
    }


    @ExceptionHandler(DuplicateKeyException.class)
    public ResultVo handlerDuplicateKeyException(Exception e) {
        log.error(e.getMessage(), e);
        return ResultVo.error(HttpStatusConstants.ERROR, "编码重复, 操作失败");
    }


    @ExceptionHandler(Exception.class)
    public ResultVo handleException(Exception e) {
        log.error(e.getMessage(), e);
        return ResultVo.error(e.getMessage());
    }

    /**
     * 自定义验证异常
     */
    @ExceptionHandler(BindException.class)
    public ResultVo validatedBindException(BindException e) {
        log.error(e.getMessage(), e);
        String message = e.getAllErrors().get(0).getDefaultMessage();
        return ResultVo.error(message);
    }

    /**
     * 自定义验证异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object validExceptionHandler(MethodArgumentNotValidException e) {
        log.error(e.getMessage(), e);
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        return ResultVo.error(message);
    }

    /**
     * 演示模式异常
     */
    @ExceptionHandler(DemoModeException.class)
    public ResultVo demoModeException(DemoModeException e) {
        return ResultVo.error("演示模式，不允许操作");
    }
}
