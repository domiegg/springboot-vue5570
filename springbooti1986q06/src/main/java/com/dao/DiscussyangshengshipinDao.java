package com.dao;

import com.entity.DiscussyangshengshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyangshengshipinVO;
import com.entity.view.DiscussyangshengshipinView;


/**
 * 养生视频评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface DiscussyangshengshipinDao extends BaseMapper<DiscussyangshengshipinEntity> {
	
	List<DiscussyangshengshipinVO> selectListVO(@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);
	
	DiscussyangshengshipinVO selectVO(@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);
	
	List<DiscussyangshengshipinView> selectListView(@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);

	List<DiscussyangshengshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);

	
	DiscussyangshengshipinView selectView(@Param("ew") Wrapper<DiscussyangshengshipinEntity> wrapper);
	

}
