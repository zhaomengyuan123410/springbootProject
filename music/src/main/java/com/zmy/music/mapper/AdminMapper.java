package com.zmy.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zmy.music.model.domain.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper  extends BaseMapper<Admin> {
    //Mapper 接口并不是一个普通的接口，而是一个包含 SQL 语句的映射文件。
}