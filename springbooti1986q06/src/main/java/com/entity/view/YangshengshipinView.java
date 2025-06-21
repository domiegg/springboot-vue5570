package com.entity.view;

import com.entity.YangshengshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 养生视频
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@TableName("yangshengshipin")
public class YangshengshipinView  extends YangshengshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YangshengshipinView(){
	}
 
 	public YangshengshipinView(YangshengshipinEntity yangshengshipinEntity){
 	try {
			BeanUtils.copyProperties(this, yangshengshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
