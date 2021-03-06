package com.imooc.product.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.detailid
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private String detailid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.orderid
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private String orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.productid
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private String productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.productname
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private String productname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.productprice
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private BigDecimal productprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.productquantity
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private Integer productquantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.producticon
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private String producticon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.createtime
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.updatetime
     *
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.detailid
     *
     * @return the value of order_detail.detailid
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public String getDetailid() {
        return detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.detailid
     *
     * @param detailid the value for order_detail.detailid
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setDetailid(String detailid) {
        this.detailid = detailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.orderid
     *
     * @return the value of order_detail.orderid
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.orderid
     *
     * @param orderid the value for order_detail.orderid
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.productid
     *
     * @return the value of order_detail.productid
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public String getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.productid
     *
     * @param productid the value for order_detail.productid
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.productname
     *
     * @return the value of order_detail.productname
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public String getProductname() {
        return productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.productname
     *
     * @param productname the value for order_detail.productname
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.productprice
     *
     * @return the value of order_detail.productprice
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public BigDecimal getProductprice() {
        return productprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.productprice
     *
     * @param productprice the value for order_detail.productprice
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.productquantity
     *
     * @return the value of order_detail.productquantity
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public Integer getProductquantity() {
        return productquantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.productquantity
     *
     * @param productquantity the value for order_detail.productquantity
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setProductquantity(Integer productquantity) {
        this.productquantity = productquantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.producticon
     *
     * @return the value of order_detail.producticon
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public String getProducticon() {
        return producticon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.producticon
     *
     * @param producticon the value for order_detail.producticon
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setProducticon(String producticon) {
        this.producticon = producticon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.createtime
     *
     * @return the value of order_detail.createtime
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.createtime
     *
     * @param createtime the value for order_detail.createtime
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.updatetime
     *
     * @return the value of order_detail.updatetime
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.updatetime
     *
     * @param updatetime the value for order_detail.updatetime
     * @mbggenerated Tue Jul 31 00:35:23 CST 2018
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}