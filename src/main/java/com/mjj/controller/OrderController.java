package com.mjj.controller;

import com.mjj.dto.OrderDTO;
import com.mjj.entity.Cart;
import com.mjj.entity.Order;
import com.mjj.entity.Product;
import com.mjj.entity.User;
import com.mjj.service.OrderService;
import com.mjj.service.ProductService;
import com.mjj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author mjj
 */
@Controller
public class OrderController extends BaseController{

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/toPay")
    @ResponseBody
    public Map<String, Object> toPay(@RequestParam String name, @RequestParam Integer proId) {
        Map<String, Object> map = new HashMap<>();
        User user = userService.queryByName(name);
        String orderId =System.currentTimeMillis()+user.getId()+String.valueOf(proId)+Math.random();
        Order order =new Order();
        order.setProId(proId);
        order.setUserId(user.getId());
        order.setOrderId(orderId);
        order.setTime(new Date());
        orderService.insert(order);
        map.put("success",true);
        return map;

    }

    @PostMapping("/orderList")
    @ResponseBody
    public Map<String, Object> orderList(@RequestBody String name) {
        Map<String, Object> map = new HashMap<>();
        User user = userService.queryByName(name);
        Integer userId = user.getId();
        List<Order> orders =orderService.queryByUserId(userId);
        List<OrderDTO> orderDTOS =new ArrayList<>();
        for (Order order: orders) {
            Product product = productService.queryById(order.getProId());
            OrderDTO orderDTO =new OrderDTO();
            orderDTO.setOrderId(order.getOrderId());
            orderDTO.setImage(product.getImage());
            orderDTO.setPrice(product.getPrice());
            orderDTO.setTime(order.getTime());;
            orderDTO.setPronName(product.getProName());
            orderDTOS.add(orderDTO);
        }
        map.put("success",true);
        map.put("data",orderDTOS);
        return map;
    }

    @PostMapping("/deleteOrder")
    @ResponseBody
    public Map<String, Object> deleteOrder(@RequestBody String orderId) {
        Map<String, Object> map = new HashMap<>();
        boolean flag = orderService.deleteByOrderId(orderId);
        if (flag){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;
    }
}
