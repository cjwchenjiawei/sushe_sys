package com.cjw.controller;

import com.cjw.dao.StudentMapper;
import com.cjw.po.Student;
import com.cjw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StuController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/ziliao/xs")
    public String students(HttpServletRequest request, HttpSession session){
        String stuName = request.getParameter("stuName");
        String myClassName = request.getParameter("myClassName");
        String homeAddress = request.getParameter("homeAddress");

        List<Student> students = studentService.studentList(stuName, myClassName, homeAddress);
        session.setAttribute("students",students);
        return "xs";
    }

}
