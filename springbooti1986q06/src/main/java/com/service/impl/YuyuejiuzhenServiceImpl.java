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


import com.dao.YuyuejiuzhenDao;
import com.entity.YuyuejiuzhenEntity;
import com.service.YuyuejiuzhenService;
import com.entity.vo.YuyuejiuzhenVO;
import com.entity.view.YuyuejiuzhenView;

@Service("yuyuejiuzhenService")
public class YuyuejiuzhenServiceImpl extends ServiceImpl<YuyuejiuzhenDao, YuyuejiuzhenEntity> implements YuyuejiuzhenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuejiuzhenEntity> page = this.selectPage(
                new Query<YuyuejiuzhenEntity>(params).getPage(),
                new EntityWrapper<YuyuejiuzhenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuejiuzhenEntity> wrapper) {
		  Page<YuyuejiuzhenView> page =new Query<YuyuejiuzhenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuyuejiuzhenVO> selectListVO(Wrapper<YuyuejiuzhenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuejiuzhenVO selectVO(Wrapper<YuyuejiuzhenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuejiuzhenView> selectListView(Wrapper<YuyuejiuzhenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuejiuzhenView selectView(Wrapper<YuyuejiuzhenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
