package com.gaoxiong.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 订单编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 交易号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 客户编号
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 商户编码
     */
    @Column(name = "supplier_id")
    private Integer supplierId;

    /**
     * 商户名称
     */
    @Column(name = "supplier_name")
    private String supplierName;

    /**
     * 订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易 -5撤销申请
     */
    @Column(name = "order_status")
    private Byte orderStatus;

    /**
     * 用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     */
    @Column(name = "after_status")
    private Byte afterStatus;

    /**
     * 商品数量
     */
    @Column(name = "product_count")
    private Integer productCount;

    /**
     * 商品总价
     */
    @Column(name = "product_amount_total")
    private BigDecimal productAmountTotal;

    /**
     * 实际付款金额
     */
    @Column(name = "order_amount_total")
    private BigDecimal orderAmountTotal;

    /**
     * 运费金额
     */
    @Column(name = "logistics_fee")
    private BigDecimal logisticsFee;

    /**
     * 收货地址编码
     */
    @Column(name = "address_id")
    private Integer addressId;

    /**
     * 支付渠道 0余额 1微信 2支付宝
     */
    @Column(name = "pay_channel")
    private Byte payChannel;

    /**
     * 订单支付单号
     */
    @Column(name = "out_trade_no")
    private String outTradeNo;

    /**
     * 第三方支付流水号
     */
    @Column(name = "escrow_trade_no")
    private String escrowTradeNo;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Integer payTime;

    /**
     * 发货时间
     */
    @Column(name = "delivery_time")
    private Integer deliveryTime;

    /**
     * 订单结算状态 0未结算 1已结算
     */
    @Column(name = "order_settlement_status")
    private Byte orderSettlementStatus;

    /**
     * 订单结算时间
     */
    @Column(name = "order_settlement_time")
    private Integer orderSettlementTime;

    /**
     * 是否是套餐
     */
    @Column(name = "is_package")
    private String isPackage;

    /**
     * 是否是积分产品
     */
    @Column(name = "is_integral")
    private String isIntegral;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单编号
     *
     * @return order_no - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取交易号
     *
     * @return order_sn - 交易号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置交易号
     *
     * @param orderSn 交易号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 获取客户编号
     *
     * @return member_id - 客户编号
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置客户编号
     *
     * @param memberId 客户编号
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取商户编码
     *
     * @return supplier_id - 商户编码
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置商户编码
     *
     * @param supplierId 商户编码
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取商户名称
     *
     * @return supplier_name - 商户名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置商户名称
     *
     * @param supplierName 商户名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 获取订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易 -5撤销申请
     *
     * @return order_status - 订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易 -5撤销申请
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易 -5撤销申请
     *
     * @param orderStatus 订单状态 0未付款,1已付款,2已发货,3已签收,-1退货申请,-2退货中,-3已退货,-4取消交易 -5撤销申请
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     *
     * @return after_status - 用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     */
    public Byte getAfterStatus() {
        return afterStatus;
    }

    /**
     * 设置用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     *
     * @param afterStatus 用户售后状态 0 未发起售后 1 申请售后 -1 售后已取消 2 处理中 200 处理完毕
     */
    public void setAfterStatus(Byte afterStatus) {
        this.afterStatus = afterStatus;
    }

    /**
     * 获取商品数量
     *
     * @return product_count - 商品数量
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 设置商品数量
     *
     * @param productCount 商品数量
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    /**
     * 获取商品总价
     *
     * @return product_amount_total - 商品总价
     */
    public BigDecimal getProductAmountTotal() {
        return productAmountTotal;
    }

    /**
     * 设置商品总价
     *
     * @param productAmountTotal 商品总价
     */
    public void setProductAmountTotal(BigDecimal productAmountTotal) {
        this.productAmountTotal = productAmountTotal;
    }

    /**
     * 获取实际付款金额
     *
     * @return order_amount_total - 实际付款金额
     */
    public BigDecimal getOrderAmountTotal() {
        return orderAmountTotal;
    }

    /**
     * 设置实际付款金额
     *
     * @param orderAmountTotal 实际付款金额
     */
    public void setOrderAmountTotal(BigDecimal orderAmountTotal) {
        this.orderAmountTotal = orderAmountTotal;
    }

    /**
     * 获取运费金额
     *
     * @return logistics_fee - 运费金额
     */
    public BigDecimal getLogisticsFee() {
        return logisticsFee;
    }

    /**
     * 设置运费金额
     *
     * @param logisticsFee 运费金额
     */
    public void setLogisticsFee(BigDecimal logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    /**
     * 获取收货地址编码
     *
     * @return address_id - 收货地址编码
     */
    public Integer getAddressId() {
        return addressId;
    }

    /**
     * 设置收货地址编码
     *
     * @param addressId 收货地址编码
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取支付渠道 0余额 1微信 2支付宝
     *
     * @return pay_channel - 支付渠道 0余额 1微信 2支付宝
     */
    public Byte getPayChannel() {
        return payChannel;
    }

    /**
     * 设置支付渠道 0余额 1微信 2支付宝
     *
     * @param payChannel 支付渠道 0余额 1微信 2支付宝
     */
    public void setPayChannel(Byte payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * 获取订单支付单号
     *
     * @return out_trade_no - 订单支付单号
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * 设置订单支付单号
     *
     * @param outTradeNo 订单支付单号
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * 获取第三方支付流水号
     *
     * @return escrow_trade_no - 第三方支付流水号
     */
    public String getEscrowTradeNo() {
        return escrowTradeNo;
    }

    /**
     * 设置第三方支付流水号
     *
     * @param escrowTradeNo 第三方支付流水号
     */
    public void setEscrowTradeNo(String escrowTradeNo) {
        this.escrowTradeNo = escrowTradeNo;
    }

    /**
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Integer getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取发货时间
     *
     * @return delivery_time - 发货时间
     */
    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置发货时间
     *
     * @param deliveryTime 发货时间
     */
    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取订单结算状态 0未结算 1已结算
     *
     * @return order_settlement_status - 订单结算状态 0未结算 1已结算
     */
    public Byte getOrderSettlementStatus() {
        return orderSettlementStatus;
    }

    /**
     * 设置订单结算状态 0未结算 1已结算
     *
     * @param orderSettlementStatus 订单结算状态 0未结算 1已结算
     */
    public void setOrderSettlementStatus(Byte orderSettlementStatus) {
        this.orderSettlementStatus = orderSettlementStatus;
    }

    /**
     * 获取订单结算时间
     *
     * @return order_settlement_time - 订单结算时间
     */
    public Integer getOrderSettlementTime() {
        return orderSettlementTime;
    }

    /**
     * 设置订单结算时间
     *
     * @param orderSettlementTime 订单结算时间
     */
    public void setOrderSettlementTime(Integer orderSettlementTime) {
        this.orderSettlementTime = orderSettlementTime;
    }

    /**
     * 获取是否是套餐
     *
     * @return is_package - 是否是套餐
     */
    public String getIsPackage() {
        return isPackage;
    }

    /**
     * 设置是否是套餐
     *
     * @param isPackage 是否是套餐
     */
    public void setIsPackage(String isPackage) {
        this.isPackage = isPackage;
    }

    /**
     * 获取是否是积分产品
     *
     * @return is_integral - 是否是积分产品
     */
    public String getIsIntegral() {
        return isIntegral;
    }

    /**
     * 设置是否是积分产品
     *
     * @param isIntegral 是否是积分产品
     */
    public void setIsIntegral(String isIntegral) {
        this.isIntegral = isIntegral;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return deleted_at
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}