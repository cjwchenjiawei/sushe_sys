package com.cjw.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.MyClass;
import org.springframework.stereotype.Repository;

@Repository
public interface MyClassMapper extends BaseMapper<MyClass> {
    List<MyClass> findAll();


}