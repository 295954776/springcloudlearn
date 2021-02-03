package com.example;

import com.example.service.ProductClientFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: THM
 * @DateTime: 2021/2/3 13:42
 * @Description: TODO
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> listProdcuts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "产品数据微服务不可用", 0));
        return result;
    }
}
