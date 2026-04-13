package com.rezero;

import com.rezero.mapper.EmpMapper;
import com.rezero.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete() {
        empMapper.delete(17);
//        int delete = empMapper.delete(17);
//        System.out.println(delete);
        //输出结果 0 表示没有受到影响行 1 表示有1行受到影响
    }

    @Test
    public void testInsert() {
        //构造员工对象
        Emp emp = new Emp();
        emp.setId(17);
        emp.setUsername("Tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000, 12, 10));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        //执行新增员工信息操作
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }

    //更新员工
    @Test
    public void testUpdate() {
        //构造员工对象
        Emp emp = new Emp();
        emp.setId(17);
        emp.setUsername("Tom11");
        emp.setName("汤姆12");
        emp.setImage("1.jpg");
        emp.setGender((short)1);
        emp.setJob((short)1);
        emp.setEntrydate(LocalDate.of(2000, 12, 10));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        //执行更新员工信息操作
        empMapper.update(emp);
    }

    //根据ID查询员工
    @Test
    public void testGetById() {
        Emp emp = empMapper.getById(17);
        System.out.println(emp);
    }

    //根据条件查询员工
    @Test
    public void testList() {
        List<Emp> empList = empMapper.list("张", (short) 1, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
        System.out.println(empList);
    }

}
