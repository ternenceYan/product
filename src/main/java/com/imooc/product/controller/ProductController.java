package com.imooc.product.controller;

import com.imooc.product.pojo.ProductCate;
import com.imooc.product.pojo.ProductInfo;
import com.imooc.product.service.ProductCateService;
import com.imooc.product.service.ProductInfoService;
import com.imooc.product.vo.ProductInfoVo;
import com.imooc.product.vo.ProductVo;
import com.imooc.product.vo.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanyy
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 1.查询所有在架的商品
     * 2.获取类目type列表
     * 3.查询类目
     * 4.构造数据
     */

    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCateService productCateService;

    @RequestMapping("findProduct")
    public ResultData<ProductVo> list () throws Exception{
        long startTime = System.currentTimeMillis();
        Integer status = 0 ;
        List<ProductInfo> productInfos = productInfoService.findByProductStatus(status);
        List<Integer> categoryTypeList = productInfos.stream().map(ProductInfo::getCategorytype).
                collect(Collectors.toList());
        List<ProductCate> productCateList = productCateService.findCategoryByTypeIn(categoryTypeList);

        List<ProductVo> productVoList = new ArrayList<>();
        for (ProductCate productCate : productCateList) {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCate.getCategoryname());
            productVo.setCategoryType(productCate.getCategorytype());

            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfos) {
                if (productInfo.getCategorytype().equals(productCate.getCategorytype())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    productInfoVo.setProductDescription(productInfo.getProductdescription());
                    productInfoVo.setProductIcon(productInfo.getProducticon());
                    productInfoVo.setProductId(productInfo.getProductid());
                    productInfoVo.setProductName(productInfo.getProductname());
                    productInfoVo.setProductPrice(productInfo.getProductprice());
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVo.setProductInfoVos(productInfoVoList);
            productVoList.add(productVo);
        }
        ResultData resultData = new ResultData();
        resultData.setData(productVoList);
        resultData.setCode(0);
        resultData.setMsg("ok");
        System.out.println(System.currentTimeMillis()-startTime+"=============================");
        return resultData;
    }

    @RequestMapping("getProductCategoryByName")
    public List<ProductCate> getProductCategoryByName (@RequestParam String name) throws Exception {
        List<ProductCate> list = productCateService.geProductCategoryByName(name);
        logger.info("根据name获取产品类目..................NAME:{}",name);
        return list;
    }

    @RequestMapping("findCategoryByTypeIn")
    public List<ProductCate> findCategoryByTypeIn () throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<ProductCate> productCateList = productCateService.findCategoryByTypeIn(list);
        return  productCateList;
    }

    //获取商品列表，给订单服务用的
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList)throws Exception {
        logger.info("开始准备查询商品=========================");
        List<ProductInfo> productInfoList = productInfoService.findByProductId(productIdList);
        logger.info("商品：{}",productInfoList);
        return productInfoList;
    }
}
