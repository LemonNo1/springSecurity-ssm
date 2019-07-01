package com.service;

import com.domain.User;

import java.util.Map;

public interface UserService {
    /**
     * 获取用户列表
     * @param map
     * @return
     * @throws Exception
     */
    Map<String,Object> getUserList(Map<String,Object> map) throws  Exception;

    /**
     * 添加用户
     * @param map
     */
    void insertIntoUser(Map<String,Object> map) throws Exception;

    /**
     * 通过id获取user
     * @param map
     * @return
     */
    User selectUserById(Map<String,Object> map)  throws Exception;

    /**
     * 修改用户
     * @param map
     */
    void updateUser(Map<String,Object> map)throws Exception;
}
