package com.mjj.dao;

import com.mjj.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Cart)表数据库访问层
 *
 * @author MJJ
 * @since 2021-05-28 18:50:06
 */
public interface CartDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Cart queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Cart> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param cart 实例对象
     * @return 对象列表
     */
    List<Cart> queryAll(Cart cart);

    /**
     * 新增数据
     *
     * @param cart 实例对象
     * @return 影响行数
     */
    int insert(Cart cart);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Cart> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Cart> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Cart> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Cart> entities);

    /**
     * 修改数据
     *
     * @param cart 实例对象
     * @return 影响行数
     */
    int update(Cart cart);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 通过cartId来查询
     * @param cartId
     * @return
     */
    List<Cart> queryByCartId(@Param("cartId") Integer cartId);

    /**
     * 通过proId和cartId来删除
     * @param proId
     * @param cartId
     * @return
     */
    int deleteByProIdAndCartId(@Param("proId") Integer proId, @Param("cartId") Integer cartId);
}

