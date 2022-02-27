package com.mjj.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author MJJ
 * @since 2021-05-28 17:30:46
 */
public class User implements Serializable {
    private static final long serialVersionUID = -79881482700272848L;
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 登录账号
     */
    private String username;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 身份：0为顾客 1为管理员
     */
    private String identity;
    /**
     * 购物车的id
     */
    private Integer cartId;
    /**
     * 订单的id
     */
    private Integer orderId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                ", cartId=" + cartId +
                ", orderId=" + orderId +
                '}';
    }
}
