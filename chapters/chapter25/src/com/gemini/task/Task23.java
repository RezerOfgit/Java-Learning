package com.gemini.task;

import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task23 {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.queryMulti("SELECT * FROM product WHERE id = ?", Product.class, 101);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
