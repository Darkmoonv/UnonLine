package com.zs.ssm.utils;
//返回数据对象的工具类
public class ResultEntiy<T> {
    public static final String SUCCESS="success";
    public static final String FAILED="failed";
    //用来当以当前结果是否成功
    private String result;
    //用来定义返回结果失败的原因
    private String msg;
    //用来定义返回的数据
    private T data;
    //数据返回成功，但什么数据都没有包含
    public static<Type> ResultEntiy<Type> resultWithoutData(){
        return new ResultEntiy<Type>(SUCCESS,null,null);
    }
    //数据返回成功，包含数据
    public static<Type> ResultEntiy<Type> resultWithData(Type data){
        return new ResultEntiy<Type>(SUCCESS,null,data);
    }
    //数据返回失败，包含数据
    public static<Type> ResultEntiy<Type> failedWithData(String msg){
        return new ResultEntiy<Type>(FAILED,msg,null);
    }

    public ResultEntiy() {
    }
    public ResultEntiy(String result, String msg, T data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntiy{" +
                "result='" + result + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
