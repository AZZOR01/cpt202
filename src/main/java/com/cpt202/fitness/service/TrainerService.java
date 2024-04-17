package com.cpt202.fitness.service;

import com.cpt202.fitness.entity.Trainer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 教练(Trainer)表服务接口
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface TrainerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Trainer queryById(Long id);

    /**
     * 分页查询
     *
     * @param trainer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Trainer> queryByPage(Trainer trainer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param trainer 实例对象
     * @return 实例对象
     */
    Trainer insert(Trainer trainer);

    /**
     * 修改数据
     *
     * @param trainer 实例对象
     * @return 实例对象
     */
    Trainer update(Trainer trainer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
