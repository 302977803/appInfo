package com.jbit.dao;

import com.jbit.entity.AdPromotion;

public interface AdPromotionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_promotion
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_promotion
     *
     * @mbggenerated
     */
    int insert(AdPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_promotion
     *
     * @mbggenerated
     */
    int insertSelective(AdPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_promotion
     *
     * @mbggenerated
     */
    AdPromotion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_promotion
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdPromotion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_promotion
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdPromotion record);
}