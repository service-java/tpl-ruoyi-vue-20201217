package com.ruoyi.note;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.file.FileReader;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ruoyi.CmsNoteApplication;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.util.text.Convert;
import com.ruoyi.note.domain.NoteCareer;
import com.ruoyi.note.service.NoteCareerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.compress.utils.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-26 11:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CmsNoteApplication.class)
@Slf4j
public class ParseTest {

    @Autowired
    private NoteCareerService noteCareerService;

    @Test
    public void insert() {
        FileReader fileReader = new FileReader("F:\\workspace-summer\\summer-tpl-ruoyi-vue-20201211\\service-cms-note\\src\\test\\java\\com\\ruoyi\\note\\career.json");
        String result = fileReader.readString();

        List<CareerDto> careerDtoList = JSON.parseArray(result, CareerDto.class);
//        log.info("{}", careerDtoList);

        List<NoteCareer> queryList = Lists.newArrayList();
        this.fn(careerDtoList, queryList, null);

//        log.info("{}", JSON.toJSONString(queryList, SerializerFeature.PrettyFormat));
        noteCareerService.saveBatch(queryList);
    }

    @Test
    public void tree() {
        List<NoteCareer> list = noteCareerService.list();

        // 顶层节点
        List<NoteCareer> topList = list.stream().filter(p -> p.getParentId() == null).collect(Collectors.toList());
        for (NoteCareer noteCareer : topList) {
            recursionFn(list, noteCareer);
        }
        log.info("{}", JSON.toJSONString(topList, SerializerFeature.PrettyFormat));
    }

    /**
     * 递归列表
     */
    private void recursionFn(List<NoteCareer> list, NoteCareer t) {
        // 得到子节点列表
        List<NoteCareer> childList = getChildList(list, t);
        t.setChildren(childList);
        for (NoteCareer tChild : childList) {
            if (hasChild(list, tChild)) {
                recursionFn(list, tChild);
            }
        }
    }

    /**
     * 得到子节点列表
     */
    private List<NoteCareer> getChildList(List<NoteCareer> list, NoteCareer t) {
        List<NoteCareer> tlist = new ArrayList<NoteCareer>();
        Iterator<NoteCareer> it = list.iterator();
        while (it.hasNext()) {
            NoteCareer n = it.next();
            if (StringUtils.isNotNull(n.getParentId()) && n.getParentId().longValue() == t.getId().longValue()) {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<NoteCareer> list, NoteCareer t) {
        return getChildList(list, t).size() > 0 ? true : false;
    }


    private void fn(List<CareerDto> list, List<NoteCareer> queryList, Long parentId) {
        for (CareerDto careerDto : list) {
            NoteCareer noteCareer = new NoteCareer();
            noteCareer
                    .setId(careerDto.getValue())
                    .setParentId(parentId)
                    .setName(careerDto.getLabel())
                    .setIsRecommended(Convert.toByte(careerDto.getIs_recommended() ? 1 : 0));

            queryList.add(noteCareer);

            if (CollUtil.isNotEmpty(careerDto.getChildren())) {
                fn(careerDto.getChildren(), queryList, careerDto.getValue());
            }
        }
    }
}
