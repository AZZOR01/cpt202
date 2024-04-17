package com.cpt202.fitness.dao;

import com.cpt202.fitness.entity.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Member)表数据库访问层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface MemberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param memberid 主键
     * @return 实例对象
     */
    Member queryById(Integer memberid);

    /**
     * 查询指定行数据
     *
     * @param member 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Member> queryAllByLimit(Member member, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param member 查询条件
     * @return 总行数
     */
    long count(Member member);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 影响行数
     */
    int insert(Member member);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Member> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Member> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Member> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Member> entities);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 影响行数
     */
    int update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param memberid 主键
     * @return 影响行数
     */
    int deleteById(Integer memberid);

}

