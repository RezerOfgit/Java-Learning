package com.rezero.service;

import com.rezero.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public interface EmpService {

    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void delete(List<Integer> ids);
}
