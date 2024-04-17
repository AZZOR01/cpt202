package com.cpt202.fitness.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 教练预约(Appointment)实体类
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public class Appointment implements Serializable {
    private static final long serialVersionUID = -65619603386243259L;
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
     * 教练姓名
     */
    private String trainername;
/**
     * 预约时间
     */
    private Date time;
/**
     * 预约说明
     */
    private String appointmentinfo;
/**
     * 账号
     */
    private String account;
/**
     * 姓名
     */
    private String name;
/**
     * 手机
     */
    private String phone;
/**
     * 是否审核
     */
    private String sfsh;
/**
     * 审核回复
     */
    private String shhf;


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

    public String getTrainername() {
        return trainername;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAppointmentinfo() {
        return appointmentinfo;
    }

    public void setAppointmentinfo(String appointmentinfo) {
        this.appointmentinfo = appointmentinfo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSfsh() {
        return sfsh;
    }

    public void setSfsh(String sfsh) {
        this.sfsh = sfsh;
    }

    public String getShhf() {
        return shhf;
    }

    public void setShhf(String shhf) {
        this.shhf = shhf;
    }

}

