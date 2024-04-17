package com.cpt202.fitness.dao;

import com.cpt202.fitness.entity.Trainer;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 教练(Trainer)表数据库访问层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface TrainerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Trainer queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param trainer 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Trainer> queryAllByLimit(Trainer trainer, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param trainer 查询条件
     * @return 总行数
     */
    long count(Trainer trainer);

    /**
     * 新增数据
     *
     * @param trainer 实例对象
     * @return 影响行数
     */
    int insert(Trainer trainer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Trainer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Trainer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Trainer> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Trainer> entities);

    /**
     * 修改数据
     *
     * @param trainer 实例对象
     * @return 影响行数
     */
    int update(Trainer trainer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

