package com.shop.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 订单-商品-中间表
 */
public class OrderGoods  implements Serializable {
	/** 自增主键 */
	private Integer ogId;
	/** 订单id */
	private Integer ogOrderId;
	/** 商品id */
	private Integer ogGoodsId;
	/** 商品价格 */
	private BigDecimal goodPrice;
	/** 商品名称 */
	private String goodName;
	/** 逻辑删除 */
	private Byte isDeleted;

	private Goods goods;

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public OrderGoods() {

	}
	public OrderGoods(Integer ogOrderId) {
		this.ogOrderId = ogOrderId;
	}

	public OrderGoods(Integer ogOrderId, Integer ogGoodsId, BigDecimal goodPrice, String goodName) {
		this.ogOrderId = ogOrderId;
		this.ogGoodsId = ogGoodsId;
		this.goodPrice = goodPrice;
		this.goodName = goodName;
	}

	public void setOgId(Integer ogId) {
		this.ogId = ogId;
	}
	
	public Integer getOgId() {
		return this.ogId;
	}
	
	public void setOgOrderId(Integer ogOrderId) {
		this.ogOrderId = ogOrderId;
	}
	
	public Integer getOgOrderId() {
		return this.ogOrderId;
	}
	
	public void setOgGoodsId(Integer ogGoodsId) {
		this.ogGoodsId = ogGoodsId;
	}
	
	public Integer getOgGoodsId() {
		return this.ogGoodsId;
	}
	
	public void setGoodPrice(BigDecimal goodPrice) {
		this.goodPrice = goodPrice;
	}
	
	public BigDecimal getGoodPrice() {
		return this.goodPrice;
	}
	
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	
	public String getGoodName() {
		return this.goodName;
	}
	
	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public Byte getIsDeleted() {
		return this.isDeleted;
	}
	

	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        OrderGoods that = (OrderGoods) o;
        return ogId.equals(that.ogId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(ogId);
    }
    
    @Override
    public String toString() {
        return "OrderGoods{" +
				"ogId=" + ogId +
						",ogOrderId='" + ogOrderId + "'" + 
						",ogGoodsId='" + ogGoodsId + "'" + 
						",goodPrice='" + goodPrice + "'" + 
						",goodName='" + goodName + "'" + 
						",isDeleted='" + isDeleted + "'" + 
		                '}';
    }
	
}