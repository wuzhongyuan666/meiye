package com.cn.controller;

import com.cn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    @ResponseBody
    public Object selectAll(){
        return adminService.selectAll();
    }
}
