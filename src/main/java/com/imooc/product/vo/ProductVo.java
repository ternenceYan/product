package com.imooc.product.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductVo {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVos;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public List<ProductInfoVo> getProductInfoVos() {
        return productInfoVos;
    }

    public void setProductInfoVos(List<ProductInfoVo> productInfoVos) {
        this.productInfoVos = productInfoVos;
    }
}
