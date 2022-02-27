package com.mjj.service.impl;

import com.mjj.entity.Evaluate;
import com.mjj.dao.EvaluateDao;
import com.mjj.service.EvaluateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Evaluate)表服务实现类
 *
 * @author MJJ
 * @since 2021-06-03 16:34:28
 */
@Service("evaluateService")
public class EvaluateServiceImpl implements EvaluateService {
    @Resource
    private EvaluateDao evaluateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Evaluate queryById(Integer id) {
        return this.evaluateDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Evaluate> queryAllByLimit(int offset, int limit) {
        return this.evaluateDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param evaluate 实例对象
     * @return 实例对象
     */
    @Override
    public Evaluate insert(Evaluate evaluate) {
        this.evaluateDao.insert(evaluate);
        return evaluate;
    }

    /**
     * 修改数据
     *
     * @param evaluate 实例对象
     * @return 实例对象
     */
    @Override
    public Evaluate update(Evaluate evaluate) {
        this.evaluateDao.update(evaluate);
        return this.queryById(evaluate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.evaluateDao.deleteById(id) > 0;
    }

    /**
     * 通过proId查询
     * @param proId
     * @return
     */
    @Override
    public List<Evaluate> queryByProId(Integer proId) {
        return this.evaluateDao.queryByProId(proId);
    }
}
