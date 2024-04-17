package com.cpt202.fitness.service;

import com.cpt202.fitness.entity.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 教练预约(Appointment)表服务接口
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface AppointmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Appointment queryById(Long id);

    /**
     * 分页查询
     *
     * @param appointment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Appointment> queryByPage(Appointment appointment, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param appointment 实例对象
     * @return 实例对象
     */
    Appointment insert(Appointment appointment);

    /**
     * 修改数据
     *
     * @param appointment 实例对象
     * @return 实例对象
     */
    Appointment update(Appointment appointment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
