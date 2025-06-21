package com.entity.view;

import com.entity.TijianjiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 体检健康信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
@TableName("tijianjiankangxinxi")
public class TijianjiankangxinxiView  extends TijianjiankangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijianjiankangxinxiView(){
	}
 
 	public TijianjiankangxinxiView(TijianjiankangxinxiEntity tijianjiankangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tijianjiankangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
