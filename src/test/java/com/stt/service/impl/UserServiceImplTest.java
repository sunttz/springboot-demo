package com.stt.service.impl;

import com.stt.entity.User;
import com.stt.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by taotaosun on 2017/4/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void selectAll() throws Exception {
        List<User> users = userService.selectAll();
        System.out.println(users);
    }


}