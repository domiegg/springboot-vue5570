package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YulehuodongyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YulehuodongyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YulehuodongyuyueView;


/**
 * 娱乐活动预约
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YulehuodongyuyueService extends IService<YulehuodongyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YulehuodongyuyueVO> selectListVO(Wrapper<YulehuodongyuyueEntity> wrapper);
   	
   	YulehuodongyuyueVO selectVO(@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);
   	
   	List<YulehuodongyuyueView> selectListView(Wrapper<YulehuodongyuyueEntity> wrapper);
   	
   	YulehuodongyuyueView selectView(@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YulehuodongyuyueEntity> wrapper);

   	

}

