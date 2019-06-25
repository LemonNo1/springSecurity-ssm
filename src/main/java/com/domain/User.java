package com.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.domain
 * @date 18/4/14
 */
public class User implements UserDetails {

    private Integer id; //int(10) NOT NULL,
    private String userName; //varchar(50) DEFAULT NULL,
    private String realName; //varchar(50) DEFAULT NULL,
    private String passWord; //varchar(50) DEFAULT NULL,
    private Date createDate; //date DEFAULT NULL,
    private Date lastLoginTime; //date DEFAULT NULL,
    private boolean enAbled; //int(5) DEFAULT NULL,
    private boolean accountNonExpired; //int(5) DEFAULT NULL,
    private boolean accountNonLocked; //int(5) DEFAULT NULL,
    private boolean credentialsNonExpired; //int(5) DEFAULT NULL,

    //用户拥有的所有权限
    private List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return userName;
    }


    @Override
    public String getPassword() {
        return passWord;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isEnAbled() {
        return enAbled;
    }

    public void setEnAbled(boolean enAbled) {
        this.enAbled = enAbled;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public boolean isEnabled() {
        return enAbled;
    }

    public void setEnabled(boolean enabled) {
        this.enAbled = enabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", createDate=" + createDate +
                ", lastLoginTime=" + lastLoginTime +
                ", enAbled=" + enAbled +
                ", accountNonExpired=" + accountNonExpired +
                ", accountNonLocked=" + accountNonLocked +
                ", credentialsNonExpired=" + credentialsNonExpired +
                ", authorities=" + authorities +
                '}';
    }
}
