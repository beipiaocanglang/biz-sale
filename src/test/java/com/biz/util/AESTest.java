package com.biz.util;

import com.biz.domain.SaleMainData;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by suyi on 2017/12/5.
 */
public class AESTest {
    @Test
    public void aesEncrypt() throws Exception {
        String content = "DouXing2017";
        System.out.println("加密前：" + content);

        String key = "123456";
        System.out.println("加密密钥和解密密钥：" + key);

        String encrypt = AES.aesEncrypt(content, key);
        System.out.println("加密后：" + encrypt);

        assertEquals("stLEywX13EVhsA3jT6E20Q==",encrypt);

    }

    @Test
    public void aesDecrypt() throws Exception {


                String content = "qmlSyCRy9pqAr2ERkjSf8Q==";
        System.out.println("解密前：" + content);

        String key = "123456";
        System.out.println("加密密钥和解密密钥：" + key);



        String decrypt = AES.aesDecrypt(content, key);
        System.out.println("解密后：" + decrypt);

        assertEquals("我爱你",decrypt);
    }

    @Test
    public void someTest()throws Exception{


        SaleMainData asd = new SaleMainData();
        String asasdd="";

    }

}