package com.cjw.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.po.Role;
import com.cjw.dao.RoleMapper;
import com.cjw.service.RoleService;
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService{

}
