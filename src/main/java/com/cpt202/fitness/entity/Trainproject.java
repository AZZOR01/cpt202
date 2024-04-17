package com.cpt202.fitness.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 健身项目(Trainproject)实体类
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public class Trainproject implements Serializable {
    private static final long serialVersionUID = 197854431271042821L;
/**
     * 主键
     */
    private Long id;
/**
     * 创建时间
     */
    private Date addtime;
/**
     * 项目名称
     */
    private String projectname;
/**
     * 项目类型
     */
    private String projecttype;
/**
     * 健身效果
     */
    private String projectresult;
/**
     * 项目介绍
     */
    private String projectinfo;
/**
     * 项目图片
     */
    private String projectpic;
/**
     * 最近点击时间
     */
    private Date clicktime;
/**
     * 点击次数
     */
    private Integer clicknum;


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

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype;
    }

    public String getProjectresult() {
        return projectresult;
    }

    public void setProjectresult(String projectresult) {
        this.projectresult = projectresult;
    }

    public String getProjectinfo() {
        return projectinfo;
    }

    public void setProjectinfo(String projectinfo) {
        this.projectinfo = projectinfo;
    }

    public String getProjectpic() {
        return projectpic;
    }

    public void setProjectpic(String projectpic) {
        this.projectpic = projectpic;
    }

    public Date getClicktime() {
        return clicktime;
    }

    public void setClicktime(Date clicktime) {
        this.clicktime = clicktime;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

}

