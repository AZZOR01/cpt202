package com.cpt202.fitness.dao;

import com.cpt202.fitness.entity.Appointment;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 教练预约(Appointment)表数据库访问层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface AppointmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Appointment queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param appointment 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Appointment> queryAllByLimit(Appointment appointment, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param appointment 查询条件
     * @return 总行数
     */
    long count(Appointment appointment);

    /**
     * 新增数据
     *
     * @param appointment 实例对象
     * @return 影响行数
     */
    int insert(Appointment appointment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Appointment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Appointment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Appointment> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Appointment> entities);

    /**
     * 修改数据
     *
     * @param appointment 实例对象
     * @return 影响行数
     */
    int update(Appointment appointment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

