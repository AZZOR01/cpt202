package com.cpt202.fitness.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(Manager)实体类
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public class Manager implements Serializable {
    private static final long serialVersionUID = -40544768056354525L;
/**
     * 主键
     */
    private Long id;
/**
     * 用户名
     */
    private String username;
/**
     * 密码
     */
    private String password;
/**
     * 角色
     */
    private String role;

    private String nickname;

    private String phone;
/**
     * 新增时间
     */
    private Date addtime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

}

