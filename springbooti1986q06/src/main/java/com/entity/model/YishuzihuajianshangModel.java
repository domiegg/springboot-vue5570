package com.entity.model;

import com.entity.YishuzihuajianshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 艺术字画鉴赏
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public class YishuzihuajianshangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品简介
	 */
	
	private String zuopinjianjie;
		
	/**
	 * 作品封面
	 */
	
	private String zuopinfengmian;
		
	/**
	 * 作品背景
	 */
	
	private String zuopinbeijing;
		
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
	 * 设置：作品简介
	 */
	 
	public void setZuopinjianjie(String zuopinjianjie) {
		this.zuopinjianjie = zuopinjianjie;
	}
	
	/**
	 * 获取：作品简介
	 */
	public String getZuopinjianjie() {
		return zuopinjianjie;
	}
				
	
	/**
	 * 设置：作品封面
	 */
	 
	public void setZuopinfengmian(String zuopinfengmian) {
		this.zuopinfengmian = zuopinfengmian;
	}
	
	/**
	 * 获取：作品封面
	 */
	public String getZuopinfengmian() {
		return zuopinfengmian;
	}
				
	
	/**
	 * 设置：作品背景
	 */
	 
	public void setZuopinbeijing(String zuopinbeijing) {
		this.zuopinbeijing = zuopinbeijing;
	}
	
	/**
	 * 获取：作品背景
	 */
	public String getZuopinbeijing() {
		return zuopinbeijing;
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
