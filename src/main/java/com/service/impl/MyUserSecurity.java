package com.security;

import com.domain.Permission;
import com.domain.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserSecurity implements UserDetailsService {
    /**
     * loadUserByUsername: 读取用户信息
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查询对应user
        User user = userMapper.findByUsername(username);
        if (user != null) {
            //根据用户名查询当前用户所有权限
            List<Permission> permList = userMapper.findPermissionByUsername(username);
            //authorities：存放所有用户权限
            List<GrantedAuthority> authorities = new ArrayList<>();
            for (Permission perm : permList) {
                GrantedAuthority authority = new SimpleGrantedAuthority(perm.getPermTag());
                authorities.add(authority);
            }
            //把所有权限赋值给user
            user.setAuthorities(authorities);
        }
        return user;
    }
}
