package com.cjw.controller;

import com.cjw.po.Home;
import com.cjw.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RoomController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/room/xx")
    public String Rooms(HttpSession session){
        List<Home> homes = homeService.homeList();
        session.setAttribute("homes",homes);
        return "room";
    }
}
