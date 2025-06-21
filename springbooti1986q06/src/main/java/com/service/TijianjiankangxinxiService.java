package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijianjiankangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijianjiankangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianjiankangxinxiView;


/**
 * 体检健康信息
 *
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
public interface TijianjiankangxinxiService extends IService<TijianjiankangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijianjiankangxinxiVO> selectListVO(Wrapper<TijianjiankangxinxiEntity> wrapper);
   	
   	TijianjiankangxinxiVO selectVO(@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);
   	
   	List<TijianjiankangxinxiView> selectListView(Wrapper<TijianjiankangxinxiEntity> wrapper);
   	
   	TijianjiankangxinxiView selectView(@Param("ew") Wrapper<TijianjiankangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijianjiankangxinxiEntity> wrapper);

   	

}

