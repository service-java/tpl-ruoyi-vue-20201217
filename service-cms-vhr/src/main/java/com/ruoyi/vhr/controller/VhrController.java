package com.ruoyi.vhr.controller;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruoyi.cms.shiro.ShiroUtils;
import com.ruoyi.common.util.text.Convert;
import com.ruoyi.common.validator.ValidatorUtils;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.vo.ResultVo;

import com.ruoyi.cms.domain.CmsNote;
import com.ruoyi.cms.domain.CmsUserNote;
import com.ruoyi.cms.mapper.CmsUserNoteMapper;
import com.ruoyi.cms.service.CmsNoteService;
import com.ruoyi.cms.service.CmsUserNoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 10:16
 */
@Api(tags="云同步笔记模块")
@RestController
@RequestMapping("/api/vhr")
@Slf4j
public class VhrController {


}
