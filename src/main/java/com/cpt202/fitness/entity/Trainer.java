package com.cpt202.fitness.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 教练(Trainer)实体类
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public class Trainer implements Serializable {
    private static final long serialVersionUID = 230057965503560504L;
/**
     * 主键
     */
    private Long id;
/**
     * 创建时间
     */
    private Date addtime;
/**
     * 教练编号
     */
    private String trainerid;
/**
     * 密码
     */
    private String password;
/**
     * 教练姓名
     */
    private String trainername;
/**
     * 性别
     */
    private String gender;
/**
     * 年龄
     */
    private Integer age;
/**
     * 教练等级
     */
    private String level;
/**
     * 联系电话
     */
    private String phone;
/**
     * 头像
     */
    private String picture;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(String trainerid) {
        this.trainerid = trainerid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrainername() {
        return trainername;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

}

