package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuejiuzhenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuejiuzhenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuejiuzhenView;


/**
 * 预约就诊
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
public interface YuyuejiuzhenService extends IService<YuyuejiuzhenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuejiuzhenVO> selectListVO(Wrapper<YuyuejiuzhenEntity> wrapper);
   	
   	YuyuejiuzhenVO selectVO(@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);
   	
   	List<YuyuejiuzhenView> selectListView(Wrapper<YuyuejiuzhenEntity> wrapper);
   	
   	YuyuejiuzhenView selectView(@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuejiuzhenEntity> wrapper);

   	

}

