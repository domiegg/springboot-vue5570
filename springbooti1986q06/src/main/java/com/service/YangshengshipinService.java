package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YangshengshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YangshengshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YangshengshipinView;


/**
 * 养生视频
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YangshengshipinService extends IService<YangshengshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YangshengshipinVO> selectListVO(Wrapper<YangshengshipinEntity> wrapper);
   	
   	YangshengshipinVO selectVO(@Param("ew") Wrapper<YangshengshipinEntity> wrapper);
   	
   	List<YangshengshipinView> selectListView(Wrapper<YangshengshipinEntity> wrapper);
   	
   	YangshengshipinView selectView(@Param("ew") Wrapper<YangshengshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YangshengshipinEntity> wrapper);

   	

}

