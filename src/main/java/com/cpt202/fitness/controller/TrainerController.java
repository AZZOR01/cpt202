package com.cpt202.fitness.controller;

import com.cpt202.fitness.entity.Trainer;
import com.cpt202.fitness.service.TrainerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * 教练(Trainer)表控制层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
@RestController
@RequestMapping("trainer")
public class TrainerController {
    /**
     * 服务对象
     */
    @Resource
    private TrainerService trainerService;

    /**
     * 分页查询
     *
     * @param trainer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Trainer>> queryByPage(Trainer trainer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.trainerService.queryByPage(trainer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Trainer> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.trainerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param trainer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Trainer> add(Trainer trainer) {
        return ResponseEntity.ok(this.trainerService.insert(trainer));
    }

    /**
     * 编辑数据
     *
     * @param trainer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Trainer> edit(Trainer trainer) {
        return ResponseEntity.ok(this.trainerService.update(trainer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.trainerService.deleteById(id));
    }

}

