package com.mjj.controller;

import com.mjj.dto.EvaluateDTO;
import com.mjj.entity.Evaluate;
import com.mjj.entity.Product;
import com.mjj.entity.User;
import com.mjj.service.UserService;
import com.mjj.utils.MD5Util;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mjj
 */
@ApiModel
@Controller
@RequestMapping("/user")
public class MuserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/toList")
    public String toList(){
        return "/user";
    }


    @PostMapping("/getList")
    @ResponseBody
    public Map<String, Object> getList() {
        Map<String, Object> map = new HashMap<>();
        List<User> users = userService.queryAllByLimit(0, 10000);
        map.put("success",true);
        map.put("data",users);
        return map;

    }
    @PostMapping("/deleteUser")
    @ResponseBody
    public Map<String, Object> deleteUser(@RequestBody String id) {
        Map<String, Object> map = new HashMap<>();
        boolean flag = userService.deleteById(Integer.valueOf(id));
        if (flag){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;
    }
}
