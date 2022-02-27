package com.mjj.service;

import com.mjj.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * (Product)表服务接口
 *
 * @author MJJ
 * @since 2021-06-02 10:13:11
 */
public interface ProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    Product queryById(Integer proId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Product> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product insert(Product product);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer proId);

    /**
     * 通过name查询数据
     * @param proName
     * @return
     */
    List<Product> queryByName(String proName);


//    /**
//     * 查询所有商品
//     * @return
//     */
//    Map<String, Object> queryAllProducts();
}
