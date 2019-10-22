package com.imooc.product.service.Impl;

import com.imooc.product.mapper.ProductCateMapper;
import com.imooc.product.pojo.ProductCate;
import com.imooc.product.service.ProductCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCateServiceImpl implements ProductCateService {
    @Autowired
    private ProductCateMapper productCateMapper;

    @Override
    public List<ProductCate> geProductCategoryByName(String name) throws Exception {
        List<ProductCate> list = productCateMapper.geProductCategoryByName(name);
        return list;
    }

    @Override
    public List<ProductCate> findCategoryByTypeIn(List<Integer> categoryTypeList) throws Exception {
        List<ProductCate> productCateList = productCateMapper.findCategoryByTypeIn(categoryTypeList);
        return productCateList;
    }
}
