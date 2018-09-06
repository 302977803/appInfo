package com.jbit.service;

import com.jbit.entity.DevUser;


public interface DevUserService {
    //登录
    DevUser selectLogin(DevUser record);
}
