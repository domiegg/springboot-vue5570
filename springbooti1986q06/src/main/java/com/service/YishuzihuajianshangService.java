package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishuzihuajianshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishuzihuajianshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishuzihuajianshangView;


/**
 * 艺术字画鉴赏
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YishuzihuajianshangService extends IService<YishuzihuajianshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishuzihuajianshangVO> selectListVO(Wrapper<YishuzihuajianshangEntity> wrapper);
   	
   	YishuzihuajianshangVO selectVO(@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);
   	
   	List<YishuzihuajianshangView> selectListView(Wrapper<YishuzihuajianshangEntity> wrapper);
   	
   	YishuzihuajianshangView selectView(@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishuzihuajianshangEntity> wrapper);

   	

}

