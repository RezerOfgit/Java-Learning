package com.rezero.service.impl;

import com.rezero.mapper.DeptMapper;
import com.rezero.pojo.Dept;
import com.rezero.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }

    /**
     * 根据 ID 查询部门
     * @param id
     * @return
     */
    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    /**
     * 修改部门数据
     * @param dept
     */
    @Override
    public void put(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.update(dept);
    }
}
