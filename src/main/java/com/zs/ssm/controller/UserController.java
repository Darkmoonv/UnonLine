package com.zs.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.zs.ssm.domain.User;
import com.zs.ssm.service.UserService;
import com.zs.ssm.ssmexception.LoginFailedException;
import com.zs.ssm.ssmexception.RegisteredException;
import com.zs.ssm.utils.ResultEntiy;
import com.zs.ssm.utils.ResultPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

//对用户的操作注册，登录
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //注册之前
    @RequestMapping("/registeredBefor")
    public String befor(){
        return "/userregistered";
    }
    //登陆之前
    @RequestMapping("/beforLogin")
    public String beforLogin(){
        return "userLogin";
    }
    //注册
    @RequestMapping("/registered.do")
    public ModelAndView registered(User user){
        Map<String,Object> map=new HashMap<String, Object>();
        ModelAndView modelAndView=new ModelAndView();
        User preUser=userService.findUser(user);
        if (preUser==null){
            userService.registeredUser(user);
            modelAndView.addObject(ResultPool.REGISTERED_SUCCESS,ResultPool.REGISTERED_SUCCESS_MSG);
            modelAndView.setViewName("userLogin");
        }
        throw new RegisteredException(ResultPool.MESSAGE_LOGIN_INUSE);
    }
    @RequestMapping("/login.do")
    public ModelAndView login(User user){
        ModelAndView modelAndView=new ModelAndView();
        User loginUser=userService.loginUser(user);
        if (loginUser==null){
            throw new LoginFailedException(ResultPool.MESSAGE_LOGIN_FAILED);
        }
        if (ResultPool.MESSAGE_ADMIN_FLAG.equals(loginUser.getAdmin())){
            modelAndView.addObject(ResultPool.MESSAGE_LOGIN_ADMIN,loginUser);
            modelAndView.setViewName("/adminMain");
            return modelAndView;
        }
        if (ResultPool.MESSAGE_USER_FLAG.equals(loginUser.getAdmin())){
            modelAndView.addObject(ResultPool.MESSAGE_LOGIN_USER,loginUser);
            modelAndView.setViewName("/userMain");
            return modelAndView;
        }
        throw new LoginFailedException(ResultPool.MESSAGE_LOGIN_FAILED);
    }
    //退出功能
    @RequestMapping("/loginOut.do")
    public String loginOut(HttpSession session){
        //强制session失效
        session.invalidate();
        return "userLogin";
    }
    //完成分页查询
    @RequestMapping("/pageInfoUser.do")
    public ModelAndView pageInfoUser(
            @RequestParam(value ="pageNum",defaultValue = "1") Integer pageNum,
            @RequestParam(value ="pageSize",defaultValue = "3") Integer pageSize,
            ModelMap modelMap){
        ModelAndView modelAndView=new ModelAndView();
        PageInfo<User> userPageInfo=userService.getPageInfo(pageNum,pageSize);
        System.out.println(userPageInfo);
        //modelMap.addAttribute(ResultPool.PAGE_INFO,userPageInfo);
        modelAndView.addObject(ResultPool.PAGE_INFO,userPageInfo);
        modelAndView.setViewName("fenyeShowUser");
        //return "fenyeShowUser";
        return modelAndView;
    }
    @RequestMapping("/pageUser.do")
    @ResponseBody
    public ResultEntiy<PageInfo<User>> showAllUser(
            @RequestParam(value ="pageNum",defaultValue = "1") Integer pageNum,
            @RequestParam(value ="pageSize",defaultValue = "3") Integer pageSize
    ){
        PageInfo<User> userPageInfo;
        try {
            userPageInfo=userService.getPageInfo(pageNum,pageSize);
            return ResultEntiy.resultWithData(userPageInfo);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntiy.failedWithData(e.getMessage());
        }
    }

    @RequestMapping("/userDel.do")
    public String userDel(){
        return "userDel";
    }
    @RequestMapping("/delUser.do")
    public String delUser(User user){
        if (user==null){
            throw new LoginFailedException(ResultPool.MESSAGE_DEL_FAILED);
        }
        userService.del(user);
        return "userLogin";
    }

    @RequestMapping("userReplace.do")
    public String userReplace(){
        return "userReplace";
    }
    @RequestMapping("replaceUser.do")
    public String replaceUser(User user){
        if (user==null){
            throw new LoginFailedException(ResultPool.MESSAGE_REPLACE_MSG);
        }
        userService.replace(user);
        return "/userLogin";
    }
}
