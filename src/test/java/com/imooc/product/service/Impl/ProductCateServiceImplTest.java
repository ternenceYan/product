package com.imooc.product.service.Impl;

import com.imooc.product.mapper.ProductCateMapper;
import com.imooc.product.pojo.ProductCate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCateServiceImplTest {

    @Autowired
    private ProductCateMapper productCateMapper;
    @Test
    public void findCategoryByTypeIn() throws Exception{
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        List<ProductCate> productCateList = productCateMapper.findCategoryByTypeIn(list);
        Assert.assertTrue(productCateList.size()>0);
    }
}