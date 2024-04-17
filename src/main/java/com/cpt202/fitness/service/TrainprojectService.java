package com.cpt202.fitness.service;

import com.cpt202.fitness.entity.Trainproject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 健身项目(Trainproject)表服务接口
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface TrainprojectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Trainproject queryById(Long id);

    /**
     * 分页查询
     *
     * @param trainproject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Trainproject> queryByPage(Trainproject trainproject, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param trainproject 实例对象
     * @return 实例对象
     */
    Trainproject insert(Trainproject trainproject);

    /**
     * 修改数据
     *
     * @param trainproject 实例对象
     * @return 实例对象
     */
    Trainproject update(Trainproject trainproject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
