package com.entity.view;

import com.entity.DuihuanjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 兑换积分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@TableName("duihuanjifen")
public class DuihuanjifenView  extends DuihuanjifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DuihuanjifenView(){
	}
 
 	public DuihuanjifenView(DuihuanjifenEntity duihuanjifenEntity){
 	try {
			BeanUtils.copyProperties(this, duihuanjifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
