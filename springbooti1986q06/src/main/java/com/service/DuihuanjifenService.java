package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuihuanjifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuihuanjifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuihuanjifenView;


/**
 * 兑换积分
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface DuihuanjifenService extends IService<DuihuanjifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuihuanjifenVO> selectListVO(Wrapper<DuihuanjifenEntity> wrapper);
   	
   	DuihuanjifenVO selectVO(@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);
   	
   	List<DuihuanjifenView> selectListView(Wrapper<DuihuanjifenEntity> wrapper);
   	
   	DuihuanjifenView selectView(@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuihuanjifenEntity> wrapper);

   	

}

