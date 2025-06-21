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


import com.dao.YishuzihuajianshangDao;
import com.entity.YishuzihuajianshangEntity;
import com.service.YishuzihuajianshangService;
import com.entity.vo.YishuzihuajianshangVO;
import com.entity.view.YishuzihuajianshangView;

@Service("yishuzihuajianshangService")
public class YishuzihuajianshangServiceImpl extends ServiceImpl<YishuzihuajianshangDao, YishuzihuajianshangEntity> implements YishuzihuajianshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishuzihuajianshangEntity> page = this.selectPage(
                new Query<YishuzihuajianshangEntity>(params).getPage(),
                new EntityWrapper<YishuzihuajianshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishuzihuajianshangEntity> wrapper) {
		  Page<YishuzihuajianshangView> page =new Query<YishuzihuajianshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YishuzihuajianshangVO> selectListVO(Wrapper<YishuzihuajianshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishuzihuajianshangVO selectVO(Wrapper<YishuzihuajianshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishuzihuajianshangView> selectListView(Wrapper<YishuzihuajianshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishuzihuajianshangView selectView(Wrapper<YishuzihuajianshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
