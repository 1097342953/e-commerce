package com.mjj.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class EvaluateDTO implements Serializable {

    private static final long serialVersionUID = -2615403254616483658L;
    /**
     * 评论id
     */
    private Integer id;
    /**
     * 产品id
     */
    private Integer pId;
    /**
     * 评论的内容
     */
    private String content;
    /**
     * 评论者id
     */
    private Integer uId;
    /**
     * 评论时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "UTC")
    private Date time;
    /**
     * 评论者的用户名
     */
    private String username;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "evaluateDTO{" +
                "id=" + id +
                ", pId=" + pId +
                ", content='" + content + '\'' +
                ", uId=" + uId +
                ", time=" + time +
                ", username='" + username + '\'' +
                '}';
    }
}
