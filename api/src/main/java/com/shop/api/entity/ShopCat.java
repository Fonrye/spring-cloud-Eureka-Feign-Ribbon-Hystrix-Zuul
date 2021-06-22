package com.shop.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 购物车
 */
public class ShopCat  implements Serializable {
	/** 自增主键 */
	private Integer shopCatId;
	/** 用户id */
	private Integer uid;
	/** 商品id */
	private Integer gId;
	/** 商品数量 */
	private Integer gnum;
	/** 创建时间 */
	private Date createTime;
	/** 逻辑删除 */
	private Byte isDeleted;


	private Goods goods;

	public ShopCat() {
	}

	public ShopCat(Integer shopCatId) {
		this.shopCatId = shopCatId;
	}

	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public Integer getGnum() {
		return gnum;
	}

	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public void setShopCatId(Integer shopCatId) {
		this.shopCatId = shopCatId;
	}
	
	public Integer getShopCatId() {
		return this.shopCatId;
	}
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public Integer getUid() {
		return this.uid;
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
        ShopCat that = (ShopCat) o;
        return shopCatId.equals(that.shopCatId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(shopCatId);
    }

	@Override
	public String toString() {
		return "ShopCat{" +
				"shopCatId=" + shopCatId +
				", uid=" + uid +
				", gId=" + gId +
				", gnum=" + gnum +
				", createTime=" + createTime +
				", isDeleted=" + isDeleted +
				", goods=" + goods +
				'}';
	}
}