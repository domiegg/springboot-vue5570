package com.dao;

import com.entity.DuihuanjifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuihuanjifenVO;
import com.entity.view.DuihuanjifenView;


/**
 * 兑换积分
 * 
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
public interface DuihuanjifenDao extends BaseMapper<DuihuanjifenEntity> {
	
	List<DuihuanjifenVO> selectListVO(@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);
	
	DuihuanjifenVO selectVO(@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);
	
	List<DuihuanjifenView> selectListView(@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);

	List<DuihuanjifenView> selectListView(Pagination page,@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);

	
	DuihuanjifenView selectView(@Param("ew") Wrapper<DuihuanjifenEntity> wrapper);
	

}
