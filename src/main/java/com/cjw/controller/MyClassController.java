package com.cjw.controller;

import com.cjw.po.MyClass;
import com.cjw.service.MyClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MyClassController {

    @Autowired
    private MyClassService myClassService;

    @RequestMapping("/ziliao/bj")
    public String myClass(HttpSession session){
        List<MyClass> myClasses = myClassService.myClassList();
        session.setAttribute("myClasses",myClasses);
        return "bj";
    }
}
