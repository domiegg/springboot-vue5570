<template>
<div class="center-preview" :style='{"width":"100%","padding":"0 10%","margin":"10px auto","position":"relative","background":"#fff"}'>
	<div class="title" :style='{"margin":"10px 0","color":"#333","textAlign":"center","background":"#fff","fontSize":"22px","lineHeight":"54px","fontWeight":"600"}'>{{ title }}</div>
	
	<div class="info" :style='{"padding":"20px 40px 40px 220px","margin":"20px auto","borderRadius":"0","flexWrap":"wrap","background":"#f9f9f9","display":"flex","width":"100%","position":"relative","height":"auto"}'>
		<div :style='{"padding":"0","borderColor":"#efefef","margin":"0 0 0 -120px","color":"#333","borderWidth":"0","width":"100%","lineHeight":"44px","fontSize":"15px","borderStyle":"solid","height":"44px"}'>个人信息</div>
		<div :style='{"borderColor":"#efefef","top":"60px","left":"80px","borderWidth":"0","width":"100px","fontSize":0,"position":"absolute","borderStyle":"solid","height":"100px"}' v-if="userTableName=='yonghu'">
			<el-image :style='{"margin":"10px auto","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0 0 1px 0","display":"block","width":"100px","borderStyle":"solid","float":"left","height":"100px"}' :src="sessionForm.touxiang?baseUrl + sessionForm.touxiang:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"borderColor":"#efefef","top":"60px","left":"80px","borderWidth":"0","width":"100px","fontSize":0,"position":"absolute","borderStyle":"solid","height":"100px"}' v-if="userTableName=='yisheng'">
			<el-image :style='{"margin":"10px auto","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0 0 1px 0","display":"block","width":"100px","borderStyle":"solid","float":"left","height":"100px"}' :src="sessionForm.zhaopian?baseUrl + sessionForm.zhaopian:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>用户账号</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":"1"}'>{{sessionForm.yonghuzhanghao}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>姓名</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.xingming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>性别</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.xingbie}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>年龄</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.nianling}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>手机</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.shouji}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>身份证</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.shenfenzheng}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yisheng'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>医生工号</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":"1"}'>{{sessionForm.yishenggonghao}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yisheng'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>医生姓名</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.yishengxingming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yisheng'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>性别</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.xingbie}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yisheng'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>科室</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.keshi}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yisheng'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>职称</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.zhicheng}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","borderWidth":"0 0 1px 0","background":"#FFFFFF","display":"flex","width":"40%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yisheng'">
			<span class="icon iconfont " :style='{"color":"#333","padding":"0 5px","fontSize":"14px"}'></span>
			<div :style='{"color":"#333","margin":"0 10px 0 0","fontSize":"14px"}'>个人擅长</div>
			<div :style='{"fontSize":"14px","color":"#333","textAlign":"left","flex":1}'>{{sessionForm.gerenshanzhang}}</div>
		</div>
		
	</div>
	
    <el-tabs tab-position="left" :style='{"width":"100%","background":"#f5f5f5","flexDirection":"column","display":"flex"}' @tab-click="handleClick">
      <el-tab-pane label="个人中心">
        <el-form class="center-preview-pv" ref="sessionForm" :model="sessionForm" :rules="rules" label-width="110px">
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="sessionForm.yonghuzhanghao" placeholder="用户账号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="姓名" prop="xingming">
            <el-input v-model="sessionForm.xingming" placeholder="姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="性别" prop="xingbie">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="年龄" prop="nianling">
            <el-input v-model="sessionForm.nianling" placeholder="年龄" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="手机" prop="shouji">
            <el-input v-model="sessionForm.shouji" placeholder="手机" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="身份证" prop="shenfenzheng">
            <el-input v-model="sessionForm.shenfenzheng" placeholder="身份证" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="头像" prop="touxiang">
			<file-upload
			tip="点击上传头像"
			action="file/upload"
			:limit="1"
			:multiple="true"
			:fileUrls="sessionForm.touxiang?sessionForm.touxiang:''"
			@change="yonghutouxiangHandleAvatarSuccess"
			></file-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yonghu'" label="积分">
            <el-input v-model="sessionForm.jifen" placeholder="积分" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="医生工号" prop="yishenggonghao">
            <el-input v-model="sessionForm.yishenggonghao" placeholder="医生工号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="医生姓名" prop="yishengxingming">
            <el-input v-model="sessionForm.yishengxingming" placeholder="医生姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="性别" prop="xingbie">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="照片" prop="zhaopian">
			<file-upload
			tip="点击上传照片"
			action="file/upload"
			:limit="1"
			:multiple="true"
			:fileUrls="sessionForm.zhaopian?sessionForm.zhaopian:''"
			@change="yishengzhaopianHandleAvatarSuccess"
			></file-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="科室" prop="keshi">
            <el-select v-model="sessionForm.keshi" placeholder="请选择科室" >
              <el-option v-for="(item, index) in dynamicProp.keshi" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="职称" prop="zhicheng">
            <el-input v-model="sessionForm.zhicheng" placeholder="职称" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="个人擅长" prop="gerenshanzhang">
            <el-input v-model="sessionForm.gerenshanzhang" placeholder="个人擅长" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="联系方式" prop="lianxifangshi">
            <el-input v-model="sessionForm.lianxifangshi" placeholder="联系方式" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' v-if="userTableName=='yisheng'" label="邮箱" prop="youxiang">
            <el-input v-model="sessionForm.youxiang" placeholder="邮箱" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"0","margin":"0"}'>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#654B3C","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="onSubmit('sessionForm')">更新信息</el-button>
            <el-button :style='{"border":"1px solid #654B3C","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#654B3C","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="danger" @click="logout">退出登录</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
	  <el-tab-pane label="修改密码">
		<el-form class="center-preview-pv" ref="passwordForm" :model="passwordForm" :rules="passwordRules" label-width="110px">
			<el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="原密码" prop="password">
			  <el-input type="password" v-model="passwordForm.password" placeholder="原密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="新密码" prop="newpassword">
			  <el-input type="password" v-model="passwordForm.newpassword" placeholder="新密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="确认密码" prop="repassword">
			  <el-input type="password" v-model="passwordForm.repassword" placeholder="确认密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"0","margin":"0"}'>
			  <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#654B3C","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="updatePassword">修改密码</el-button>
			</el-form-item>
		</el-form>
	  </el-tab-pane>
		<el-tab-pane v-for="(item,index) in menuList" :key="index" v-if="hasBack(item.menu)" :label="item.child[0].menu" :name="item.child[0].tableName"></el-tab-pane>
      <el-tab-pane label="我的发布"></el-tab-pane>
      <el-tab-pane label="我的收藏"></el-tab-pane>
    </el-tabs>

