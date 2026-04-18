package com.rezero.controller;

import com.rezero.anno.Log;
import com.rezero.pojo.Emp;
import com.rezero.pojo.PageBean;
import com.rezero.pojo.Result;
import com.rezero.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 员工管理Controller
 */
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        log.info("分页查询, 参数: {}, {}, {}, {}, {}, {}", page, pageSize, name, gender, begin, end);
        //调用service分页查询
        PageBean pageBean = empService.page(page, pageSize, name, gender, begin, end);
        return Result.success(pageBean);
    }

    /**
     * @DeleteMapping 不指定路径，默认匹配 /emps（假设类上有 @RequestMapping("/emps")）。
     * @RequestParam(required = false) 表示 ids 参数可选，如果不传则为 null。
     * @param ids
     * @return
     */
//    @DeleteMapping
//    public Result delete(@PathVariable(required = false) List<Integer> ids) {
    @Log
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids) {
        if (ids == null || ids.isEmpty()) {
            log.info("删除操作的ID列表为空，不执行删除");
            return Result.success();  // 返回成功，但不删除任何数据
        }

        log.info("批量删除操作, ids: {}", ids);
        empService.delete(ids);
        return Result.success();
    }

    /**
     * 新增员工
     * @param emp
     * @return
     */
    @Log
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("新增员工, emp: {}", emp);
        empService.save(emp);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据ID查询员工信息, id: {}", id);
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    /**
     * 更新员工
     * @param emp
     * @return
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Emp emp) {
        log.info("更新员工信息 : {}", emp);
        empService.update(emp);
        return Result.success();
    }
}
