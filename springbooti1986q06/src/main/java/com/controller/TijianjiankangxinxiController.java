package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TijianjiankangxinxiEntity;
import com.entity.view.TijianjiankangxinxiView;

import com.service.TijianjiankangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 体检健康信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
@RestController
@RequestMapping("/tijianjiankangxinxi")
public class TijianjiankangxinxiController {
    @Autowired
    private TijianjiankangxinxiService tijianjiankangxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TijianjiankangxinxiEntity tijianjiankangxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			tijianjiankangxinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TijianjiankangxinxiEntity> ew = new EntityWrapper<TijianjiankangxinxiEntity>();

		PageUtils page = tijianjiankangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijianjiankangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TijianjiankangxinxiEntity tijianjiankangxinxi, 
		HttpServletRequest request){
        EntityWrapper<TijianjiankangxinxiEntity> ew = new EntityWrapper<TijianjiankangxinxiEntity>();

		PageUtils page = tijianjiankangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijianjiankangxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TijianjiankangxinxiEntity tijianjiankangxinxi){
       	EntityWrapper<TijianjiankangxinxiEntity> ew = new EntityWrapper<TijianjiankangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tijianjiankangxinxi, "tijianjiankangxinxi")); 
        return R.ok().put("data", tijianjiankangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TijianjiankangxinxiEntity tijianjiankangxinxi){
        EntityWrapper< TijianjiankangxinxiEntity> ew = new EntityWrapper< TijianjiankangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tijianjiankangxinxi, "tijianjiankangxinxi")); 
		TijianjiankangxinxiView tijianjiankangxinxiView =  tijianjiankangxinxiService.selectView(ew);
		return R.ok("查询体检健康信息成功").put("data", tijianjiankangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TijianjiankangxinxiEntity tijianjiankangxinxi = tijianjiankangxinxiService.selectById(id);
        return R.ok().put("data", tijianjiankangxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TijianjiankangxinxiEntity tijianjiankangxinxi = tijianjiankangxinxiService.selectById(id);
        return R.ok().put("data", tijianjiankangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TijianjiankangxinxiEntity tijianjiankangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tijianjiankangxinxi);
        tijianjiankangxinxiService.insert(tijianjiankangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TijianjiankangxinxiEntity tijianjiankangxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tijianjiankangxinxi);
        tijianjiankangxinxiService.insert(tijianjiankangxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TijianjiankangxinxiEntity tijianjiankangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tijianjiankangxinxi);
        tijianjiankangxinxiService.updateById(tijianjiankangxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tijianjiankangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
