package com.lastdocha2.finaldocha2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class yjutil {

    public static String timeToDateTimeFormat(String time){
        Date day = new Date();

        String datePattern5 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        SimpleDateFormat format = new SimpleDateFormat(datePattern5);

        String today =  format.format(day);
        System.out.println(today + " 오늘 ????");
       return today.split("T")[0] +"T"+time;
    }
}
