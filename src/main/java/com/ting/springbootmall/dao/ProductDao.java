package com.ting.springbootmall.dao;

import com.ting.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
