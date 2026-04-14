package com.rezero.mapper;

import com.rezero.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@Mapper
public interface DeptMapper {

    /**
     * 查询 dept 表所有数据
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();

    /**
     * 接收路径参数 id 并从数据库删除对应部门
     * @param id
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param dept
     */
    @Insert("insert into dept (name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);
}
