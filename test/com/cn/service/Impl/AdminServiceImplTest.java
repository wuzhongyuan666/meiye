package com.cn.service.Impl;

import com.cn.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-*.xml")
public class AdminServiceImplTest {

    @Autowired
    private AdminService adminService;
    @Test
    public void selectAll() {
        System.out.println("121121242");

        System.out.println("1211");
        System.out.println(adminService.selectAll().toString());
    }
}