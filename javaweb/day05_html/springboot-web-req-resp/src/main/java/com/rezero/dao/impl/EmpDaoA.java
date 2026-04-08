package com.rezero.dao.impl;

import com.rezero.dao.EmpDao;
import com.rezero.pojo.Emp;
import com.utils.XmlParserUtils;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class EmpDaoA implements EmpDao {

    @Override
    public List<Emp> listEmp() {
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