</div>
</template>

<script>
  import config from '@/config/config'
  import menu from '@/config/menu'
  import Vue from 'vue'
  export default {
    //数据集合
    data() {
      return {
        title: '个人中心',
        baseUrl: config.baseUrl,
        sessionForm: {},
		passwordForm: {},
		passwordRules: {
			password: [
				{
					required: true,
					message: "密码不能为空",
					trigger: "blur"
				}
			],
			newpassword: [
				{
					required: true,
					message: "新密码不能为空",
					trigger: "blur"
				}
			],
			repassword: [
				{
					required: true,
					message: "确认密码不能为空",
					trigger: "blur"
				}
			]
		},
        rules: {},
		menuList: [],
        disabled: false,
        uploadUrl: config.baseUrl + 'file/upload',
        imageUrl: '',
        headers: {Token: localStorage.getItem('frontToken')},
        userTableName: localStorage.getItem('UserTableName'),
        dynamicProp: {},
      }
    },
    created() {
		let menus = menu.list()
		for(let x in menus){
			if(menus[x].tableName == this.userTableName){
				this.menuList = menus[x].backMenu
			}
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'yonghuzhanghao', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'xingming', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'mima', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'xingbie', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'nianling', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'shouji', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'shenfenzheng', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'touxiang', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'jifen', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'yishenggonghao', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'yishengxingming', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'mima', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'xingbie', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'zhaopian', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'keshi', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'zhicheng', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'gerenshanzhang', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'lianxifangshi', null);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.sessionForm, 'youxiang', null);
		}

		if ('yonghu' == this.userTableName&&this.rules['yonghuzhanghao']){
			this.rules['yonghuzhanghao'].push({ required: true, message: '请输入用户账号', trigger: 'blur' })
		}else if('yonghu' == this.userTableName&&!this.rules['yonghuzhanghao']) {
			this.$set(this.rules, 'yonghuzhanghao', [{ required: true, message: '请输入用户账号', trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName&&this.rules['xingming']){
			this.rules['xingming'].push({ required: true, message: '请输入姓名', trigger: 'blur' })
		}else if('yonghu' == this.userTableName&&!this.rules['xingming']) {
			this.$set(this.rules, 'xingming', [{ required: true, message: '请输入姓名', trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName&&this.rules['mima']){
			this.rules['mima'].push({ required: true, message: '请输入密码', trigger: 'blur' })
		}else if('yonghu' == this.userTableName&&!this.rules['mima']) {
			this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.rules, 'shouji', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.rules, 'shenfenzheng', [{ required: false, validator: this.$validate.isIdCard, trigger: 'blur' }]);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.rules, 'jifen', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
		}
		if ('yisheng' == this.userTableName&&this.rules['yishenggonghao']){
			this.rules['yishenggonghao'].push({ required: true, message: '请输入医生工号', trigger: 'blur' })
		}else if('yisheng' == this.userTableName&&!this.rules['yishenggonghao']) {
			this.$set(this.rules, 'yishenggonghao', [{ required: true, message: '请输入医生工号', trigger: 'blur' }]);
		}
		if ('yisheng' == this.userTableName&&this.rules['yishengxingming']){
			this.rules['yishengxingming'].push({ required: true, message: '请输入医生姓名', trigger: 'blur' })
		}else if('yisheng' == this.userTableName&&!this.rules['yishengxingming']) {
			this.$set(this.rules, 'yishengxingming', [{ required: true, message: '请输入医生姓名', trigger: 'blur' }]);
		}
		if ('yisheng' == this.userTableName&&this.rules['mima']){
			this.rules['mima'].push({ required: true, message: '请输入密码', trigger: 'blur' })
		}else if('yisheng' == this.userTableName&&!this.rules['mima']) {
			this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.rules, 'lianxifangshi', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
		}
		if ('yisheng' == this.userTableName) {
			this.$set(this.rules, 'youxiang', [{ required: false, validator: this.$validate.isEmail, trigger: 'blur' }]);
		}

      this.init();
      this.sessionForm = JSON.parse(localStorage.getItem('sessionForm'))
    },
    //方法集合
    methods: {
      init() {
        if ('yonghu' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
        if ('yisheng' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
        if ('yisheng' == this.userTableName) {
          this.$http.get('option/keshi/keshi', {emulateJSON: true}).then(res => {
            if (res.data.code == 0) {
              this.dynamicProp.keshi = res.data.data;
			  this.$forceUpdate()
            }
          });
        }
      },
	  setSession(){
		  localStorage.setItem('sessionForm',JSON.stringify(this.sessionForm))
	  },
      onSubmit(formName) {
		if(`yonghu` == this.userTableName && this.sessionForm.touxiang!=null){
			this.sessionForm.touxiang = this.sessionForm.touxiang.replace(new RegExp(this.$config.baseUrl,"g"),"");
		}
		if(`yisheng` == this.userTableName && this.sessionForm.zhaopian!=null){
			this.sessionForm.zhaopian = this.sessionForm.zhaopian.replace(new RegExp(this.$config.baseUrl,"g"),"");
		}
        this.$refs[formName].validate((valid) => {
			if (valid) {
				this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
					if (res.data.code == 0) {
						this.setSession()
						this.$message({
							message: '更新成功',
							type: 'success',
							duration: 1500
						});
					}
				});
			} else {
				return false;
			}
        });
      },
      yonghutouxiangHandleAvatarSuccess(fileUrls) {
        this.sessionForm.touxiang = fileUrls;
      },
      yishengzhaopianHandleAvatarSuccess(fileUrls) {
        this.sessionForm.zhaopian = fileUrls;
      },
      handleClick(tab, event) {
        switch(event.target.outerText) {
          case '个人中心':
            tab.$router.push('/index/center');
            break;
          case '修改密码':
            this.passwordForm = {
				password: '',
				newpassword: '',
				repassword: '',
			}
			this.$forceUpdate()
            break;
          case '我的发布':
            tab.$router.push('/index/myForumList');
            break;
          case '我的收藏':
            localStorage.setItem('storeupType', 1);
            tab.$router.push('/index/storeup');
            break;
		  default:
		  	tab.$router.push(`/index/${tab.name}?centerType=1`);
        }

        this.title = event.target.outerText;
      },
	  async updatePassword(){
			this.$refs["passwordForm"].validate(async valid => {
				if (valid) {
					var password = "";
					if (this.sessionForm.mima) {
						password = this.sessionForm.mima;
					} else if (this.sessionForm.password) {
						password = this.sessionForm.password;
					}
					if (this.passwordForm.password != password) {
						this.$message.error("原密码错误");
						return;
					}
					if (this.passwordForm.newpassword != this.passwordForm.repassword) {
						this.$message.error("两次密码输入不一致");
						return;
					}
					if (this.userTableName == 'yonghu') {
					}
					if (this.userTableName == 'yisheng') {
					}
					this.sessionForm.password = this.passwordForm.newpassword;
					this.sessionForm.mima = this.passwordForm.newpassword;
					this.$http.post(`${this.userTableName}/update`,this.sessionForm).then(({data})=>{
						if (data && data.code === 0) {
							this.$message({
								message: "修改密码成功,下次登录系统生效",
								type: "success",
								duration: 1500,
								onClose: () => {
								}
							});
							this.setSession()
						} else {
							this.$message.error(data.msg);
						}
					});
				}
			})
	  },
      logout() {
        localStorage.clear();
        Vue.http.headers.common['Token'] = "";
        this.$router.push('/index/home');
        this.activeIndex = '0'
        localStorage.setItem('keyPath', this.activeIndex)
        this.$forceUpdate()
        this.$message({
            message: '登出成功',
            type: 'success',
            duration: 1500,
        });
      },
	  hasBack(name){
		  switch(name){
			case '我的收藏管理':
				return false
				break;
			default:
				return true
		  }
	  }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .center-preview {
  
    .el-tabs {
      & /deep/ .el-tabs__header {
		.el-tabs__nav{
			overflow: auto;
		}
		::-webkit-scrollbar {
		  -webkit-appearance: none;
		  width: 6px;
		  height: 6px;
		}
		::-webkit-scrollbar-track {
		  background: rgba(0, 0, 0, 0.1);
		  border-radius: 0;
		}
		::-webkit-scrollbar-thumb {
		  cursor: pointer;
		  border-radius: 5px;
		  background: rgba(0, 0, 0, 0.15);
		  transition: color 0.2s ease;
		}
		::-webkit-scrollbar-thumb:hover {
		  background: rgba(0, 0, 0, 0.3);
		}
        .el-tabs__nav-wrap {
          margin: 0;
  
          &::after {
            content: none;
          }
        }
  
        .el-tabs__active-bar {
          display: none !important;
        }
      }
  
      .center-preview-pv {
        .el-date-editor.el-input {
          width: auto;
        }
  
        .balance {
          .el-input {
            width: auto;
          }
        }
      }
    }
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header {
	padding: 10px 10px 0;
	background: #654B3C;
	display: block;
	width: 100%;
	border-color: #eee;
	border-width: 0;
	position: relative;
	border-style: solid;
	height: auto;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item {
  	padding: 0 10px;
  	margin: 0 8px 10px;
  	color: #333;
  	font-weight: 500;
  	display: block;
  	font-size: 14px;
  	line-height: 40px;
  	float: left;
  	border-radius: 20px;
  	background: #f5f5f5;
  	position: relative;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
  	padding: 0 10px;
  	color: #000;
  	background: #fff;
  	font-weight: 500;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
  	border-radius: 20px;
  	padding: 0 10px;
  	margin: 0 8px 10px;
  	color: #000;
  	background: #fff;
  	font-weight: 500;
  	display: block;
  	font-size: 14px;
  	line-height: 40px;
  	float: left;
  	text-align: center;
  	height: 40px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__content {
  	padding: 20px 10px;
  	background: #f9f9f9;
  }
  .center-preview .el-tabs /deep/ .el-tabs__content .el-tab-pane {
  	width: 100%;
  }
  
  .center-preview-pv .el-form-item /deep/ .el-form-item__label {
  	padding: 0 10px 0 0;
  	color: #666;
  	font-weight: 500;
  	width: 110px;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: right;
  }
  
  .center-preview-pv .el-form-item .el-form-item__content {
    margin-left: 110px;
  }
  
  .center-preview-pv .el-input /deep/ .el-input__inner {
  	border: 1px solid #000000;
  	border-radius: 4px;
  	padding: 0 12px;
  	outline: none;
  	color: #000000;
  	width: 400px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-select /deep/ .el-input__inner {
  	border: 1px solid #000000;
  	border-radius: 4px;
  	padding: 0 12px;
  	outline: none;
  	color: #000000;
  	width: 400px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-date-editor /deep/ .el-input__inner {
  	border: 1px solid #000000;
  	border-radius: 4px;
  	padding: 0 10px 0 30px;
  	outline: none;
  	color: #000000;
  	width: auto;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv /deep/ .avatar-uploader-icon {
  	border: 1px dashed #654B3C;
  	cursor: pointer;
  	border-radius: 6px;
  	color: #000000;
  	width: 100px;
  	font-size: 32px;
  	line-height: 100px;
  	text-align: center;
  	height: 100px;
  }
  
  .center-preview-pv .el-form-item.balance /deep/ .el-input__inner {
  	border: 1px solid #000000;
  	border-radius: 4px;
  	padding: 0 12px;
  	outline: none;
  	color: #000000;
  	display: inline-block;
  	width: 200px;
  	font-size: 14px;
  	height: 40px;
  }
</style>
