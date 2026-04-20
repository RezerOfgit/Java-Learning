package com.rezero.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Re-zero
 * @version 1.0
 */
@Data
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDate entrydate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
