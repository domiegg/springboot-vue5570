package com.dao;

import com.entity.YangshengshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YangshengshipinVO;
import com.entity.view.YangshengshipinView;


/**
 * 养生视频
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YangshengshipinDao extends BaseMapper<YangshengshipinEntity> {
	
	List<YangshengshipinVO> selectListVO(@Param("ew") Wrapper<YangshengshipinEntity> wrapper);
	
	YangshengshipinVO selectVO(@Param("ew") Wrapper<YangshengshipinEntity> wrapper);
	
	List<YangshengshipinView> selectListView(@Param("ew") Wrapper<YangshengshipinEntity> wrapper);

	List<YangshengshipinView> selectListView(Pagination page,@Param("ew") Wrapper<YangshengshipinEntity> wrapper);

	
	YangshengshipinView selectView(@Param("ew") Wrapper<YangshengshipinEntity> wrapper);
	

}
