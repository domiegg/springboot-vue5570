package com.dao;

import com.entity.DiscussyishuzihuajianshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyishuzihuajianshangVO;
import com.entity.view.DiscussyishuzihuajianshangView;


/**
 * 艺术字画鉴赏评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface DiscussyishuzihuajianshangDao extends BaseMapper<DiscussyishuzihuajianshangEntity> {
	
	List<DiscussyishuzihuajianshangVO> selectListVO(@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
	
	DiscussyishuzihuajianshangVO selectVO(@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
	
	List<DiscussyishuzihuajianshangView> selectListView(@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);

	List<DiscussyishuzihuajianshangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);

	
	DiscussyishuzihuajianshangView selectView(@Param("ew") Wrapper<DiscussyishuzihuajianshangEntity> wrapper);
	

}
