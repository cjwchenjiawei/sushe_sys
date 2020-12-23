package com.cjw.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Date;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {


    List<Student> findAllByStuNameLikeAndMyClassNameLikeAndHomeAddressLike(@Param("likeStuName")String likeStuName,@Param("likeMyClassName")String likeMyClassName,@Param("likeHomeAddress")String likeHomeAddress);


}