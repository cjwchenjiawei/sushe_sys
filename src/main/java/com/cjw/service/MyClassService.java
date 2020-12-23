package com.cjw.service;

import com.cjw.po.MyClass;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface MyClassService extends IService<MyClass>{
    List<MyClass> myClassList();

}
