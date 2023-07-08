package com.zmy.music.controller;

import com.zmy.music.common.R;
import com.zmy.music.model.request.AdminRequest;
import com.zmy.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class AdmainController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/admin/login/status")
    public R loginStatus(@RequestBody AdminRequest adminRequest, HttpSession session){
//        System.out.println("....123");
//        return R.error("用户名或密码错误");
        return adminService.verityPasswd(adminRequest,session);
    }
}
