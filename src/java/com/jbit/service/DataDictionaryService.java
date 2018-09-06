package com.jbit.service;

import com.jbit.entity.DataDictionary;

import java.util.List;

/**
 * Created by Administrator on 2018/9/3.
 */
public interface DataDictionaryService {
    //app状态
    List<DataDictionary> selectAPP_STATUS();
    //所属平台
    List<DataDictionary> selectAPP_FLATFORM();
}
