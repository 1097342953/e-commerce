package com.mjj.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

/**
 * 对称加密工具
 * @author h
 */
public class DESUtils {
    private static Key key;
    //算法：对称加密
    private static final String ALGORITHM ="DES";
    //秘钥种子(相对于盐salt）
    private static final String KEY_STR="myKey";
    //编码格式
    private static final String CHARSET="UTF-8";
    static{
        try{
            //生成DES算法对象
            KeyGenerator generator = KeyGenerator.getInstance(ALGORITHM);
            //运用SHA-1安全策略
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            //为随机安全策略加入秘钥种子
            secureRandom.setSeed(KEY_STR.getBytes());
            //基于安全策略去初始化对象
            generator.init(secureRandom);
            //生成秘钥对象
            key=generator.generateKey();
            generator=null;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 加密
     */

    public static String getEncryptString(String str){
        BASE64Encoder base64Encoder = new BASE64Encoder();
        try {
            byte[] bytes = str.getBytes(CHARSET);
            //获取加密对象
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化加密信息
            /**
             *     public static final int ENCRYPT_MODE = 1;加密模式
             *     public static final int DECRYPT_MODE = 2;解密模式
             */
            cipher.init(Cipher.ENCRYPT_MODE,key);
            //加密
            byte[] secret = cipher.doFinal(bytes);
            return base64Encoder.encode(secret);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    /**
     * 解密
     */
    public static String getDecryptString(String str){
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            byte[] bytes = base64Decoder.decodeBuffer(str);
            //获取解密对象
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            //初始化解密信息
            /**
             *     public static final int ENCRYPT_MODE = 1;加密模式
             *     public static final int DECRYPT_MODE = 2;解密模式
             */
            cipher.init(Cipher.DECRYPT_MODE,key);
            //解密
            byte[] secret = cipher.doFinal(bytes);
            return new String(secret,CHARSET);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        //root WnplV/ietfQ= 123 um461kxL7IU=
        System.out.println(getEncryptString("123"));
        System.out.println(getDecryptString("WnplV/ietfQ="));
    }
}
