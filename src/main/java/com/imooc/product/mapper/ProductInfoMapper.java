package com.imooc.product.mapper;

import com.imooc.product.pojo.ProductInfo;
import com.imooc.product.utils.MyMapper;

import java.util.List;

public interface ProductInfoMapper extends MyMapper<ProductInfo> {

    /**
     * 查询在架的商品
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
    List<ProductInfo> findByProductId (List<String> productIdList) throws Exception;

}