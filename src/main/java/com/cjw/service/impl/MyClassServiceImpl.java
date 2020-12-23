package com.cjw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.po.MyClass;
import com.cjw.dao.MyClassMapper;
import com.cjw.service.MyClassService;
@Service
public class MyClassServiceImpl extends ServiceImpl<MyClassMapper, MyClass> implements MyClassService{

    @Autowired
    private MyClassMapper myClassMapper;

    @Override
    public List<MyClass> myClassList() {
        List<MyClass> all = myClassMapper.findAll();
        return all;
    }
}
