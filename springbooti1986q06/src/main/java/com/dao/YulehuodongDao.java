package com.dao;

import com.entity.YulehuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YulehuodongVO;
import com.entity.view.YulehuodongView;


/**
 * 娱乐活动
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YulehuodongDao extends BaseMapper<YulehuodongEntity> {
	
	List<YulehuodongVO> selectListVO(@Param("ew") Wrapper<YulehuodongEntity> wrapper);
	
	YulehuodongVO selectVO(@Param("ew") Wrapper<YulehuodongEntity> wrapper);
	
	List<YulehuodongView> selectListView(@Param("ew") Wrapper<YulehuodongEntity> wrapper);

	List<YulehuodongView> selectListView(Pagination page,@Param("ew") Wrapper<YulehuodongEntity> wrapper);

	
	YulehuodongView selectView(@Param("ew") Wrapper<YulehuodongEntity> wrapper);
	

}
