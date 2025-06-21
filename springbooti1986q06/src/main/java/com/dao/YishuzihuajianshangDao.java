package com.dao;

import com.entity.YishuzihuajianshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishuzihuajianshangVO;
import com.entity.view.YishuzihuajianshangView;


/**
 * 艺术字画鉴赏
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YishuzihuajianshangDao extends BaseMapper<YishuzihuajianshangEntity> {
	
	List<YishuzihuajianshangVO> selectListVO(@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);
	
	YishuzihuajianshangVO selectVO(@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);
	
	List<YishuzihuajianshangView> selectListView(@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);

	List<YishuzihuajianshangView> selectListView(Pagination page,@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);

	
	YishuzihuajianshangView selectView(@Param("ew") Wrapper<YishuzihuajianshangEntity> wrapper);
	

}
