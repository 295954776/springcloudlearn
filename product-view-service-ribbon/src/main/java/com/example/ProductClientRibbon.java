package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/1/26 14:56
 * @Description: TODO
 */
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}
