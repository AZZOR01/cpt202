package com.cpt202.fitness.service;

import com.cpt202.fitness.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Member)表服务接口
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
public interface MemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param memberid 主键
     * @return 实例对象
     */
    Member queryById(Integer memberid);

    /**
     * 分页查询
     *
     * @param member 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Member> queryByPage(Member member, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param memberid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer memberid);

}
