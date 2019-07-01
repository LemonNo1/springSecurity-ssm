package com.service.impl;

import com.domain.User;
import com.mapper.RoleUserMapper;
import com.mapper.UserMapper;
import com.service.UserService;
import com.utils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleUserMapper roleUserMapper;

    Map<String, Object> mapData = new HashMap<>();

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public Map<String, Object> getUserList(Map<String, Object> map) throws Exception {
        List<User> userList = userMapper.getUserList(map);
        mapData.put("data", userList);
        mapData.put("code", 0);
        return mapData;
    }

    @Override
    public void insertIntoUser(Map<String, Object> map) throws Exception {
        String nowTime = DateUtil.getNowTime();
        map.put("createDate",nowTime);
        map.put("lastLoginTime",nowTime);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bCryptPasswordEncoder.encode(map.get("password").toString());
        map.put("password",password);
        userMapper.insertIntoUser(map);
    }

    @Override
    public User selectUserById(Map<String, Object> map) throws Exception{
        User user = userMapper.selectUserById(map);
        return user;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateUser(Map<String, Object> map) throws Exception {
        try {
            userMapper.updateUser(map);
            Integer id = roleUserMapper.checkUserRole(map);
            logger.info("判断用户是否已关联------id："+id);
            if(id == null){
                roleUserMapper.insertRoleUser(map);
                logger.info("id为空进行插入");
            }else{
                map.put("id",id);
                roleUserMapper.updateRoleUser(map);
                logger.info("id不为空，进行修改");
            }
        }catch (Exception e){
            throw new  RuntimeException();
        }
    }
}
