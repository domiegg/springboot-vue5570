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

import com.entity.YishuzihuajianshangEntity;
import com.entity.view.YishuzihuajianshangView;

import com.service.YishuzihuajianshangService;
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
 * 艺术字画鉴赏
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@RestController
@RequestMapping("/yishuzihuajianshang")
public class YishuzihuajianshangController {
    @Autowired
    private YishuzihuajianshangService yishuzihuajianshangService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YishuzihuajianshangEntity yishuzihuajianshang,
		HttpServletRequest request){
        EntityWrapper<YishuzihuajianshangEntity> ew = new EntityWrapper<YishuzihuajianshangEntity>();

		PageUtils page = yishuzihuajianshangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yishuzihuajianshang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YishuzihuajianshangEntity yishuzihuajianshang, 
		HttpServletRequest request){
        EntityWrapper<YishuzihuajianshangEntity> ew = new EntityWrapper<YishuzihuajianshangEntity>();

		PageUtils page = yishuzihuajianshangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yishuzihuajianshang), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YishuzihuajianshangEntity yishuzihuajianshang){
       	EntityWrapper<YishuzihuajianshangEntity> ew = new EntityWrapper<YishuzihuajianshangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yishuzihuajianshang, "yishuzihuajianshang")); 
        return R.ok().put("data", yishuzihuajianshangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YishuzihuajianshangEntity yishuzihuajianshang){
        EntityWrapper< YishuzihuajianshangEntity> ew = new EntityWrapper< YishuzihuajianshangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yishuzihuajianshang, "yishuzihuajianshang")); 
		YishuzihuajianshangView yishuzihuajianshangView =  yishuzihuajianshangService.selectView(ew);
		return R.ok("查询艺术字画鉴赏成功").put("data", yishuzihuajianshangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YishuzihuajianshangEntity yishuzihuajianshang = yishuzihuajianshangService.selectById(id);
        return R.ok().put("data", yishuzihuajianshang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YishuzihuajianshangEntity yishuzihuajianshang = yishuzihuajianshangService.selectById(id);
        return R.ok().put("data", yishuzihuajianshang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YishuzihuajianshangEntity yishuzihuajianshang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yishuzihuajianshang);
        yishuzihuajianshangService.insert(yishuzihuajianshang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YishuzihuajianshangEntity yishuzihuajianshang, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(yishuzihuajianshang);
        yishuzihuajianshangService.insert(yishuzihuajianshang);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YishuzihuajianshangEntity yishuzihuajianshang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yishuzihuajianshang);
        yishuzihuajianshangService.updateById(yishuzihuajianshang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yishuzihuajianshangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
