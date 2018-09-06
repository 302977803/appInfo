package com.jbit.service;

import com.jbit.entity.AppCategory;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3.
 */
public interface AppCategoryService {
    //一级分类
    List<AppCategory> selectAppCategory1();
}
