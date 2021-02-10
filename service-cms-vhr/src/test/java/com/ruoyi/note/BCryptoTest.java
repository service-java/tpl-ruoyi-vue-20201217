package com.ruoyi.note;

import cn.hutool.crypto.digest.BCrypt;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-16 12:13
 */
@Slf4j
@SpringBootTest
public class BCryptoTest {

    @Test
    public void isEqual() {
        String gensalt = BCrypt.gensalt();
        log.info(gensalt);

        String hashpw = BCrypt.hashpw("123456", gensalt);
        String hashpw2 = BCrypt.hashpw("123456", gensalt);
        Assert.assertEquals(hashpw, hashpw2);
    }
}
