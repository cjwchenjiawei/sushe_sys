package com.cjw.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.dao.PermissionMapper;
import com.cjw.po.Permission;
import com.cjw.service.PermissionService;
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService{

}
