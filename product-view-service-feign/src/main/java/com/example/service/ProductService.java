package com.example.service;

import com.example.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 15:59
 * @Description: TODO
 */
@Service
public class ProductService {

    @Autowired
    private ProductClientFeign productClientFeign;

    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();

    }
}
