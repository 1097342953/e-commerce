package com.mjj.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Evaluate)实体类
 *
 * @author MJJ
 * @since 2021-06-03 16:34:28
 */
public class Evaluate implements Serializable {
    private static final long serialVersionUID = 953517163337489976L;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
