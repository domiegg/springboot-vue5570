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


import com.dao.YulehuodongDao;
import com.entity.YulehuodongEntity;
import com.service.YulehuodongService;
import com.entity.vo.YulehuodongVO;
import com.entity.view.YulehuodongView;

@Service("yulehuodongService")
public class YulehuodongServiceImpl extends ServiceImpl<YulehuodongDao, YulehuodongEntity> implements YulehuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YulehuodongEntity> page = this.selectPage(
                new Query<YulehuodongEntity>(params).getPage(),
                new EntityWrapper<YulehuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YulehuodongEntity> wrapper) {
		  Page<YulehuodongView> page =new Query<YulehuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YulehuodongVO> selectListVO(Wrapper<YulehuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YulehuodongVO selectVO(Wrapper<YulehuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YulehuodongView> selectListView(Wrapper<YulehuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YulehuodongView selectView(Wrapper<YulehuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
