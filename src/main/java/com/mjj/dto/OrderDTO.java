package com.mjj.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.awt.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author h
 */
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 206004777499802152L;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date time;

    private String pronName;

    private String image;

    private Double price;


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

    public String getPronName() {
        return pronName;
    }

    public void setPronName(String pronName) {
        this.pronName = pronName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", proId=" + proId +
                ", orderId='" + orderId + '\'' +
                ", time=" + time +
                ", pronName='" + pronName + '\'' +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
