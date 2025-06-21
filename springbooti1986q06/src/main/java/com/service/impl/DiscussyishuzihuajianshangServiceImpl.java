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


import com.dao.DiscussyishuzihuajianshangDao;
import com.entity.DiscussyishuzihuajianshangEntity;
import com.service.DiscussyishuzihuajianshangService;
import com.entity.vo.DiscussyishuzihuajianshangVO;
import com.entity.view.DiscussyishuzihuajianshangView;

@Service("discussyishuzihuajianshangService")
public class DiscussyishuzihuajianshangServiceImpl extends ServiceImpl<DiscussyishuzihuajianshangDao, DiscussyishuzihuajianshangEntity> implements DiscussyishuzihuajianshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyishuzihuajianshangEntity> page = this.selectPage(
                new Query<DiscussyishuzihuajianshangEntity>(params).getPage(),
                new EntityWrapper<DiscussyishuzihuajianshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyishuzihuajianshangEntity> wrapper) {
		  Page<DiscussyishuzihuajianshangView> page =new Query<DiscussyishuzihuajianshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyishuzihuajianshangVO> selectListVO(Wrapper<DiscussyishuzihuajianshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyishuzihuajianshangVO selectVO(Wrapper<DiscussyishuzihuajianshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyishuzihuajianshangView> selectListView(Wrapper<DiscussyishuzihuajianshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyishuzihuajianshangView selectView(Wrapper<DiscussyishuzihuajianshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
