package com.biz.common;

import java.util.UUID;

public class IDUtils {
    public IDUtils() {
    }

    /**
     * UUID生成
     * @return
     */
    public static String genratorCode() {
        UUID ui = UUID.randomUUID();
        return ui.toString().replaceAll("-", "");
    }

    /**
     * 获取当前时间
     */
    public static String currentTimeMillis(){
        String currentTimeMillis = System.currentTimeMillis()+"";
        return currentTimeMillis;
    }
}
