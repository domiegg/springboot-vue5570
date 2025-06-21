package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 艺术字画鉴赏
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@TableName("yishuzihuajianshang")
public class YishuzihuajianshangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YishuzihuajianshangEntity() {
		
	}
	
	public YishuzihuajianshangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 作品名称
	 */
					
	private String zuopinmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作品名称
	 */
	public void setZuopinmingcheng(String zuopinmingcheng) {
		this.zuopinmingcheng = zuopinmingcheng;
	}
	/**
	 * 获取：作品名称
	 */
	public String getZuopinmingcheng() {
		return zuopinmingcheng;
	}
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
