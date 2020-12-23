package com.cjw.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> findAllByUserId(@Param("userId")Integer userId);



}