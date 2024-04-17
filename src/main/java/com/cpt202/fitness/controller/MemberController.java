package com.cpt202.fitness.controller;

import com.cpt202.fitness.entity.Member;
import com.cpt202.fitness.service.MemberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * (Member)表控制层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
@RestController
@RequestMapping("member")
public class MemberController {
    /**
     * 服务对象
     */
    @Resource
    private MemberService memberService;

    /**
     * 分页查询
     *
     * @param member 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Member>> queryByPage(Member member, PageRequest pageRequest) {
        return ResponseEntity.ok(this.memberService.queryByPage(member, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Member> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.memberService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param member 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Member> add(Member member) {
        return ResponseEntity.ok(this.memberService.insert(member));
    }

    /**
     * 编辑数据
     *
     * @param member 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Member> edit(Member member) {
        return ResponseEntity.ok(this.memberService.update(member));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.memberService.deleteById(id));
    }

}

