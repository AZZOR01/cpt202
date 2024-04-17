package com.cpt202.fitness.controller;

import com.cpt202.fitness.entity.Trainproject;
import com.cpt202.fitness.service.TrainprojectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * 健身项目(Trainproject)表控制层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
@RestController
@RequestMapping("trainproject")
public class TrainprojectController {
    /**
     * 服务对象
     */
    @Resource
    private TrainprojectService trainprojectService;

    /**
     * 分页查询
     *
     * @param trainproject 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Trainproject>> queryByPage(Trainproject trainproject, PageRequest pageRequest) {
        return ResponseEntity.ok(this.trainprojectService.queryByPage(trainproject, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Trainproject> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.trainprojectService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param trainproject 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Trainproject> add(Trainproject trainproject) {
        return ResponseEntity.ok(this.trainprojectService.insert(trainproject));
    }

    /**
     * 编辑数据
     *
     * @param trainproject 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Trainproject> edit(Trainproject trainproject) {
        return ResponseEntity.ok(this.trainprojectService.update(trainproject));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.trainprojectService.deleteById(id));
    }

}

