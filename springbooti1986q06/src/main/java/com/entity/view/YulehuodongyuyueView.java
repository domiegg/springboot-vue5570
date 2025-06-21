package com.entity.view;

import com.entity.YulehuodongyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 娱乐活动预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@TableName("yulehuodongyuyue")
public class YulehuodongyuyueView  extends YulehuodongyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YulehuodongyuyueView(){
	}
 
 	public YulehuodongyuyueView(YulehuodongyuyueEntity yulehuodongyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, yulehuodongyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
