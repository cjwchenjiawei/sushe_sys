package com.cjw.service;

import com.cjw.po.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface StudentService extends IService<Student>{
    List<Student>studentList(String stuName,String myClassName,String homeAddress);

}
