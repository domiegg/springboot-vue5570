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


import com.dao.DiscussyangshengshipinDao;
import com.entity.DiscussyangshengshipinEntity;
import com.service.DiscussyangshengshipinService;
import com.entity.vo.DiscussyangshengshipinVO;
import com.entity.view.DiscussyangshengshipinView;

@Service("discussyangshengshipinService")
public class DiscussyangshengshipinServiceImpl extends ServiceImpl<DiscussyangshengshipinDao, DiscussyangshengshipinEntity> implements DiscussyangshengshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyangshengshipinEntity> page = this.selectPage(
                new Query<DiscussyangshengshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussyangshengshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyangshengshipinEntity> wrapper) {
		  Page<DiscussyangshengshipinView> page =new Query<DiscussyangshengshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyangshengshipinVO> selectListVO(Wrapper<DiscussyangshengshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyangshengshipinVO selectVO(Wrapper<DiscussyangshengshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyangshengshipinView> selectListView(Wrapper<DiscussyangshengshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyangshengshipinView selectView(Wrapper<DiscussyangshengshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
