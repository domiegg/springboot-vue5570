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


import com.dao.TijianjiankangxinxiDao;
import com.entity.TijianjiankangxinxiEntity;
import com.service.TijianjiankangxinxiService;
import com.entity.vo.TijianjiankangxinxiVO;
import com.entity.view.TijianjiankangxinxiView;

@Service("tijianjiankangxinxiService")
public class TijianjiankangxinxiServiceImpl extends ServiceImpl<TijianjiankangxinxiDao, TijianjiankangxinxiEntity> implements TijianjiankangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijianjiankangxinxiEntity> page = this.selectPage(
                new Query<TijianjiankangxinxiEntity>(params).getPage(),
                new EntityWrapper<TijianjiankangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijianjiankangxinxiEntity> wrapper) {
		  Page<TijianjiankangxinxiView> page =new Query<TijianjiankangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TijianjiankangxinxiVO> selectListVO(Wrapper<TijianjiankangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijianjiankangxinxiVO selectVO(Wrapper<TijianjiankangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijianjiankangxinxiView> selectListView(Wrapper<TijianjiankangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijianjiankangxinxiView selectView(Wrapper<TijianjiankangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
