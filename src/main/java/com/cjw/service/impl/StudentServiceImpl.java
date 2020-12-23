package com.cjw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.dao.StudentMapper;
import com.cjw.po.Student;
import com.cjw.service.StudentService;
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> studentList(String stuName,String myClassName,String homeAddress) {
        List<Student> students = studentMapper.findAllByStuNameLikeAndMyClassNameLikeAndHomeAddressLike(stuName, myClassName, homeAddress);
        return students;
    }
}
