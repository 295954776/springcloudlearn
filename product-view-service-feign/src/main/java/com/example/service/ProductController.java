package com.example.service;

import com.example.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 15:59
 * @Description: TODO
 */
@RefreshScope
@RestController
public class ProductController {
    @Value("${version}")
    String version;

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> products() {
        List<Product> ps = productService.listProducts();
        for (Product product : ps) {
            product.setVersion(version);
        }
        return ps;
    }
}
