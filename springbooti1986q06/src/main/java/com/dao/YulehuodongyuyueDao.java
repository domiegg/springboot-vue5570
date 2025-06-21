package com.dao;

import com.entity.YulehuodongyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YulehuodongyuyueVO;
import com.entity.view.YulehuodongyuyueView;


/**
 * 娱乐活动预约
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface YulehuodongyuyueDao extends BaseMapper<YulehuodongyuyueEntity> {
	
	List<YulehuodongyuyueVO> selectListVO(@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);
	
	YulehuodongyuyueVO selectVO(@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);
	
	List<YulehuodongyuyueView> selectListView(@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);

	List<YulehuodongyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);

	
	YulehuodongyuyueView selectView(@Param("ew") Wrapper<YulehuodongyuyueEntity> wrapper);
	

}
