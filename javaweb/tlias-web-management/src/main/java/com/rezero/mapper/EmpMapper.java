package com.rezero.mapper;

import com.rezero.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 * 员工管理
 */
@Mapper
public interface EmpMapper {

//   /**
//     * 查询记录数
//     * @return
//     */
//    @Select("select count(*) from emp")
//    public Long count();
//
//    /**
//     * 分页查询,获取列表数据
//     * @param start
//     * @param pageSize
//     * @return
//     */
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start, Integer pageSize);

    /**
     * 员工信息查询
     * @return
     */
//    @Select("select * from emp")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

}
