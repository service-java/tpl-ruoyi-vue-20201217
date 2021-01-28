package com.ruoyi.cms.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.ruoyi.cms.domain.OssUser;
import com.ruoyi.cms.mapper.OssUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 9:47
 */
@Slf4j
public class OssUserExcelListener extends AnalysisEventListener<OssUser> {
    private static final int BATCH_COUNT = 5;
    List<OssUser> list = new ArrayList<>();

    @Autowired
    private OssUserMapper ossUserMapper;

    // 用于有参构造函数
    public OssUserExcelListener() {

    }

    @Override
    public void invoke(OssUser data, AnalysisContext context) {
        log.info("解析到一条数据:{}", JSON.toJSONString(data));
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            // 存储完成清理 list
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        log.info("所有数据解析完成！");
    }
    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        // ossUserMapper.batchInsert(list);
        log.info("存储数据库成功！");
    }


}
