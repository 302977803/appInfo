package com.jbit.service.impl;

import com.jbit.dao.DataDictionaryMapper;
import com.jbit.entity.DataDictionary;
import com.jbit.service.DataDictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/9/3.
 */
@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    @Override
    public List<DataDictionary> selectAPP_STATUS() {
        return dataDictionaryMapper.selectAPP_STATUS();
    }

    @Override
    public List<DataDictionary> selectAPP_FLATFORM() {
        return dataDictionaryMapper.selectAPP_FLATFORM();
    }
}
