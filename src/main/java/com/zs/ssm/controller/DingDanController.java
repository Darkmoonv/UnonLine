package com.zs.ssm.controller;

import com.zs.ssm.domain.DingDan;
import com.zs.ssm.service.DingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("dingdan")
public class DingDanController {
    @Autowired
    private DingDanService danService;

    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<DingDan> danList=danService.findAll();
        modelAndView.addObject("danList",danList);
        modelAndView.setViewName("showDingDan");
        System.out.println(danList);
        return modelAndView;
    }
}
