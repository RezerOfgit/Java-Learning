package com.rezero.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Re-zero
 * @version 1.0
 */
@Data
public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
    private LocalDateTime stockTime;
    private String category;
    private Integer categoryId;
}
