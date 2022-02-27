package com.mjj.utils;

import com.google.code.kaptcha.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证码校验工具类
 * @author h
 */
public class CodeUtil {
    public static boolean checkVerifyCode(HttpServletRequest request, String verifyCodeActual){
        /**
         * 1.获取用户输入的验证码
         * 2.获取实际生成的验证码
         * 3.对比
         */
        verifyCodeActual = verifyCodeActual.toUpperCase();
        String verifyCodeExpected = (String)request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (verifyCodeActual==null || !verifyCodeActual.equals(verifyCodeExpected)){
            return false;
        }
        return true;


    }
}
