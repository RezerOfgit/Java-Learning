package com.rezero.controller;

import com.rezero.pojo.Dept;
import com.rezero.pojo.Result;
import com.rezero.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 查询 dept 表所有数据
     * @return
     */
    @GetMapping
    public Result list() {
        log.info("查询 dept 表所有数据");

        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("接收路径参数 id 删除对应部门: {}", id);

        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @param dept
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门: {}", dept);

        deptService.add(dept);
        return Result.success();
    }
}
