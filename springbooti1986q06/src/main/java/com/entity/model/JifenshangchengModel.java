package com.entity.model;

import com.entity.JifenshangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 积分商城
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public class JifenshangchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
		
	/**
	 * 商品数量
	 */
	
	private Integer shangpinshuliang;
		
	/**
	 * 兑换积分
	 */
	
	private Integer duihuanjifen;
		
	/**
	 * 商品图片
	 */
	
	private String shangpintupian;
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
				
	
	/**
	 * 设置：商品数量
	 */
	 
	public void setShangpinshuliang(Integer shangpinshuliang) {
		this.shangpinshuliang = shangpinshuliang;
	}
	
	/**
	 * 获取：商品数量
	 */
	public Integer getShangpinshuliang() {
		return shangpinshuliang;
	}
				
	
	/**
	 * 设置：兑换积分
	 */
	 
	public void setDuihuanjifen(Integer duihuanjifen) {
		this.duihuanjifen = duihuanjifen;
	}
	
	/**
	 * 获取：兑换积分
	 */
	public Integer getDuihuanjifen() {
		return duihuanjifen;
	}
				
	
	/**
	 * 设置：商品图片
	 */
	 
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
			
}
