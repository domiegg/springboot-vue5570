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

import com.entity.DuihuanjifenEntity;
import com.entity.view.DuihuanjifenView;

import com.service.DuihuanjifenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 兑换积分
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 20:44:58
 */
@RestController
@RequestMapping("/duihuanjifen")
public class DuihuanjifenController {
    @Autowired
    private DuihuanjifenService duihuanjifenService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DuihuanjifenEntity duihuanjifen,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			duihuanjifen.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DuihuanjifenEntity> ew = new EntityWrapper<DuihuanjifenEntity>();

		PageUtils page = duihuanjifenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, duihuanjifen), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DuihuanjifenEntity duihuanjifen, 
		HttpServletRequest request){
        EntityWrapper<DuihuanjifenEntity> ew = new EntityWrapper<DuihuanjifenEntity>();

		PageUtils page = duihuanjifenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, duihuanjifen), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DuihuanjifenEntity duihuanjifen){
       	EntityWrapper<DuihuanjifenEntity> ew = new EntityWrapper<DuihuanjifenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( duihuanjifen, "duihuanjifen")); 
        return R.ok().put("data", duihuanjifenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DuihuanjifenEntity duihuanjifen){
        EntityWrapper< DuihuanjifenEntity> ew = new EntityWrapper< DuihuanjifenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( duihuanjifen, "duihuanjifen")); 
		DuihuanjifenView duihuanjifenView =  duihuanjifenService.selectView(ew);
		return R.ok("查询兑换积分成功").put("data", duihuanjifenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DuihuanjifenEntity duihuanjifen = duihuanjifenService.selectById(id);
        return R.ok().put("data", duihuanjifen);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DuihuanjifenEntity duihuanjifen = duihuanjifenService.selectById(id);
        return R.ok().put("data", duihuanjifen);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DuihuanjifenEntity duihuanjifen, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(duihuanjifen);
        duihuanjifenService.insert(duihuanjifen);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DuihuanjifenEntity duihuanjifen, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(duihuanjifen);
        duihuanjifenService.insert(duihuanjifen);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DuihuanjifenEntity duihuanjifen, HttpServletRequest request){
        //ValidatorUtils.validateEntity(duihuanjifen);
        duihuanjifenService.updateById(duihuanjifen);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<DuihuanjifenEntity> list = new ArrayList<DuihuanjifenEntity>();
        for(Long id : ids) {
            DuihuanjifenEntity duihuanjifen = duihuanjifenService.selectById(id);
            duihuanjifen.setSfsh(sfsh);
            duihuanjifen.setShhf(shhf);
            list.add(duihuanjifen);
        }
        duihuanjifenService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        duihuanjifenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
