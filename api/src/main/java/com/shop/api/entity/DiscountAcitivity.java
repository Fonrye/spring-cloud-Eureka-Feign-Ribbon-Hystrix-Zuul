package com.shop.api.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 商品活动表
 */
public class DiscountAcitivity implements Serializable {
	private Integer activityId;
	/** 折扣 */
	private Float discount;
	/** 活动内容 */
	private String activityContent;
	/** 开始时间 */
	private Date startTime;
	/** 截止时间 */
	private Date endTime;
	/** 创建时间 */
	private Date createTime;
	/** 逻辑删除标识 */
	private Byte isDeleted;

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	
	public Integer getActivityId() {
		return this.activityId;
	}
	
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	
	public Float getDiscount() {
		return this.discount;
	}
	
	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}
	
	public String getActivityContent() {
		return this.activityContent;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public Date getEndTime() {
		return this.endTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getCreateTime() {
		return this.createTime;
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
        DiscountAcitivity that = (DiscountAcitivity) o;
        return activityId.equals(that.activityId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(activityId);
    }
    
    @Override
    public String toString() {
        return "DiscountAcitivity{" +
				"activityId=" + activityId +
						",discount='" + discount + "'" + 
						",activityContent='" + activityContent + "'" + 
						",startTime='" + startTime + "'" + 
						",endTime='" + endTime + "'" + 
						",createTime='" + createTime + "'" + 
						",isDeleted='" + isDeleted + "'" + 
		                '}';
    }

}