package com.mjj.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mjj.entity.Product;
import com.mjj.service.ProductService;
import com.mjj.utils.HttpServletRequestUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author h
 */
@ApiModel
@Controller
@RequestMapping("/products")
public class MproductController extends BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping("/toList")
    public String toList(){
        return "/product";
    }

    @GetMapping("/toAddProduct")
    public String toAddProduct(){
        return "/productAdd";
    }

    @ApiModelProperty(value = "新增产品")
    @PostMapping("/insertProduct")
    @ResponseBody
    public Map<String,Object> insertProduct(@RequestParam String productStr){
        Map<String ,Object> map=new HashMap<>();
        //调用services
        try{
            ObjectMapper mapper = new ObjectMapper();
            Product product;
            try {
                product = mapper.readValue(productStr,Product.class);
            }catch (JsonProcessingException je){
                map.put("success",false);
                map.put("errMsg",je.getMessage());
                return map;
            }
            productService.insert(product);

        }catch (Exception e){
            map.put("success",false);
            map.put("errMsg",e.getMessage());
            return map;
        }
        map.put("success",true);
        return map;
    }

    @ApiOperation(value = "跳转到产品修改页面")
    @GetMapping("/goProductEdit")
    public String goProductEdit(){
        return "/productEdit";
    }
    @ApiModelProperty(value = "编辑产品")
    @PostMapping("/editProduct")
    @ResponseBody
    public Map<String,Object> editProduct(@RequestParam String productStr){
        Map<String ,Object> map=new HashMap<>();
        //调用services
        try{
            ObjectMapper mapper = new ObjectMapper();
            Product product;
            try {
                product = mapper.readValue(productStr,Product.class);
            }catch (JsonProcessingException je){
                map.put("success",false);
                map.put("errMsg",je.getMessage());
                return map;
            }
            productService.update(product);

        }catch (Exception e){
            map.put("success",false);
            map.put("errMsg",e.getMessage());
            return map;
        }
        map.put("success",true);
        return map;
    }
    @PostMapping("/queryProductById")
    @ResponseBody
    public Map<String,Object> queryProductById(HttpServletRequest request){
        Map<String ,Object> map=new HashMap<>();
        int proId = HttpServletRequestUtil.getInt(request, "proId");
        Product product=null;
        try {
            product = productService.queryById(proId);
        }catch (Exception e){
            map.put("success",false);
            map.put("errMsg",e.getMessage());
            return map;
        }
        map.put("success",true);
        map.put("data",product);
        return map;
    }

    @PostMapping("/deletePro")
    @ResponseBody
    public Map<String, Object> deletePro(@RequestBody String id) {
        Map<String, Object> map = new HashMap<>();
        boolean flag = productService.deleteById(Integer.valueOf(id));
        if (flag){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;
    }
}
