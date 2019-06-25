package com.mapper;

import com.domain.Permission;
import com.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
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

}
