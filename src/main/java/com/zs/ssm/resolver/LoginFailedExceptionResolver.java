package com.zs.ssm.resolver;
import com.zs.ssm.utils.ResultPool;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFailedExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e){
        ModelAndView modelAndView=new ModelAndView();
        if ("LoginFailedException".equals(e)){
            modelAndView.addObject(ResultPool.MESSAGE_LOGIN_EXCEPTION, ResultPool.MESSAGE_LOGIN_FAILED);
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }
}
