package com.mapper;

import com.domain.Permission;
import com.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 查询当前用户对象
     */
    User findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     */
    List<Permission> findPermissionByUsername(String username);

    /**
     * 更改密码
     * @param user
     */
    void updatePassword(User user);

    /**
     * 获取用户列表
     * @return
     */
    List<User> getUserList(Map<String,Object> map);

    /**
     * 添加用户
     */
    void insertIntoUser(Map<String,Object> map);

    /**
     * 通过id获取user
     * @param map
     * @return
     */
    User selectUserById(Map<String,Object> map);

    /**
     * 修改用户
     * @param map
     */
    void updateUser(Map<String,Object> map);

}
