package com.data.source.multi.demo.service.serviceImpl;

import com.data.source.multi.demo.config.DataSource;
import com.data.source.multi.demo.config.MybatisConfig;
import com.data.source.multi.demo.entity.User;
import com.data.source.multi.demo.mapper.shiro.UserMapper;
import com.data.source.multi.demo.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserService implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @DataSource(MybatisConfig.MASTER)
    @Transactional
    public User getUserByName(String userName) {
        return userMapper.selectByUserName(userName);
    }
}
