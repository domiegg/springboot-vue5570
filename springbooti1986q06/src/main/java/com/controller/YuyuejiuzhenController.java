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

import com.entity.YuyuejiuzhenEntity;
import com.entity.view.YuyuejiuzhenView;

import com.service.YuyuejiuzhenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 预约就诊
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 20:44:57
 */
@RestController
@RequestMapping("/yuyuejiuzhen")
public class YuyuejiuzhenController {
    @Autowired
    private YuyuejiuzhenService yuyuejiuzhenService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyuejiuzhenEntity yuyuejiuzhen,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			yuyuejiuzhen.setYishenggonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yuyuejiuzhen.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyuejiuzhenEntity> ew = new EntityWrapper<YuyuejiuzhenEntity>();

		PageUtils page = yuyuejiuzhenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuejiuzhen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyuejiuzhenEntity yuyuejiuzhen, 
		HttpServletRequest request){
        EntityWrapper<YuyuejiuzhenEntity> ew = new EntityWrapper<YuyuejiuzhenEntity>();

		PageUtils page = yuyuejiuzhenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyuejiuzhen), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyuejiuzhenEntity yuyuejiuzhen){
       	EntityWrapper<YuyuejiuzhenEntity> ew = new EntityWrapper<YuyuejiuzhenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyuejiuzhen, "yuyuejiuzhen")); 
        return R.ok().put("data", yuyuejiuzhenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyuejiuzhenEntity yuyuejiuzhen){
        EntityWrapper< YuyuejiuzhenEntity> ew = new EntityWrapper< YuyuejiuzhenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyuejiuzhen, "yuyuejiuzhen")); 
		YuyuejiuzhenView yuyuejiuzhenView =  yuyuejiuzhenService.selectView(ew);
		return R.ok("查询预约就诊成功").put("data", yuyuejiuzhenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyuejiuzhenEntity yuyuejiuzhen = yuyuejiuzhenService.selectById(id);
        return R.ok().put("data", yuyuejiuzhen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyuejiuzhenEntity yuyuejiuzhen = yuyuejiuzhenService.selectById(id);
        return R.ok().put("data", yuyuejiuzhen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyuejiuzhenEntity yuyuejiuzhen, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yuyuejiuzhen);
        yuyuejiuzhenService.insert(yuyuejiuzhen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyuejiuzhenEntity yuyuejiuzhen, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yuyuejiuzhen);
        yuyuejiuzhenService.insert(yuyuejiuzhen);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyuejiuzhenEntity yuyuejiuzhen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyuejiuzhen);
        yuyuejiuzhenService.updateById(yuyuejiuzhen);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyuejiuzhenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
