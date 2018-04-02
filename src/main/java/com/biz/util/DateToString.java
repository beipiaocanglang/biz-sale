package com.biz.util;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString implements Converter<Date, String> {

    public String convert(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {

            return simpleDateFormat.format(date);
        } catch (Exception ex) {
            return null;
        }


    }
}
