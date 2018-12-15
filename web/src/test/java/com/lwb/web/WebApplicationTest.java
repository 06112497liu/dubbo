package com.lwb.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lwb.dubbo.api.UserService;
import com.lwb.dubbo.api.reponse.entity.ResponseEntity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuweibo
 * @date 2018/12/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WebApplicationTest {

    @Reference
    UserService userService;

    @Test
    public void test1() {
        ResponseEntity user = this.userService.getUser(1073819431164190722L);
        System.out.println(user);
    }

}
