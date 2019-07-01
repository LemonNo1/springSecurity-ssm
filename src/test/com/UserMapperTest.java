package com;

import com.domain.Permission;
import com.domain.User;
import com.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void userTest() {
       User user = userMapper.findByUsername("eric");
        System.out.println(user);
    }

    @Test
    public void permTest(){
        List<Permission> list = userMapper.findPermissionByUsername("eric");
        for (Permission permission : list) {
            System.out.println(permission);
        }
    }

    @Test
    public void passwordTest(){
        User user = new User();
        user.setUserName("eric");
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassWord(passwordEncoder.encode("123456"));
        userMapper.updatePassword(user);
    }

    @Test
    public void Test1(){

    }
}
