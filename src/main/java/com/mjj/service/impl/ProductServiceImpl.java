package com.mjj.service.impl;

import com.mjj.entity.Product;
import com.mjj.dao.ProductDao;
import com.mjj.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Product)表服务实现类
 *
 * @author MJJ
 * @since 2021-06-02 10:13:12
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    /**
     * 通过ID查询单条数据
     *
     * @param proId 主键
     * @return 实例对象
     */
    @Override
    public Product queryById(Integer proId) {
        return this.productDao.queryById(proId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Product> queryAllByLimit(int offset, int limit) {
        return this.productDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product insert(Product product) {
        this.productDao.insert(product);
        return product;
    }

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product update(Product product) {
        this.productDao.update(product);
        return this.queryById(product.getProId());
    }

    /**
     * 通过主键删除数据
     *
     * @param proId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer proId) {
        return this.productDao.deleteById(proId) > 0;
    }

    /**
     * 通过name查询数据
     * @param name
     * @return
     */
    @Override
    public List<Product> queryByName(String proName) {
        return this.productDao.queryByName(proName);
    }

//    @Override
//    public Map<String, Object> queryAllProducts() {
//        return this.productDao.queryAllProducts();
//    }
}
