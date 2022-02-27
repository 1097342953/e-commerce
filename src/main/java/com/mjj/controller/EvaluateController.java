package com.mjj.controller;

import com.mjj.dto.EvaluateDTO;
import com.mjj.entity.Evaluate;
import com.mjj.entity.Product;
import com.mjj.service.EvaluateService;
import com.mjj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mjj
 */
@Controller
public class EvaluateController extends BaseController {

    @Autowired
    private EvaluateService evaluateService;

    @Autowired
    private UserService userService;

    @PostMapping("/getEvaluateList")
    @ResponseBody
    public Map<String, Object> getEvaluateList(@RequestBody String id) {
        Map<String, Object> map = new HashMap<>();
        List<Evaluate> evaluates= evaluateService.queryByProId(Integer.valueOf(id));
        List<EvaluateDTO> evaluateDTOS =new ArrayList<>();
        for (Evaluate ev: evaluates) {
            String username = userService.queryById(ev.getUId()).getUsername();
            EvaluateDTO evaluateDTO =new EvaluateDTO();
            evaluateDTO.setId(ev.getId());
            evaluateDTO.setContent(ev.getContent());
            evaluateDTO.setpId(ev.getPId());
            evaluateDTO.setuId(ev.getUId());
            evaluateDTO.setTime(ev.getTime());
            evaluateDTO.setUsername(username);
            evaluateDTOS.add(evaluateDTO);
        }
        map.put("success",true);
        map.put("data",evaluateDTOS);
        return map;
    }


}
