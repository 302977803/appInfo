package com.jbit.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/9/2.
 */
public class StringtoDateConverter implements Converter<String,Date>{
    private String Pattern;

    public StringtoDateConverter(String pattern) {
        Pattern = pattern;
    }

    @Override
    public Date convert(String s) {
        SimpleDateFormat dateFormat=new SimpleDateFormat(Pattern);
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
