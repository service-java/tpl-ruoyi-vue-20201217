package com.ruoyi.oss.service;

import com.google.common.collect.Sets;
import com.ruoyi.oss.domain.OssUser;
import com.ruoyi.oss.mapper.OssUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class ShiroService {


    @Autowired
    private OssUserMapper ossUserMapper;


    public Set<String> getUserPermissions(long userId) {
        // @todo
        HashSet<String> permissions = Sets.newHashSet();
        permissions.add("PERMISSION_OSS");
        return permissions;
    }



    public OssUser queryUser(Long userId) {
        return ossUserMapper.selectById(userId);
    }
}
