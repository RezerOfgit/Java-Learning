package com.rezero.mapper;

import com.rezero.pojo.DeptLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Re-zero
 * @version 1.0
 */
@Mapper
public interface DeptLogMapper {

    @Insert("insert into dept_log(creat_time, description) values (#{createTime}, #{description})")
    void insert(DeptLog log);

}
