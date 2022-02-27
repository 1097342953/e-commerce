package com.mjj.service.impl;

import com.mjj.entity.Cart;
import com.mjj.dao.CartDao;
import com.mjj.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cart)表服务实现类
 *
 * @author MJJ
 * @since 2021-05-28 18:50:06
 */
@Service("cartService")
public class CartServiceImpl implements CartService {
    @Resource
    private CartDao cartDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Cart queryById(Integer id) {
        return this.cartDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Cart> queryAllByLimit(int offset, int limit) {
        return this.cartDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    @Override
    public Cart insert(Cart cart) {
        this.cartDao.insert(cart);
        return cart;
    }

    /**
     * 修改数据
     *
     * @param cart 实例对象
     * @return 实例对象
     */
    @Override
    public Cart update(Cart cart) {
        this.cartDao.update(cart);
        return this.queryById(cart.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cartDao.deleteById(id) > 0;
    }
    /**
     * 通过cartId来查询
     * @param cartId
     * @return
     */
    @Override
    public List<Cart> queryByCartId(Integer cartId) {
        return this.cartDao.queryByCartId(cartId);
    }
    /**
     * 通过proId和cartId来删除
     * @param proId
     * @param cartId
     * @return
     */
    @Override
    public boolean deleteByProIdAndCartId(Integer proId, Integer cartId) {
        return this.cartDao.deleteByProIdAndCartId(proId,cartId) >0;
    }
}
