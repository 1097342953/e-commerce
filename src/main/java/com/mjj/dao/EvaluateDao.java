package com.mjj.dao;

import com.mjj.entity.Evaluate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Evaluate)表数据库访问层
 *
 * @author MJJ
 * @since 2021-06-03 16:34:28
 */
public interface EvaluateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Evaluate queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Evaluate> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param evaluate 实例对象
     * @return 对象列表
     */
    List<Evaluate> queryAll(Evaluate evaluate);

    /**
     * 新增数据
     *
     * @param evaluate 实例对象
     * @return 影响行数
     */
    int insert(Evaluate evaluate);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Evaluate> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Evaluate> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Evaluate> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Evaluate> entities);

    /**
     * 修改数据
     *
     * @param evaluate 实例对象
     * @return 影响行数
     */
    int update(Evaluate evaluate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 通过proId查询
     * @param proId
     * @return
     */
    List<Evaluate> queryByProId(Integer proId);
}

