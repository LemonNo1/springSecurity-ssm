package com.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DateUtil {

    /**
     * 获取当前时间
     * @return
     */
    public static String getNowTime(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }



   /* public static void main(String[] args){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bCryptPasswordEncoder.encode("$10$DhJTi5zY2V9eI1T1yCmD5OIZkM6txnrDU98es.35VK/aa5XnLWdQu");
        System.out.println(password);
    }*/
}
