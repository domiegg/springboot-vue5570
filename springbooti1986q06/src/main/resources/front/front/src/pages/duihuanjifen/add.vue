<template>
<div :style='{"width":"100%","padding":"20px 10%","margin":"10px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"width":"100%","padding":"20px 0","position":"relative","background":"#f9f9f9"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="150px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="商品名称" prop="shangpinmingcheng">
            <el-input v-model="ruleForm.shangpinmingcheng" 
                placeholder="商品名称" clearable :disabled=" false  ||ro.shangpinmingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="商品图片" v-if="type!='cross' || (type=='cross' && !ro.shangpintupian)" prop="shangpintupian">
            <file-upload
            tip="点击上传商品图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.shangpintupian?ruleForm.shangpintupian:''"
            @change="shangpintupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' class="upload" v-else label="商品图片" prop="shangpintupian">
                <img v-if="ruleForm.shangpintupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.shangpintupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.shangpintupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="兑换数量" prop="shangpinshuliang">
            <el-input v-model.number="ruleForm.shangpinshuliang" 
                placeholder="兑换数量" clearable :disabled=" false  ||ro.shangpinshuliang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="兑换积分" prop="duihuanjifen">
            <el-input v-model.number="ruleForm.duihuanjifen" 
                placeholder="兑换积分" clearable :disabled=" false  ||ro.duihuanjifen"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="积分" prop="jifen">
              <el-input v-model="jifen" placeholder="积分" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable :disabled="true  ||ro.yonghuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable :disabled="true  ||ro.xingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="手机" prop="shouji">
            <el-input v-model="ruleForm.shouji" 
                placeholder="手机" clearable :disabled=" false  ||ro.shouji"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="用户积分" prop="yonghujifen">
            <el-input v-model.number="ruleForm.yonghujifen" 
                placeholder="用户积分" clearable :disabled="true  ||ro.yonghujifen"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="收件地址" prop="shoujiandizhi">
            <el-input v-model="ruleForm.shoujiandizhi" 
                placeholder="收件地址" clearable :disabled=" false  ||ro.shoujiandizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="兑换时间" prop="duihuanshijian">
              <el-date-picker
				  :disabled=" false  ||ro.duihuanshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.duihuanshijian" 
                  type="datetime"
                  placeholder="兑换时间">
              </el-date-picker>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#654B3C","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #654B3C","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#654B3C","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        uObject: null,
        baseUrl: '',
        ro:{
				shangpinmingcheng : false,
				shangpintupian : false,
				shangpinshuliang : false,
				duihuanjifen : false,
				jifen : false,
				yonghuzhanghao : false,
				xingming : false,
				shouji : false,
				yonghujifen : false,
				shoujiandizhi : false,
				duihuanshijian : false,
				sfsh : false,
				shhf : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          shangpinmingcheng: '',
          shangpintupian: '',
          shangpinshuliang: '',
          duihuanjifen: '',
          jifen: '',
          yonghuzhanghao: '',
          xingming: '',
          shouji: '',
          yonghujifen: '',
          shoujiandizhi: '',
          duihuanshijian: '',
        },


        rules: {
          shangpinmingcheng: [
          ],
          shangpintupian: [
          ],
          shangpinshuliang: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          duihuanjifen: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          jifen: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          yonghuzhanghao: [
            { required: true, message: '用户账号不能为空', trigger: 'blur' },
          ],
          xingming: [
            { required: true, message: '姓名不能为空', trigger: 'blur' },
          ],
          shouji: [
          ],
          yonghujifen: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          shoujiandizhi: [
          ],
          duihuanshijian: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
        },
		centerType: false,
      };
    },
    computed: {


        jifen:{
            get: function () {
                return 1*this.ruleForm.shangpinshuliang*this.ruleForm.duihuanjifen
            }
        },

    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.duihuanshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='shangpinmingcheng'){
              this.ruleForm.shangpinmingcheng = obj[o];
              this.ro.shangpinmingcheng = true;
              continue;
            }
            if(o=='shangpintupian'){
              this.ruleForm.shangpintupian = obj[o].split(",")[0];
              this.ro.shangpintupian = true;
              continue;
            }
            if(o=='shangpinshuliang'){
              this.ruleForm.shangpinshuliang = obj[o];
              this.ro.shangpinshuliang = true;
              continue;
            }
            if(o=='duihuanjifen'){
              this.ruleForm.duihuanjifen = obj[o];
              this.ro.duihuanjifen = true;
              continue;
            }
            if(o=='jifen'){
              this.ruleForm.jifen = obj[o];
              this.ro.jifen = true;
              continue;
            }
            if(o=='yonghuzhanghao'){
              this.ruleForm.yonghuzhanghao = obj[o];
              this.ro.yonghuzhanghao = true;
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              this.ro.xingming = true;
              continue;
            }
            if(o=='shouji'){
              this.ruleForm.shouji = obj[o];
              this.ro.shouji = true;
              continue;
            }
            if(o=='yonghujifen'){
              this.ruleForm.yonghujifen = obj[o];
              this.ro.yonghujifen = true;
              continue;
            }
            if(o=='shoujiandizhi'){
              this.ruleForm.shoujiandizhi = obj[o];
              this.ro.shoujiandizhi = true;
              continue;
            }
            if(o=='duihuanshijian'){
              this.ruleForm.duihuanshijian = obj[o];
              this.ro.duihuanshijian = true;
              continue;
            }
          }
          this.ruleForm.shangpinshuliang = 0
		  this.ro.shangpinshuliang = false;
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            this.uObject = res.data.data;
            if((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0){
                this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
            }
            if((json.xingming!=''&&json.xingming) || json.xingming==0){
                this.ruleForm.xingming = json.xingming
            }
            if((json.shouji!=''&&json.shouji) || json.shouji==0){
                this.ruleForm.shouji = json.shouji
            }
            if((json.jifen!=''&&json.jifen) || json.jifen==0){
                this.ruleForm.yonghujifen = json.jifen
            }
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`duihuanjifen/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			this.ruleForm.jifen = this.jifen
			if(!this.ruleForm.shangpinshuliang){
				this.$message.error("兑换数量不能为空");
				return
			}
			var obj = JSON.parse(localStorage.getItem('crossObj'));
			var table = localStorage.getItem('crossTable');
			obj.shangpinshuliang = obj.shangpinshuliang - this.ruleForm.shangpinshuliang
			if(obj.shangpinshuliang<0){
				this.$message.error("兑换数量不足");
				return
			}
      
			//this.$http.post(table+`/update`, obj).then(res => {});
			if(this.ruleForm.jifen>this.ruleForm.yonghujifen){
				this.$message.error("积分不能超过用户积分");
				return
			}
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('duihuanjifen/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算
								var obj = JSON.parse(localStorage.getItem('crossObj'));
								var table = localStorage.getItem('crossTable');

								obj.shangpinshuliang = parseFloat(obj.shangpinshuliang) - parseFloat(this.ruleForm.shangpinshuliang)

								this.$http.post(table+`/update`,obj).then(res => {});
								this.$http.post(`duihuanjifen/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										if(this.uObject.jifen>=0){
											this.uObject.jifen = parseFloat(this.uObject.jifen) - parseFloat(this.ruleForm.jifen)
											this.$http.post(this.userTableName+'/update', this.uObject).then(res => {});
											localStorage.setItem('sessionForm',JSON.stringify(this.uObject))
										}
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {
						var obj = JSON.parse(localStorage.getItem('crossObj'));
						var table = localStorage.getItem('crossTable');

						obj.shangpinshuliang = parseFloat(obj.shangpinshuliang) - parseFloat(this.ruleForm.shangpinshuliang)

						this.$http.post(table+`/update`,obj).then(res => {});
						this.$http.post(`duihuanjifen/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								if(this.uObject.jifen>=0){
									this.uObject.jifen = parseFloat(this.uObject.jifen) - parseFloat(this.ruleForm.jifen)
									this.$http.post(this.userTableName+'/update', this.uObject).then(res => {});
									localStorage.setItem('sessionForm',JSON.stringify(this.uObject))
								}
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      shangpintupianUploadChange(fileUrls) {
          this.ruleForm.shangpintupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 150px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 12px;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  min-height: 120px;
	  height: auto;
	}
</style>
