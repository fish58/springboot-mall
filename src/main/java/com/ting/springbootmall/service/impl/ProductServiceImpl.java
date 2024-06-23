package com.ting.springbootmall.service.impl;

import com.ting.springbootmall.dao.ProductDao;
import com.ting.springbootmall.model.Product;
import com.ting.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
