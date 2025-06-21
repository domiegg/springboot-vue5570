package com.dao;

import com.entity.TijianjiankangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianjiankangxinxiVO;
import com.entity.view.TijianjiankangxinxiView;


/**
 * 体检健康信息
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
public interface TijianjiankangxinxiDao extends BaseMapper<TijianjiankangxinxiEntity> {
	
	List<TijianjiankangxinxiVO> selectListVO(@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);
	
	TijianjiankangxinxiVO selectVO(@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);
	
	List<TijianjiankangxinxiView> selectListView(@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);

	List<TijianjiankangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);

	
	TijianjiankangxinxiView selectView(@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);
	

}
