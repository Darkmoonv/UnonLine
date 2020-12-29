package com.zs.ssm.intercept;

import com.zs.ssm.domain.User;
import com.zs.ssm.ssmexception.AccessDeniedException;
import com.zs.ssm.utils.ResultPool;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginIntercePt extends HandlerInterceptorAdapter {
    //在访问资源之前做的事
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        User user=(User) session.getAttribute(ResultPool.MESSAGE_LOGIN_USER);
        User adminUser=(User) session.getAttribute(ResultPool.MESSAGE_LOGIN_ADMIN);
        if ((user==null) && (adminUser==null)){
            throw new AccessDeniedException(ResultPool.MESSAGE_NO_LOGIN);
        }
        return true;
    }
    //在访问资源之后做的事情
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
}
