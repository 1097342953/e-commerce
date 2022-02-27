package com.mjj.entity;

import java.io.Serializable;

/**
 * (Cart)实体类
 *
 * @author MJJ
 * @since 2021-05-28 17:28:26
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = -33562158186767452L;
    /**
     * 购物车id
     */
    private Integer id;
    /**
     * 产品id
     */
    private Integer productId;
    /**
     * 购物车的id编号
     */
    private Integer cartId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

}
