package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YulehuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YulehuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YulehuodongView;


/**
 * 娱乐活动
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YulehuodongService extends IService<YulehuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YulehuodongVO> selectListVO(Wrapper<YulehuodongEntity> wrapper);
   	
   	YulehuodongVO selectVO(@Param("ew") Wrapper<YulehuodongEntity> wrapper);
   	
   	List<YulehuodongView> selectListView(Wrapper<YulehuodongEntity> wrapper);
   	
   	YulehuodongView selectView(@Param("ew") Wrapper<YulehuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YulehuodongEntity> wrapper);

   	

}

