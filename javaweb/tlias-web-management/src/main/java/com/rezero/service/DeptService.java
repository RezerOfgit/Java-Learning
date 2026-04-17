package com.rezero.service;

import com.rezero.pojo.Dept;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 部门管理
 */
public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Dept> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id) throws Exception;

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);
}
