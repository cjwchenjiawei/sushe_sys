package com.cjw.dao;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    User findOneByUserNameAndUserPassword(@Param("userName")String userName,@Param("userPassword")String userPassword);


}