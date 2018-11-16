package com.hyx.user.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;


/**
 * MD5通用类
 *
 * @author hyx
 */
public class MD5Util {
    /**
     * MD5方法
     *
     * @param password 明文密码
     * @param key  密钥
     * @return 密文
     * @throws Exception
     */
    public static String encode(String password, String key) {
        //加密后的字符串
        String encodeStr = DigestUtils.md5Hex(password + key);
//        System.out.println("MD5加密后的字符串为:encodeStr="+encodeStr);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param password 明文密码
     * @param key  密钥
     * @param md5  密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String password, String key, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = encode(password, key);
        if (md5Text.equalsIgnoreCase(md5)) {
//            System.out.println("MD5验证通过");
            return true;
        }

        return false;
    }

    /**
     * 获取系统管理员密钥
     *
     * @return
     */
    public static String getAdminKey() {
        return UUID.randomUUID().toString();
    }
}