package com.mjj.controller;

import com.mjj.dto.EvaluateDTO;
import com.mjj.dto.EvaluateDTO2;
import com.mjj.entity.Evaluate;
import com.mjj.entity.User;
import com.mjj.service.EvaluateService;
import com.mjj.service.ProductService;
import com.mjj.service.UserService;
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

@ApiModel
@Controller
@RequestMapping("/evaluate")
public class MevaluateController extends BaseController{
    @Autowired
    private EvaluateService evaluateService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @GetMapping("/toList")
    public String toList(){
        return "/evaluate";
    }

    @PostMapping("/getList")
    @ResponseBody
    public Map<String, Object> getList() {
        Map<String, Object> map = new HashMap<>();
        List<Evaluate> evaluates = evaluateService.queryAllByLimit(0, 10000);
        List<EvaluateDTO2> evaluateDTOS =new ArrayList<>();
        for (Evaluate ev: evaluates) {
            String username = userService.queryById(ev.getUId()).getUsername();
            String proName = productService.queryById(ev.getPId()).getProName();
            EvaluateDTO2 evaluateDTO2 =new EvaluateDTO2();
            evaluateDTO2.setId(ev.getId());
            evaluateDTO2.setContent(ev.getContent());
            evaluateDTO2.setpId(ev.getPId());
            evaluateDTO2.setuId(ev.getUId());
            evaluateDTO2.setTime(ev.getTime());
            evaluateDTO2.setUsername(username);
            evaluateDTO2.setProName(proName);
            evaluateDTOS.add(evaluateDTO2);
        }
        map.put("success",true);
        map.put("data",evaluateDTOS);
        return map;

    }

    @PostMapping("/deleteEvaluate")
    @ResponseBody
    public Map<String, Object> deleteEvaluate(@RequestBody String id) {
        Map<String, Object> map = new HashMap<>();
        boolean flag = evaluateService.deleteById(Integer.valueOf(id));
        if (flag){
            map.put("success",true);
        }else {
            map.put("success",false);
        }
        return map;
    }
}
