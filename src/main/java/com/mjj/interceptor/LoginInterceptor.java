package com.mjj.interceptor;

import com.mjj.dto.UserDTO;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录权限拦截器
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        //从session里面获取‘user’对应的对象
        Object userObj = request.getSession().getAttribute("user");
        if(userObj != null){
            //如果用户信息不为null，则将session中的用户信息转换成EmployeeDTO实体对象
            UserDTO userInfo=(UserDTO) userObj;
            //空值以及有效判断(必须在职）
            if(userInfo != null){
                if (requestURI.toLowerCase().indexOf("login")>=0|| "/".equals(requestURI)){
                    if ("0".equals(userInfo.getIdentity())){
                        response.sendRedirect("/main");
                    }else {
                        response.sendRedirect("/manage");
                    }

                    return false;
                }
                return true;
            }
        }
        if (requestURI.toLowerCase().indexOf("login")>=0|| "/".equals(requestURI)){
            return true;
        }
        //如果不满足登录验证的条件，就跳转到登陆页面
        response.sendRedirect("/main");
        return false;

    }
}
