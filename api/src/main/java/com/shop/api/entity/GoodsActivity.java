package com.shop.api.entity;


import java.io.Serializable;

/**
 * 折扣活动-商品中间表
 */
public class GoodsActivity  implements Serializable {
	/** 自增主键 */
	private Integer gaId;
	/** 活动id */
	private Integer activityId;
	/** 商品id */
	private Integer goodsId;
	/** 逻辑删除 */
	private Byte isDeleted;

	public void setGaId(Integer gaId) {
		this.gaId = gaId;
	}
	
	public Integer getGaId() {
		return this.gaId;
	}
	
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	
	public Integer getActivityId() {
		return this.activityId;
	}
	
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Integer getGoodsId() {
		return this.goodsId;
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
        GoodsActivity that = (GoodsActivity) o;
        return gaId.equals(that.gaId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(gaId);
    }
    
    @Override
    public String toString() {
        return "GoodsActivity{" +
				"gaId=" + gaId +
						",activityId='" + activityId + "'" + 
						",goodsId='" + goodsId + "'" + 
						",isDeleted='" + isDeleted + "'" + 
		                '}';
    }
	
}