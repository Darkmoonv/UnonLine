package com.zs.ssm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//对密码进行加密
public class PasswordPMD {
    public static String Pmd(String password){
        if (password==null || password.length()==0){
            throw new RuntimeException(ResultPool.MESSAGE_NOT_RIGHT);
        }
        //定义加密方式
        String MD5="md5";
        try {
            //以md5形式加密
            MessageDigest messageDigest=MessageDigest.getInstance(MD5);
            //将明文转化为字节数组
           byte[] input= password.getBytes();
           //将铭文字节数组进行加密得到密文字节数组
           byte[] output=messageDigest.digest(input);
           int num=1;
           //将密文数组转化为大整数
           BigInteger bigInteger=new BigInteger(num,output);
           //定义16进制
           int radix=16;
           //将加密好的大整数以16进制的形式转化为字符串
           String encode=bigInteger.toString(radix).toUpperCase();
           return encode;
        }catch (NoSuchAlgorithmException n){
            n.printStackTrace();
        }
        return null;
    }
}
