package com.example.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 14:40
 * @Description: TODO
 */
@Data
@Accessors(chain = true)
public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
