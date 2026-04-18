package com.rezero.service.impl;


import com.rezero.mapper.DeptMapper;
import com.rezero.pojo.Dept;
import com.rezero.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    //    @Transactional(rollbackFor = Exception.class) //spring事务管理
    @Transactional
    @Override
    public void delete(Integer id) throws Exception {
        deptMapper.deleteById(id); //根据ID删除部门数据
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());

        deptMapper.insert(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }
}
