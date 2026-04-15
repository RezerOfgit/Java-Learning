package com.rezero.mapper;

import com.rezero.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@Mapper
public interface EmpMapper {

    //    List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
/*    在某些老版本的 Spring Boot 或没有开启特定编译参数的环境下，MyBatis 遇到多个参数会不认识 name、gender，
    它只会把你当成 arg0, arg1，从而报 BindingException。
    企业级防弹写法：只要 Mapper 接口参数大于等于 2 个，养成习惯加上 @Param：*/
    List<Emp> list(@Param("name") String name, @Param("gender") Short gender, @Param("begin") LocalDate begin, @Param("end") LocalDate end);


    /**
     * 批量删除
     * @param ids
     */
    void delete(@Param("ids") List<Integer> ids);

    /**
     * 新增员工
     * @param emp
     */
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime} )")
    void insert(Emp emp);
}
