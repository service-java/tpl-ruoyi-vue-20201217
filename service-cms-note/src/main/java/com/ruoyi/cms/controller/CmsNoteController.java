package com.ruoyi.cms.controller;

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
@RequestMapping("/api/sync")
@Slf4j
public class CmsNoteController {

    @Autowired
    private CmsNoteService syncNoteService;

    @Autowired
    private CmsUserNoteService syncUserNoteService;

    @Autowired
    private CmsUserNoteMapper syncUserNoteMapper;


    @ApiOperation("listNote")
    @GetMapping("/listNote")
    public ResultVo listNote() {
        List<CmsUserNote> list = syncUserNoteMapper.selectList(
                new QueryWrapper<CmsUserNote>().lambda()
                        .eq(CmsUserNote::getOssUserId, ShiroUtils.getUserId()));

        Set<Integer> collect = list.stream().map(CmsUserNote::getNoteNoteId).collect(Collectors.toSet());

        if (CollUtil.isEmpty(collect)) {
            return ResultVo.success(Collections.EMPTY_LIST);
        }



        return ResultVo.success(syncNoteService.listByIds(collect));
    }


    @ApiOperation("saveNote")
    @PostMapping("/saveNote")
    public ResultVo saveNote(CmsNote syncNote) {
        ValidatorUtils.validateEntity(syncNote, AddGroup.class);

        Long userId = ShiroUtils.getUserEntity().getId();
        log.info("当前用户ID : {}", ShiroUtils.getUserEntity());

        syncNote.setGmtCreate(new Date());
        syncNoteService.save(syncNote);

        CmsUserNote syncUserNote = new CmsUserNote();
        syncUserNote
                .setOssUserId(Convert.toInt(userId))
                .setNoteNoteId((syncNote.getId()));
        syncUserNoteService.save(syncUserNote);
        return ResultVo.success();
    }

}
