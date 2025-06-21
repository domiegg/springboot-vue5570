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


import com.dao.YangshengshipinDao;
import com.entity.YangshengshipinEntity;
import com.service.YangshengshipinService;
import com.entity.vo.YangshengshipinVO;
import com.entity.view.YangshengshipinView;

@Service("yangshengshipinService")
public class YangshengshipinServiceImpl extends ServiceImpl<YangshengshipinDao, YangshengshipinEntity> implements YangshengshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YangshengshipinEntity> page = this.selectPage(
                new Query<YangshengshipinEntity>(params).getPage(),
                new EntityWrapper<YangshengshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YangshengshipinEntity> wrapper) {
		  Page<YangshengshipinView> page =new Query<YangshengshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YangshengshipinVO> selectListVO(Wrapper<YangshengshipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YangshengshipinVO selectVO(Wrapper<YangshengshipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YangshengshipinView> selectListView(Wrapper<YangshengshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YangshengshipinView selectView(Wrapper<YangshengshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
