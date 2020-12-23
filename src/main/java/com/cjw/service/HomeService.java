package com.cjw.service;

import com.cjw.po.Home;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface HomeService extends IService<Home>{
    List<Home> homeList();

}
