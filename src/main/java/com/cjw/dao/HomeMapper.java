package com.cjw.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.Home;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeMapper extends BaseMapper<Home> {
    List<Home> findAll();


}