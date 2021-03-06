package com.jbit.service.impl;

import com.jbit.dao.AppCategoryMapper;
import com.jbit.entity.AppCategory;
import com.jbit.service.AppCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/3.
 */
@Service("appCategoryService")
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryMapper appCategoryMapper;
    @Override
    public List<AppCategory> selectAppCategory1() {
        return appCategoryMapper.selectAppCategory1();
    }
}
