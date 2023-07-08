package com.zmy.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.music.common.R;
import com.zmy.music.mapper.AdminMapper;
import com.zmy.music.model.domain.Admin;
import com.zmy.music.model.request.AdminRequest;
import com.zmy.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public R verityPasswd(AdminRequest adminRequest, HttpSession session) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",adminRequest.getName());
        queryWrapper.eq("password",adminRequest.getPassword());
//        System.out.println("....456");
        if (adminMapper.selectCount(queryWrapper) > 0) {
            session.setAttribute("name", adminRequest.getName());
            return R.success("登录成功");
        } else {
            return R.error("用户名或密码错误");
        }
    }
}
