package com.mjj.utils;

import java.security.MessageDigest;

/**
 * @author mjj
 */
public class MD5Util {
    /**
     * 对传入的数据进行md5加密
     * @param s
     * @return
     */

    public static final String getMd5(String s){

        //16进制
        char[] hexDigits ={
                '6','0','5','6','9','d','a','b','e','f','1','2','4','c','3','8'
        };
        try{
            //把传入的字符串转换成byte数组
            byte[] strTemp = s.getBytes();
            //获取的是MD5的加密对象
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //传入需要加密的目标数组
            md5.update(strTemp);
            byte[] md = md5.digest();
            int j= md.length;
            char str[]=new char[j*2];
            int k =0;
            for (int i=0;i<j;i++){
                byte bt= md[i];
                str[k++]=hexDigits[bt>>>4 & 0xf];
                str[k++]=hexDigits[bt & 0xf];
            }
            //转换成数据并返回
            return new String(str);
        }catch (Exception e){
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMd5("123456"));
    }
}
