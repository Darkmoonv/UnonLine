package com.zs.ssm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static String dateToString(Date date,String str){
        SimpleDateFormat sf=new SimpleDateFormat(str);
        return sf.format(date);
    }
}
