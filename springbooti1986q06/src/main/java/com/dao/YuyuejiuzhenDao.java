package com.dao;

import com.entity.YuyuejiuzhenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuejiuzhenVO;
import com.entity.view.YuyuejiuzhenView;


/**
 * 预约就诊
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
public interface YuyuejiuzhenDao extends BaseMapper<YuyuejiuzhenEntity> {
	
	List<YuyuejiuzhenVO> selectListVO(@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);
	
	YuyuejiuzhenVO selectVO(@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);
	
	List<YuyuejiuzhenView> selectListView(@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);

	List<YuyuejiuzhenView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);

	
	YuyuejiuzhenView selectView(@Param("ew") Wrapper<YuyuejiuzhenEntity> wrapper);
	

}
