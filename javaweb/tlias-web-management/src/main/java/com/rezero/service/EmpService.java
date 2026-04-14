package com.rezero.service;

import com.rezero.pojo.PageBean;

import java.time.LocalDate;

/**
 * @author Re-zero
 * @version 1.0
 */
public interface EmpService {
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);
}
