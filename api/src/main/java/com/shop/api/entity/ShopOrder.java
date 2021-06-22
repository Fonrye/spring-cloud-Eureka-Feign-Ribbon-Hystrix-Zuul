package com.shop.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 订单表
 */
public class ShopOrder  implements Serializable {
	/** 订单号*/
	private Integer orderId;
	/** 总费用 */
	private BigDecimal fee;
	/** 用户id*/
	private Integer ouid;
	/** 订单状态(待支付，已付款，待发货，发货中，派送中，已接单) */
	private String oState;
	/** 下单时间 */
	private Date createTime;

	private List<OrderGoods> orderGoodsList;


	
	public List<OrderGoods> getOrderGoodsList() {
		return orderGoodsList;
	}

	public void setOrderGoodsList(List<OrderGoods> orderGoodsList) {
		this.orderGoodsList = orderGoodsList;
	}

	public ShopOrder() {
		this.orderId = Integer.parseInt(new SimpleDateFormat("HHmmssSSS").format(new Date()));
	}

	public ShopOrder(Integer orderId, BigDecimal fee, Integer ouid, String oState, Date createTime) {
		this.orderId = orderId;
		this.fee = fee;
		this.ouid = ouid;
		this.oState = oState;
		this.createTime = createTime;
	}

	public ShopOrder(BigDecimal fee, Integer ouid) {
		this.fee = fee;
		this.ouid = ouid;
		this.orderId = Integer.parseInt(new SimpleDateFormat("HHmmssSSS").format(new Date()));
	}

	public Integer getOuid() {
		return ouid;
	}

	public void setOuid(Integer ouid) {
		this.ouid = ouid;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	public Integer getOrderId() {
		return this.orderId;
	}

	public String getoState() {
		return oState;
	}

	public void setoState(String oState) {
		this.oState = oState;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	
	public BigDecimal getFee() {
		return this.fee;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	

	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        ShopOrder that = (ShopOrder) o;
        return orderId.equals(that.orderId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(orderId);
    }

	@Override
	public String toString() {
		return "ShopOrder{" +
				"orderId=" + orderId +
				", fee=" + fee +
				", ouid=" + ouid +
				", oState='" + oState + '\'' +
				", createTime=" + createTime +
				'}';
	}
}