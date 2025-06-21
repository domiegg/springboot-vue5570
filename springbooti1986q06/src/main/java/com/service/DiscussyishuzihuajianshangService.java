package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyishuzihuajianshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyishuzihuajianshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyishuzihuajianshangView;


/**
 * 艺术字画鉴赏评论表
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface DiscussyishuzihuajianshangService extends IService<DiscussyishuzihuajianshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyishuzihuajianshangVO> selectListVO(Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
   	
   	DiscussyishuzihuajianshangVO selectVO(@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
   	
   	List<DiscussyishuzihuajianshangView> selectListView(Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
   	
   	DiscussyishuzihuajianshangView selectView(@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyishuzihuajianshangEntity> wrapper);

   	

}

