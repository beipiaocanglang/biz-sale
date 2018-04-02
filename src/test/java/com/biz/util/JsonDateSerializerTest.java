package com.biz.util;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.*;

public class JsonDateSerializerTest {
    @Test
    public void serialize() throws Exception {



         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm zzz", Locale.SIMPLIFIED_CHINESE);

        Date date = new Date();

        String string = dateFormat.format(date);

        String asd= "";

    }

}