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

import com.entity.YangshengshipinEntity;
import com.entity.view.YangshengshipinView;

import com.service.YangshengshipinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 养生视频
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@RestController
@RequestMapping("/yangshengshipin")
public class YangshengshipinController {
    @Autowired
    private YangshengshipinService yangshengshipinService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YangshengshipinEntity yangshengshipin,
		HttpServletRequest request){
        EntityWrapper<YangshengshipinEntity> ew = new EntityWrapper<YangshengshipinEntity>();

		PageUtils page = yangshengshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yangshengshipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YangshengshipinEntity yangshengshipin, 
		HttpServletRequest request){
        EntityWrapper<YangshengshipinEntity> ew = new EntityWrapper<YangshengshipinEntity>();

		PageUtils page = yangshengshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yangshengshipin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YangshengshipinEntity yangshengshipin){
       	EntityWrapper<YangshengshipinEntity> ew = new EntityWrapper<YangshengshipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yangshengshipin, "yangshengshipin")); 
        return R.ok().put("data", yangshengshipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YangshengshipinEntity yangshengshipin){
        EntityWrapper< YangshengshipinEntity> ew = new EntityWrapper< YangshengshipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yangshengshipin, "yangshengshipin")); 
		YangshengshipinView yangshengshipinView =  yangshengshipinService.selectView(ew);
		return R.ok("查询养生视频成功").put("data", yangshengshipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YangshengshipinEntity yangshengshipin = yangshengshipinService.selectById(id);
        return R.ok().put("data", yangshengshipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YangshengshipinEntity yangshengshipin = yangshengshipinService.selectById(id);
        return R.ok().put("data", yangshengshipin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YangshengshipinEntity yangshengshipin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yangshengshipin);
        yangshengshipinService.insert(yangshengshipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YangshengshipinEntity yangshengshipin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yangshengshipin);
        yangshengshipinService.insert(yangshengshipin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YangshengshipinEntity yangshengshipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yangshengshipin);
        yangshengshipinService.updateById(yangshengshipin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yangshengshipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
