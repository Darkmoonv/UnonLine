package com.zs.ssm.resolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zs.ssm.utils.RequestTypeisJson;
import com.zs.ssm.utils.ResultEntiy;
import com.zs.ssm.utils.ResultPool;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e){
        ModelAndView modelAndView = new ModelAndView();
        try {
            //如果请求时ajax，不返回视图，返回异常的原因
            if (RequestTypeisJson.RequestIsJson(request)) {
                ResultEntiy<Object> resultEntiy = ResultEntiy.failedWithData(e.getMessage());
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(resultEntiy);
                response.getWriter().write(json);
                return null;
            }
            //如果是普通请求返回页面视图信息
            modelAndView.addObject(ResultPool.MESSAGE_LOGIN_EXCEPTION,e.getMessage());
            modelAndView.setViewName("error");
        }catch (IOException i){
            i.printStackTrace();
        }
        return modelAndView;
    }
}
