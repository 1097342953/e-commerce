package com.mjj.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author MJJ
 * @since 2021-06-04 09:53:20
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -80571853541081919L;
    /**
     * 订单id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 产品id
     */
    private Integer proId;
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "UTC")
    private Date time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}
