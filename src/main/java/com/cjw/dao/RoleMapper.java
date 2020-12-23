package com.cjw.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper extends BaseMapper<Role> {
    List<Role> findAllByUserId(@Param("userId")Integer userId);


}