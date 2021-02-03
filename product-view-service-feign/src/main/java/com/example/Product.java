package com.example;

import lombok.Data;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 15:55
 * @Description: TODO
 */
@Data
public class Product {
    private int id;
    private String name;
    private int price;
    private String version;

    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
