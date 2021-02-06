package com.ruoyi.ext.feign;

import com.alibaba.fastjson.JSONObject;
import com.ruoyi.common.vo.ResultVo;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.multipart.MultipartFile;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 14:58
 */
public interface FeignService {

    @RequestLine("POST /oss/upload")
    JSONObject upload(@Param("file") MultipartFile file);

    @RequestLine("GET /oss/page")
//    ResultVo page(Map<String, Object> userMap);
    ResultVo page(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
