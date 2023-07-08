package com.zmy.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmy.music.common.R;
import com.zmy.music.model.domain.Admin;
import com.zmy.music.model.request.AdminRequest;

import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

public interface AdminService extends IService<Admin>{
    R verityPasswd(AdminRequest adminRequest, HttpSession session);
}
