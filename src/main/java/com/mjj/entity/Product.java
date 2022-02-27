package com.mjj.entity;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author MJJ
 * @since 2021-06-02 10:13:10
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -34457102278281616L;
    /**
     * 产品id
     */
    private Integer proId;
    /**
     * 产品名称
     */
    private String proName;
    /**
     * 产品价格
     */
    private Double price;
    /**
     * 产品细节
     */
    private String details;
    /**
     * 产品颜色
     */
    private String color;
    /**
     * 产品数量
     */
    private String quantity;
    /**
     * 产品分类
     */
    private String kind;
    /**
     * 产品品牌
     */
    private String brand;
    /**
     * 产品图像地址
     */
    private String image;


    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
