package com.rezero.mapper;

import com.rezero.pojo.Emp;
import org.apache.ibatis.annotations.*;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@Mapper
public interface EmpMapper {

    //根据ID删除数据
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);
//    public int delete(Integer id);

    //新增员工, #{}内需使用驼峰命名法
    @Options(keyProperty = "id", useGeneratedKeys = true) //获取返回的主键
    @Insert("insert into emp (id, username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "values (#{id}, #{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);//存放多个数据时, 封装在对象中

    //更新员工
    @Update("UPDATE emp SET USERNAME = #{username}, NAME = #{name}, GENDER = #{gender}, IMAGE = #{image}, " +
            "JOB = #{job}, ENTRYDATE = #{entrydate}, DEPT_ID = #{deptId}, UPDATE_TIME = #{updateTime} WHERE id = #{id};")
    public void update(Emp emp);

    //方案三: 开启mybatis的驼峰命名自动映射开关 --- a_column ----> aColumn
    //根据ID查询员工
    @Select("SELECT * FROM EMP WHERE id = #{id}")
    public Emp getById(Integer id);
    //Emp(id=17, username=Tom11, password=123456, name=汤姆12, gender=1, image=1.jpg, job=1, entrydate=2000-12-10, deptId=null, createTime=null, updateTime=null)

    //方案一: 给字段起别名, 让别名与实体类属性一致
/*    @Select("SELECT id, username, name, gender, image, job, entrydate, " +
            "dept_id deptId, create_time createTime, update_time updateTime FROM EMP WHERE id = #{id}")
    public Emp getById(Integer id);*/

    //方案二: 通过@Results, @Result注解手动映射封装
/*    @Results({
            @Result(column = "dept_id", property = "deptId"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    @Select("SELECT * FROM EMP WHERE id = #{id}")
    public Emp getById(Integer id);*/

    //条件查询员工  '%${name}%'不能用#, 因为#{}不能在引号中
    /*@Select("SELECT * FROM EMP WHERE NAME LIKE '%${name}%' AND GENDER = #{gender} AND " +
            "ENTRYDATE BETWEEN #{begin} AND #{end} ORDER BY UPDATE_TIME DESC")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);*/

    @Select("SELECT * FROM EMP WHERE NAME LIKE concat('%', #{name}, '%') AND GENDER = #{gender} AND " +
            "ENTRYDATE BETWEEN #{begin} AND #{end} ORDER BY UPDATE_TIME DESC")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}
