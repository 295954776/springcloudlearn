package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 14:57
 * @Description: TODO
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }
}
