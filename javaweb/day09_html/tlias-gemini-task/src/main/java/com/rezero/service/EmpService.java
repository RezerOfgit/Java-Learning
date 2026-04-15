package com.rezero.service;

import com.rezero.pojo.Dept;
import com.rezero.pojo.Emp;
import com.rezero.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    /**
     * 批量删除
     * @param ids
     */
    void delete(List<Integer> ids);

    /**
     * 新增员工
     * @param emp
     */
    void save(Emp emp);

    /**
     * 根据ID查询员工
     * @param id
     * @return
     */
    Emp getById(Integer id);

    /**
     * 更新员工
     * @param emp
     */
    void update(Emp emp);
}
