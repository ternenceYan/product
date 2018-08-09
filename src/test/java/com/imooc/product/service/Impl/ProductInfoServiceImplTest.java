package com.imooc.product.service.Impl;

import com.imooc.product.mapper.ProductInfoMapper;
import com.imooc.product.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> productInfos = productInfoMapper.findByProductStatus(0);
        Assert.assertTrue(productInfos.size()>0);
    }

    @Test
    public void findByProductId() throws Exception{
        List<ProductInfo> productInfoList = productInfoMapper.findByProductId(Arrays.asList("000001"));
        Assert.assertTrue(productInfoList.size()>0);
    }
}