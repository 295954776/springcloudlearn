package com.example.service;

import com.example.Product;
import com.example.ProductClientFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 15:55
 * @Description: TODO
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @RequestMapping("/products")
    List<Product> listProdcuts();
}
