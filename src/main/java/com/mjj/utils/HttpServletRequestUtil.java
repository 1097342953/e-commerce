package com.mjj.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * HttpServletRequest工具类
 * @author h
 */
public class HttpServletRequestUtil {

    public static int getInt(HttpServletRequest request,String key){
        try {
            return Integer.decode(request.getParameter(key));
        }catch(Exception e){
            return -1;
        }
    }

    public static long getLong(HttpServletRequest request,String key){
        try {
            return Long.valueOf(request.getParameter(key));
        }catch(Exception e){
            return -1;
        }
    }

    public static double getDouble(HttpServletRequest request,String key){
        try {
            return Double.valueOf(request.getParameter(key));
        }catch(Exception e){
            return -1;
        }
    }

    public static boolean getBoolean(HttpServletRequest request,String key){
        try {
            return Boolean.valueOf(request.getParameter(key));
        }catch(Exception e){
            return false;
        }
    }

    public static String getString(HttpServletRequest request,String key){
        try {
            String parameter = request.getParameter(key);
            if(null!=parameter){
                parameter= parameter.trim();
                if ("".equals(parameter)) {
                    return null;
                }
                return parameter;
            }

            return parameter;
        }catch(Exception e){
            return null;
        }
    }
}
