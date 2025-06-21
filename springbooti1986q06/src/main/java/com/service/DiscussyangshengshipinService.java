package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyangshengshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyangshengshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyangshengshipinView;


/**
 * 养生视频评论表
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface DiscussyangshengshipinService extends IService<DiscussyangshengshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyangshengshipinVO> selectListVO(Wrapper<DiscussyangshengshipinEntity> wrapper);
   	
   	DiscussyangshengshipinVO selectVO(@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);
   	
   	List<DiscussyangshengshipinView> selectListView(Wrapper<DiscussyangshengshipinEntity> wrapper);
   	
   	DiscussyangshengshipinView selectView(@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyangshengshipinEntity> wrapper);

   	

}

