package com.mjj.controller;

import com.mjj.entity.Cart;
import com.mjj.entity.Product;
import com.mjj.entity.User;
import com.mjj.service.CartService;
import com.mjj.service.ProductService;
import com.mjj.service.UserService;
import com.mjj.utils.MD5Util;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mjj
 */
@Controller
public class CartController  extends BaseController {

    @Autowired
    private CartService cartService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;


    @RequestMapping("/addCart")
    @ResponseBody
    public Map<String, Object> addCart(@RequestParam String id,@RequestParam String name) {
        Map<String, Object> map = new HashMap<>();
        User user = userService.queryByName(name);
        Cart cart =new Cart();
        cart.setCartId(user.getCartId());
        cart.setProductId(Integer.valueOf(id));
        cartService.insert(cart);
        map.put("success",true);
        return map;

    }

    @PostMapping("/cartList")
    @ResponseBody
    public Map<String, Object> cartList(@RequestBody String name) {
        Map<String, Object> map = new HashMap<>();
        User users = userService.queryByName(name);
        Integer cartId = users.getCartId();
        List<Cart> carts =cartService.queryByCartId(cartId);
        List<Product> products = new ArrayList<>();
        for (Cart cart: carts) {
            Product product = productService.queryById(cart.getProductId());
            products.add(product);
        }
        map.put("success",true);
        map.put("products",products);
        map.put("cartId",cartId);
        return map;
    }

    @PostMapping("/deleteCart")
    @ResponseBody
    public Map<String, Object> deleteCart(@RequestParam Integer proId,@RequestParam Integer cartId) {
        Map<String, Object> map = new HashMap<>();
        boolean flag = cartService.deleteByProIdAndCartId(proId, cartId);
        if (flag){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;

    }



}
