package com.rezero.service;

import com.rezero.pojo.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public interface DeptService {

    /**
     * 查询 dept 表所有数据
     * @return
     */
    List<Dept> list();

    /**
     * 接收路径参数 id 并从数据库删除对应部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    void add(Dept dept);

    /**
     * 根据 ID 查询部门
     * @return
     */
    Dept getById(Integer id);

    /**
     * 修改部门数据
     * @param dept
     */
    void put(Dept dept);
}
