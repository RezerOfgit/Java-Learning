package com.rezero.controller;

import com.rezero.pojo.Dept;
import com.rezero.pojo.Result;
import com.rezero.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 部门管理Controller
 */
//@Lazy // 延迟初始化
@Scope("prototype")
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    public DeptController() {
        System.out.println("DeptController constructor...");
    }

    /**
     * 查询部门数据
     * @return
     */
    @GetMapping
    public Result list() {

        log.info("查询全部部门数据");

        //调用service查询部门数据
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    /**
     * 删除部门
     * @return
     */
//    @Log
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) throws Exception {
        log.info("根据id删除部门: {}", id); //{} 是代替id的
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }

    /**
     * 新增部门
     * @param dept
     * @return
     */
//    @Log
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门: {}", dept);
        //调用service新增部门
        deptService.add(dept);
        return Result.success();
    }

}
