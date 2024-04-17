package com.cpt202.fitness.service;

import com.cpt202.fitness.entity.Manager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 用户表(Manager)表服务接口
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface ManagerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Manager queryById(Long id);

    /**
     * 分页查询
     *
     * @param manager 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Manager> queryByPage(Manager manager, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Manager insert(Manager manager);

    /**
     * 修改数据
     *
     * @param manager 实例对象
     * @return 实例对象
     */
    Manager update(Manager manager);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
