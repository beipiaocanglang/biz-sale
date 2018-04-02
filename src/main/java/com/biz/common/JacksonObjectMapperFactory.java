package com.biz.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class JacksonObjectMapperFactory implements FactoryBean<ObjectMapper> {
    private String dateFormat = "yyyy-MM-dd HH:mm:ss";

    public JacksonObjectMapperFactory() {
    }

    public ObjectMapper getObject() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat(this.dateFormat));
        objectMapper.setTimeZone(TimeZone.getDefault());
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return objectMapper;
    }

    public Class<?> getObjectType() {
        return ObjectMapper.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
}

