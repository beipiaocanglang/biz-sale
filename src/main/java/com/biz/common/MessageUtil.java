package com.biz.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

public class MessageUtil {

    private static final Logger LOG = LoggerFactory.getLogger(MessageUtil.class);
    private static MessageSource messageSource;

    public MessageUtil() {
    }

    public static String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        checkInit();

        try {
            return messageSource.getMessage(code, args, defaultMessage, locale);
        } catch (NoSuchMessageException var5) {
            LOG.debug(var5.getMessage(), var5);
            return null;
        }
    }

    public static String getMessage(String code, Object[] args, String defaultMessage) {
        checkInit();

        try {
            return messageSource.getMessage(code, args, defaultMessage, Locale.getDefault());
        } catch (NoSuchMessageException var4) {
            LOG.debug(var4.getMessage(), var4);
            return null;
        }
    }

    public static String getMessage(String code, Object[] args, Locale locale) {
        checkInit();

        try {
            return messageSource.getMessage(code, args, locale);
        } catch (NoSuchMessageException var4) {
            LOG.debug(var4.getMessage(), var4);
            return null;
        }
    }

    public static String getMessage(String code, Object[] args) {
        checkInit();

        try {
            return messageSource.getMessage(code, args, Locale.getDefault());
        } catch (NoSuchMessageException var3) {
            LOG.debug(var3.getMessage(), var3);
            return null;
        }
    }

    public static String getMessage(String code) {
        checkInit();

        try {
            return messageSource.getMessage(code, (Object[])null, Locale.getDefault());
        } catch (NoSuchMessageException var2) {
            LOG.debug(var2.getMessage(), var2);
            return null;
        }
    }

    private static void checkInit() {
        if (messageSource == null) {
            throw new IllegalStateException("messageSource not initialized");
        }
    }

    public void setMessageSource(MessageSource ms) {
        messageSource = ms;
    }

    public static MessageSource getMessageSource() {
        return messageSource;
    }

}
