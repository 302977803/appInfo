package com.jbit.service.impl;

import com.jbit.dao.DevUserMapper;
import com.jbit.entity.DevUser;
import com.jbit.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/3.
 */
@Service("devUserService")
public class DevUserServiceImpl implements DevUserService{
    @Resource
    private DevUserMapper devUserMapper;
    @Override
    public DevUser selectLogin(DevUser record) {
        return devUserMapper.selectLogin(record);
    }
}
