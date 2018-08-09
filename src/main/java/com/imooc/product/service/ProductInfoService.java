package com.imooc.product.service;

import com.imooc.product.pojo.ProductInfo;

import java.util.List;

public interface ProductInfoService {
    /**
     * 查询所有在架的商品
     * @param status
     * @return
     * @throws Exception
     */
    List<ProductInfo> findByProductStatus (Integer status) throws Exception;


    /**
     * 查询商品列表
     * @param productIdList
     * @return
     * @throws Exception
     */
    List<ProductInfo> findByProductId(List<String> productIdList) throws Exception;
}
