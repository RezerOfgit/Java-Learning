package com.rezero.dao.impl;

import com.rezero.dao.EmpDao;
import com.rezero.pojo.Emp;
import com.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
//@Component //将当前类交给IOC容器管理，成为IOC容器中的bean
@Repository //默认是类名
//@Repository(value = "daoA")
//@Repository("daoA")
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
