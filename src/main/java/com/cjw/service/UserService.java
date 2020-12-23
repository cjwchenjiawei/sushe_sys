package com.cjw.service;

import com.cjw.po.User;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{

    User login(String userName,String userPassword);

}
