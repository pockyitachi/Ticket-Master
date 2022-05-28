package com.project.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.demo1.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
