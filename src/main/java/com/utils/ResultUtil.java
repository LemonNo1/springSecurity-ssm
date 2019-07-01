package com.utils;

import java.util.Map;

public class ResultUtil {
    /**
     * 返回数据
     * @param map
     * @param success
     * @param msg
     */
    public static void resultMap(Map<String,Object> map, Boolean success, String msg){
        map.put("success",success);
        map.put("msg",msg);
    }
}
