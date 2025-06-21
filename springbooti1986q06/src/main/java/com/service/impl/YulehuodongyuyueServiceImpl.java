package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YulehuodongyuyueDao;
import com.entity.YulehuodongyuyueEntity;
import com.service.YulehuodongyuyueService;
import com.entity.vo.YulehuodongyuyueVO;
import com.entity.view.YulehuodongyuyueView;

@Service("yulehuodongyuyueService")
public class YulehuodongyuyueServiceImpl extends ServiceImpl<YulehuodongyuyueDao, YulehuodongyuyueEntity> implements YulehuodongyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YulehuodongyuyueEntity> page = this.selectPage(
                new Query<YulehuodongyuyueEntity>(params).getPage(),
                new EntityWrapper<YulehuodongyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YulehuodongyuyueEntity> wrapper) {
		  Page<YulehuodongyuyueView> page =new Query<YulehuodongyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YulehuodongyuyueVO> selectListVO(Wrapper<YulehuodongyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YulehuodongyuyueVO selectVO(Wrapper<YulehuodongyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YulehuodongyuyueView> selectListView(Wrapper<YulehuodongyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YulehuodongyuyueView selectView(Wrapper<YulehuodongyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
