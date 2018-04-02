package com.biz.common;

import java.beans.PropertyDescriptor;
import java.beans.PropertyEditorSupport;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class BeanUtil {
    private static final Logger LOG = LoggerFactory.getLogger(BeanUtil.class);
    private static final Map<Class<?>, Class<? extends PropertyEditorSupport>> PROPERTY_EDITORS = new LinkedHashMap();

    public BeanUtil() {
    }

    public static Map copyProperties(Object source, Map target) {
        BeanWrapper bean = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = bean.getPropertyDescriptors();
        PropertyDescriptor[] pdr = pds;
        int pdsArray = pds.length;

        for(int x = 0; x < pdsArray; ++x) {
            PropertyDescriptor pd = pdr[x];
            String name = pd.getName();
            if (!"class".equals(name)) {
                target.put(name, bean.getPropertyValue(name));
            }
        }

        return target;
    }
}