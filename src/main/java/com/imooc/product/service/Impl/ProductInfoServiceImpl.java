package com.imooc.product.service.Impl;

import com.imooc.product.mapper.ProductInfoMapper;
import com.imooc.product.pojo.ProductInfo;
import com.imooc.product.service.ProductInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Override
    public List<ProductInfo> findByProductStatus(Integer status) throws Exception {
        List<ProductInfo> productInfos = productInfoMapper.findByProductStatus(status);
        return productInfos;
    }

    @Override
    public List<ProductInfo> findByProductId(List<String> productIdList) throws Exception {

        List<ProductInfo> productInfoList = productInfoMapper.findByProductId(productIdList);
        return productInfoList;
    }
}
