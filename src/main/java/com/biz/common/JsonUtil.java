package com.biz.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil {
    private static Logger LOG = LoggerFactory.getLogger(JsonUtil.class);
    private static ObjectMapper objectMapper = null;

    public JsonUtil() {
    }

    public static String toJson(Object obj) {
        if (obj == null) {
            return null;
        } else {
            try {
                return getObjectMapper().writeValueAsString(obj);
            } catch (Exception var2) {
                throw new IllegalArgumentException(var2.getMessage(), var2);
            }
        }
    }

    public static String toPrettyJson(Object obj) {
        if (obj == null) {
            return null;
        } else {
            try {
                return getObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            } catch (Exception var2) {
                throw new IllegalArgumentException(var2.getMessage(), var2);
            }
        }
    }

    public static <T> T parseJson(String jsonStr, Class<T> valueType) {
        if (StringUtils.isBlank(jsonStr)) {
            return null;
        } else {
            try {
                return getObjectMapper().readValue(jsonStr, valueType);
            } catch (Exception var3) {
                throw new IllegalArgumentException(var3.getMessage(), var3);
            }
        }
    }

    public static <T> T parseJson(String jsonStr, TypeReference<T> typeReference) {
        if (StringUtils.isBlank(jsonStr)) {
            return null;
        } else {
            try {
                return getObjectMapper().readValue(jsonStr, typeReference);
            } catch (Exception var3) {
                throw new IllegalArgumentException(var3.getMessage(), var3);
            }
        }
    }

    private static ObjectMapper getObjectMapper() {
        if (objectMapper == null) {
            try {
                objectMapper = (new JacksonObjectMapperFactory()).getObject();
            } catch (Exception var1) {
                throw new IllegalArgumentException(var1.getMessage(), var1);
            }
        }

        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper om) {
        objectMapper = om;
    }
}
