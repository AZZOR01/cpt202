package com.cpt202.fitness.controller;

import com.cpt202.fitness.entity.Appointment;
import com.cpt202.fitness.service.AppointmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;


/**
 * 教练预约(Appointment)表控制层
 *
 * @author makejava
 * @since 2024-04-17 14:13:02
 */
@RestController
@RequestMapping("appointment")
public class AppointmentController {
    /**
     * 服务对象
     */
    @Resource
    private AppointmentService appointmentService;

    /**
     * 分页查询
     *
     * @param appointment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Appointment>> queryByPage(Appointment appointment, PageRequest pageRequest) {
        return ResponseEntity.ok(this.appointmentService.queryByPage(appointment, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Appointment> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.appointmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param appointment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Appointment> add(Appointment appointment) {
        return ResponseEntity.ok(this.appointmentService.insert(appointment));
    }

    /**
     * 编辑数据
     *
     * @param appointment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Appointment> edit(Appointment appointment) {
        return ResponseEntity.ok(this.appointmentService.update(appointment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.appointmentService.deleteById(id));
    }

}

