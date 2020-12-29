package com.zs.ssm.utils;

import javax.servlet.http.HttpServletRequest;

//判断请求类型是json还是普通请求
public class RequestTypeisJson {
    public static boolean RequestIsJson(HttpServletRequest request){
        /*只要请求头Accept携带(application/json)和X-Request-With携带(XMLHttpRequest)
        那嘛这请求就是json请求*/
        String AcceptData=request.getHeader("Accept");
        String XRequestDate=request.getHeader("X-Request-With");
        if ((AcceptData!=null && AcceptData.contains("application/json")) ||
        XRequestDate!=null && XRequestDate.contains("XMLHttpRequest")){
            return true;
        }else {
            return false;
        }
    }
}
