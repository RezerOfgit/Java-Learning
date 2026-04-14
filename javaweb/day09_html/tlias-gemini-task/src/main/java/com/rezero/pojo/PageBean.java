package com.rezero.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {

    private Long total; //总记录数
    private List rows; //数据列表
}
