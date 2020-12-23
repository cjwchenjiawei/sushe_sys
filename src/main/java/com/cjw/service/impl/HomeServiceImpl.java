package com.cjw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.dao.HomeMapper;
import com.cjw.po.Home;
import com.cjw.service.HomeService;
@Service
public class HomeServiceImpl extends ServiceImpl<HomeMapper, Home> implements HomeService{

    @Autowired
    private HomeMapper homeMapper;

    @Override
    public List<Home> homeList() {
        List<Home> all = homeMapper.findAll();
        return all;
    }
}
