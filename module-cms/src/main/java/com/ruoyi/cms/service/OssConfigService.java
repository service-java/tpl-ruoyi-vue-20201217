/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.ruoyi.cms.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.gson.Gson;
import com.ruoyi.cms.vo.PageDataVo;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.cms.domain.OssConfig;
import com.ruoyi.cms.mapper.OssConfigMapper;
import com.ruoyi.cms.redis.OssConfigRedisUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 系统配置信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service("OssConfigService")
public class OssConfigService extends ServiceImpl<OssConfigMapper, OssConfig>  {
    @Autowired
    private OssConfigRedisUtils sysConfigRedis;

    @Autowired
    private OssConfigMapper ossConfigMapper;

    // @todo

    public PageDataVo queryPage(Map<String, Object> params) {
  /*      String paramKey = (String)params.get("paramKey");

        IPage<OssConfig> page = this.page(
                new Query<OssConfig>().getPage(params),
                new QueryWrapper<OssConfig>()
                        .like(StringUtils.isNotBlank(paramKey),"param_key", paramKey)
                        .eq("status", 1)
        );

        return new PageUtils(page);*/
        return null;
    }


    public void saveConfig(OssConfig config) {
        this.save(config);
        sysConfigRedis.saveOrUpdate(config);
    }


    @Transactional(rollbackFor = Exception.class)
    public void update(OssConfig config) {
        this.updateById(config);
        sysConfigRedis.saveOrUpdate(config);
    }




    @Transactional(rollbackFor = Exception.class)
    public void updateValueByKey(String key, String value) {
        baseMapper.updateValueByKey(key, value);
        sysConfigRedis.delete(key);
    }



    @Transactional(rollbackFor = Exception.class)
    public void deleteBatch(Long[] ids) {
        for (Long id : ids) {
            OssConfig config = this.getById(id);
            sysConfigRedis.delete(config.getParamKey());
        }

        this.removeByIds(Arrays.asList(ids));
    }


    public String getValue(String key) {
        OssConfig config = sysConfigRedis.get(key);
        if (config == null) {
            config = ossConfigMapper.queryByKey(key);
            sysConfigRedis.saveOrUpdate(config);
        }

        return config == null ? null : config.getParamValue();
    }



    public <T> T getConfigObject(String key, Class<T> clazz) {
        String value = getValue(key);
        if (StringUtils.isNotBlank(value)) {
            return new Gson().fromJson(value, clazz);
        }

        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new CustomException("获取参数失败");
        }
    }


    public int updateBatch(List<OssConfig> list) {
        return baseMapper.updateBatch(list);
    }


    public int updateBatchSelective(List<OssConfig> list) {
        return baseMapper.updateBatchSelective(list);
    }


    public int batchInsert(List<OssConfig> list) {
        return baseMapper.batchInsert(list);
    }


    public int insertOrUpdate(OssConfig record) {
        return baseMapper.insertOrUpdate(record);
    }


    public int insertOrUpdateSelective(OssConfig record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}


