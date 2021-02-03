package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 14:56
 * @Description: TODO
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();

    }
}
