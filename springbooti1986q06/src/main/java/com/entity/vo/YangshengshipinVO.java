package com.entity.vo;

import com.entity.YangshengshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 养生视频
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public class YangshengshipinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 视频简介
	 */
	
	private String shipinjianjie;
		
	/**
	 * 视频封面
	 */
	
	private String shipinfengmian;
		
	/**
	 * 视频内容
	 */
	
	private String shipinneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 评论数
	 */
	
	private Integer discussnum;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：视频简介
	 */
	 
	public void setShipinjianjie(String shipinjianjie) {
		this.shipinjianjie = shipinjianjie;
	}
	
	/**
	 * 获取：视频简介
	 */
	public String getShipinjianjie() {
		return shipinjianjie;
	}
				
	
	/**
	 * 设置：视频封面
	 */
	 
	public void setShipinfengmian(String shipinfengmian) {
		this.shipinfengmian = shipinfengmian;
	}
	
	/**
	 * 获取：视频封面
	 */
	public String getShipinfengmian() {
		return shipinfengmian;
	}
				
	
	/**
	 * 设置：视频内容
	 */
	 
	public void setShipinneirong(String shipinneirong) {
		this.shipinneirong = shipinneirong;
	}
	
	/**
	 * 获取：视频内容
	 */
	public String getShipinneirong() {
		return shipinneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：评论数
	 */
	 
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
