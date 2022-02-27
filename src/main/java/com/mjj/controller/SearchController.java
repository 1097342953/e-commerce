package com.mjj.controller;

import com.mjj.entity.Product;
import com.mjj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class SearchController  extends BaseController  {

    @Autowired
    private ProductService productService;

//    @PostMapping("/search")
//    @ResponseBody
//    protected Map<String, Object> search(@RequestBody String name){
//        Map<String, Object> map = new HashMap<>();
//        List<Product> products = productService.queryByName(name);
//        map.put("success",true);
//        map.put("data",products);
//        return map;
//    }
}
