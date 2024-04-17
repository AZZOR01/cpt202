package com.cpt202.fitness.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Member)实体类
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public class Member implements Serializable {
    private static final long serialVersionUID = -62268677070257909L;

    private Integer memberid;

    private String mbusername;

    private String mbpassword;

    private String mbnickname;

    private String mbphone;

    private String mbemail;

    private String mbbirthdate;

    private String mbgender;
/**
     * 新增时间
     */
    private Date addtime;


    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getMbusername() {
        return mbusername;
    }

    public void setMbusername(String mbusername) {
        this.mbusername = mbusername;
    }

    public String getMbpassword() {
        return mbpassword;
    }

    public void setMbpassword(String mbpassword) {
        this.mbpassword = mbpassword;
    }

    public String getMbnickname() {
        return mbnickname;
    }

    public void setMbnickname(String mbnickname) {
        this.mbnickname = mbnickname;
    }

    public String getMbphone() {
        return mbphone;
    }

    public void setMbphone(String mbphone) {
        this.mbphone = mbphone;
    }

    public String getMbemail() {
        return mbemail;
    }

    public void setMbemail(String mbemail) {
        this.mbemail = mbemail;
    }

    public String getMbbirthdate() {
        return mbbirthdate;
    }

    public void setMbbirthdate(String mbbirthdate) {
        this.mbbirthdate = mbbirthdate;
    }

    public String getMbgender() {
        return mbgender;
    }

    public void setMbgender(String mbgender) {
        this.mbgender = mbgender;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

}

