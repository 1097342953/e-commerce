package com.mjj.controller;

import com.mjj.dto.UserDTO;
import com.mjj.dto.requestDTO.LoginRequestDTO;
import com.mjj.entity.User;
import com.mjj.service.UserService;
import com.mjj.utils.CodeUtil;
import com.mjj.utils.MD5Util;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mjj
 */
@Controller
public class IndexController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "主页路由",httpMethod = "GET",response = String.class)
    @GetMapping("/main")
    public String main() {
        return "/main";
    }

    @ApiOperation(value = "后台管理路由",httpMethod = "GET",response = String.class)
    @GetMapping("/manage")
    public String manage() {
        return "/managePage";
    }

    @ApiOperation(value = "登录路由",httpMethod = "GET",response = String.class)
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @ApiOperation(value = "验证登录")
    @PostMapping("/checkLogin")
    @ResponseBody
    public Map<String, Object> checkLogin(@RequestBody LoginRequestDTO loginRequestDTO) {
        Map<String, Object> map = new HashMap<>();
        /**
         * 1.判断是否需要验证码校验
         * 2.如果需要就将用户输入的验证码信息与实际生成的验证码做对比
         */
        boolean needVerify =loginRequestDTO.getNeedVerify();
        if (needVerify && !CodeUtil.checkVerifyCode(request,loginRequestDTO.getVerifyCodeActual())) {
            //验证过程
            map.put("success", false);
            map.put("errMsg", "输入了错误的验证码");
            return map;
        }
          //获取输入的用户名
        String userName = loginRequestDTO.getUserName();
          //获取输入的密码
        String password = loginRequestDTO.getPassword();
        //非空校验
        if (userName != null && password != null) {
            //通过用户名和密码去查询数据库
            UserDTO userDTO = userService.getInfoByUsernameAndPassword(userName, password);
            if (null != userDTO) {
                map.put("success", true);
                map.put("username",userDTO.getUsername());
                map.put("identity",userDTO.getIdentity());
                //如果查询成功，就将用户信息存进session中
                request.getSession().setAttribute("user", userDTO);
            } else {
                map.put("success", false);
                map.put("errMsg", "账号密码错误");
            }

        } else {
            map.put("session", false);
            map.put("errMsg", "账号密码均不能为空");
        }
        return map;
    }

    /**
     * 登出
     */
    @PostMapping("/logout")
    @ResponseBody
    public Map<String, Object> logout() {
        Map<String, Object> map = new HashMap<>();
        //将用户session置空
        request.getSession().setAttribute("user", null);
        request.getSession().setAttribute("pageName", null);
        map.put("success", true);
        return map;
    }

    @ApiOperation(value = "注册路由",httpMethod = "GET",response = String.class)
    @GetMapping("/register")
    public String register() {
        return "/register";
    }

    @PostMapping("/register_submit")
    @ResponseBody
    public Map<String, Object> register_submit(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        List<User> users = userService.queryAll();
        user.setPassword(MD5Util.getMd5(user.getPassword()));
        user.setIdentity("0");
        user.setCartId(users.size()+1);
        user.setOrderId(users.size()+1);
        userService.insert(user);
        map.put("success",true);
        return map;

    }


    @ApiOperation(value = "购物车路由",httpMethod = "GET",response = String.class)
    @GetMapping("/cart")
    public String cart() {
        return "/cart";
    }

    @ApiOperation(value = "商品详情路由",httpMethod = "GET",response = String.class)
    @GetMapping("/itemPage")
    public String itemPage() {
        return "/item";
    }

    @ApiOperation(value = "搜索结果路由",httpMethod = "GET",response = String.class)
    @GetMapping("/searchPage")
    public String searchPage() {
        return "/search";
    }


    @ApiOperation(value = "个人中心路由",httpMethod = "GET",response = String.class)
    @GetMapping("/toOrder")
    public String toOrder() {
        return "/order";
    }

}
