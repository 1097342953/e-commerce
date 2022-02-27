package com.mjj.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.mjj.config.AlipayConfig;
import com.mjj.entity.Product;
import com.mjj.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mjj
 */

@Controller
public class MainController extends BaseController {

    @Autowired
    private ProductService productService;


    @PostMapping("/getList")
    @ResponseBody
    public Map<String, Object> getList() {
        Map<String, Object> map = new HashMap<>();
        List<Product> products = productService.queryAllByLimit(0, 100);
        map.put("success",true);
        map.put("data",products);
        return map;

    }

    @PostMapping("/search")
    @ResponseBody
    protected Map<String, Object> search(@RequestBody String proName){
        Map<String, Object> map = new HashMap<>();
        List<Product> products = new ArrayList<>();
        if (" ".equals(proName) ) {
            products = productService.queryAllByLimit(0,1000);
        }else {
            products = productService.queryByName(proName);
        }
        map.put("success",true);
        map.put("data",products);
        return map;
    }

    @PostMapping("/item")
    @ResponseBody
    public Map<String, Object> item(@RequestBody String id) {
        Map<String, Object> map = new HashMap<>();
        Product product = productService.queryById(Integer.valueOf(id));

        map.put("success",true);
        map.put("data",product);
        return map;

    }

//
}
