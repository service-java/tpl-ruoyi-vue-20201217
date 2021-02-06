package com.ruoyi.cms.shiro;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class ShiroService {

    public Set<String> getUserPermissions(long userId) {
        // @todo
        HashSet<String> permissions = Sets.newHashSet();
        permissions.add("PERMISSION_OSS");
        return permissions;
    }

}
