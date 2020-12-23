package com.cjw.service.impl;

import com.cjw.dao.PermissionMapper;
import com.cjw.po.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.po.User;
import com.cjw.dao.UserMapper;
import com.cjw.service.UserService;
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;


    @Override
    public User login(String userName, String userPassword) {
        User user = userMapper.findOneByUserNameAndUserPassword(userName, userPassword);
        List<Permission> permissions = permissionMapper.findAllByUserId(user.getUserId());
        user.setPermissions(permissions);
        return user;
    }
}
