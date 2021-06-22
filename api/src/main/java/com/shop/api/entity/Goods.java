package com.shop.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品管理
 */
public class Goods  implements Serializable {
	/** 自增主键 */
	private Integer goodsId;
	/** 名称 */
	private String name;
	/** 价格 */
	private BigDecimal price;
	/** 描述 */
	private String describ;
	/** 商品分类 */
	private String classify;
	/** 图片路径 */
	private String imgPath;
	/** 图片名称 */
	private String imgName;
	/** 创建时间 */
	private Date createTime;
	/** 逻辑删除 */
	private Byte idDeleted;

	public Goods() {
	}
	public Goods(String name, BigDecimal price, String describ, String classify) {
		this.name = name;
		this.price = price;
		this.describ = describ;
		this.classify = classify;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	public Integer getGoodsId() {
		return this.goodsId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public BigDecimal getPrice() {
		return this.price;
	}
	
	public void setDescrib(String describ) {
		this.describ = describ;
	}
	
	public String getDescrib() {
		return this.describ;
	}
	
	public void setClassify(String classify) {
		this.classify = classify;
	}
	
	public String getClassify() {
		return this.classify;
	}
	
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public String getImgPath() {
		return this.imgPath;
	}
	
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	public String getImgName() {
		return this.imgName;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
	public void setIdDeleted(Byte idDeleted) {
		this.idDeleted = idDeleted;
	}
	
	public Byte getIdDeleted() {
		return this.idDeleted;
	}
	

	@Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) {return false;}
        Goods that = (Goods) o;
        return goodsId.equals(that.goodsId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(goodsId);
    }
    
    @Override
    public String toString() {
        return "Goods{" +
				"goodsId=" + goodsId +
						",name='" + name + "'" + 
						",price='" + price + "'" + 
						",describ='" + describ + "'" + 
						",classify='" + classify + "'" + 
						",imgPath='" + imgPath + "'" + 
						",imgName='" + imgName + "'" + 
						",createTime='" + createTime + "'" + 
						",idDeleted='" + idDeleted + "'" + 
		                '}';
    }
	
}