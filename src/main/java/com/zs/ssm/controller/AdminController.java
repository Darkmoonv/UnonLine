package com.zs.ssm.controller;

import com.zs.ssm.domain.User;
import com.zs.ssm.service.OredrsService;
import com.zs.ssm.service.UserService;
import com.zs.ssm.ssmexception.LoginFailedException;
import com.zs.ssm.utils.ResultPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired()
    private UserService userService;
    @Autowired()
    private OredrsService oredrsService;


    @RequestMapping("/admin/addUser.do")
    public String addAdminBefore(){
        return "adminAddUser";
    }
    @RequestMapping("/addAdmin.do")
    public ModelAndView addAdmin(User user){
        ModelAndView modelAndView=new ModelAndView();
        if (user==null){
            throw new LoginFailedException(ResultPool.REGISTERED_FAILED_USERNAME);
        }
        userService.add(user);
        List<User> userList=userService.findAll();
        modelAndView.addObject(ResultPool.SHOW_USER_LIST,userList);
        modelAndView.setViewName("/showUsers");
        return modelAndView;
    }
    @RequestMapping("/showUser.do")
    public ModelAndView showUsers(){
        ModelAndView modelAndView=new ModelAndView();
        List<User> userList=userService.findAll();
        modelAndView.addObject(ResultPool.SHOW_USER_LIST,userList);
        modelAndView.setViewName("showUsers");
        System.out.println(userList);
        return modelAndView;
    }
    //保存用户和角色的关系
    //required = false允许此集合没有值
    @RequestMapping("saveUserAndRose")
    public String saveUserAndRoseRelation(
            @RequestParam("userId") Integer id,
            @RequestParam(value = "roleIdList",required = false) List<Integer> roleIdList
    ){
        //userService.saveUserAndRoseRelation(id,roleIdList);
        return "";
    }
}
