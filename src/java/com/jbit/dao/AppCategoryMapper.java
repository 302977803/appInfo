package com.jbit.dao;

import com.jbit.entity.AppCategory;

import java.util.List;

public interface AppCategoryMapper {
    //一级分类
    List<AppCategory> selectAppCategory1();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int insert(AppCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int insertSelective(AppCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    AppCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppCategory record);
}