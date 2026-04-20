package com.rezero.dao;

import com.rezero.pojo.Emp;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public interface EmpDao {
    //获取员工列表数据
    public List<Emp> listEmp();
}
