package com.ruoyi.ext;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import com.ruoyi.ExtApplication;
import com.ruoyi.ext.domain.SysDept;
import com.ruoyi.ext.mapper.SysDeptMapper;
import lombok.extern.slf4j.Slf4j;
import org.beetl.sql.core.query.LambdaQuery;
import org.beetl.sql.core.query.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExtApplication.class)
@Slf4j
public class SysDeptTest {

    @Autowired
    SysDeptMapper sysDeptMapper;

    @Test
    public void test() {
        List<SysDept> list = sysDeptMapper.createLambdaQuery()
                .andLike(SysDept::getDeptName, "%运维%")
                .andEq(SysDept::getDelFlag, 0)
                .select();
        log.info("名字里带'运维'的部门 {}个", list.size());


        List<SysDept> list2 = sysDeptMapper.createLambdaQuery()
                // @fix 日期的诡异之处, 需要把值转换成字符串类型
//                .andLess(SysDept::getCreateTime, DateUtil.parse("2020-12-01"))
                .andLess(SysDept::getCreateTime, DateUtil.parse("2020-12-01").toString("yyyy-MM-dd"))
                .andEq(SysDept::getDelFlag, 0)
                .select();

        log.info("2020-12-01前创建的部门 {}个", list2.size());

        // 给运维部门换个响亮名字
        if (CollUtil.isNotEmpty(list)) {
            SysDept sysDept = list.get(0);
            log.info("修改前 {}", sysDept);

            sysDept.setDeptName(sysDept.getDeptName().replaceAll("运维", "宇宙运维"));
            LambdaQuery<SysDept> lambdaQuery = sysDeptMapper.createLambdaQuery();

            int count = lambdaQuery.andEq(SysDept::getDeptId, sysDept.getDeptId())
                    // MyBatis-Plus的判空是直接多传一个参数做到的, 两相对比之下, 见仁见智吧...
//                    .andLike(SysDept::getDeptName, Query.filterEmpty(null))
                    .andLike(SysDept::getDeptName, Query.filterEmpty("%运维%"))
                    // 这个or和andLike是对应的, 相当于括号里接着写
                    // 这种情况下lambdaQuery得先声明个变量才行了
                    .or(lambdaQuery.condition().andLike(SysDept::getDeptName, Query.filterEmpty("%宇宙%")))
                    .andEq(SysDept::getDelFlag, 0)
                    .updateSelective(sysDept);
            log.info("修改成功{}个, 修改后 {}", count, sysDept);
        }




    }


}


