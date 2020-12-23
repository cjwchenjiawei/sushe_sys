package com.cjw.test;

import com.cjw.dao.PermissionMapper;
import com.cjw.dao.UserMapper;
import com.cjw.po.Permission;
import com.cjw.po.User;
import com.cjw.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.Period;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private UserService userService;
    @Test
    public void test(){
        User user = userService.login("sanfeng","123456");
        System.out.println("user = " + user);

    }

    @Test
    public void test1(){
        List<Permission> allByUserId = permissionMapper.findAllByUserId(1);
        System.out.println("allByUserId = " + allByUserId);
    }
}
