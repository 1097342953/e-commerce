package com.mjj.dto;

import com.mjj.entity.Cart;

import java.io.Serializable;

/**
 * @author mjj
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -5798950591693391155L;
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

    /**
     * 关联的购物车信息
     */
    private Cart cart;


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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                ", cartId=" + cartId +
                ", orderId=" + orderId +
                ", cart=" + cart +
                '}';
    }
}
