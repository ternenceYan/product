package com.imooc.product.mapper;

import com.imooc.product.pojo.ProductCate;
import com.imooc.product.utils.MyMapper;

import java.util.List;

public interface ProductCateMapper extends MyMapper<ProductCate> {
    List<ProductCate> geProductCategoryByName(String name) throws Exception;

    /**
     * 根据商品的类别编号查询类别信息
     * @param categoryTypeList
     * @return
     * @throws Exception
     */
    List<ProductCate> findCategoryByTypeIn (List<Integer> categoryTypeList) throws Exception;
}