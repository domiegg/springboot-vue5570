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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="预约编号" prop="yuyuebianhao">
            <el-input v-model="ruleForm.yuyuebianhao" 
                placeholder="预约编号" clearable :disabled=" false  ||ro.yuyuebianhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="预约内容" prop="yuyueneirong">
            <el-input v-model="ruleForm.yuyueneirong" 
                placeholder="预约内容" clearable :disabled=" false  ||ro.yuyueneirong"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="预约时间" prop="yuyueshijian">
            <el-input v-model="ruleForm.yuyueshijian" 
                placeholder="预约时间" clearable :disabled=" false  ||ro.yuyueshijian"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="医生工号" prop="yishenggonghao">
            <el-input v-model="ruleForm.yishenggonghao" 
                placeholder="医生工号" clearable :disabled=" false  ||ro.yishenggonghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="医生姓名" prop="yishengxingming">
            <el-input v-model="ruleForm.yishengxingming" 
                placeholder="医生姓名" clearable :disabled=" false  ||ro.yishengxingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="科室" prop="keshi">
            <el-input v-model="ruleForm.keshi" 
                placeholder="科室" clearable :disabled=" false  ||ro.keshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="照片" v-if="type!='cross' || (type=='cross' && !ro.zhaopian)" prop="zhaopian">
            <file-upload
            tip="点击上传照片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.zhaopian?ruleForm.zhaopian:''"
            @change="zhaopianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' class="upload" v-else label="照片" prop="zhaopian">
                <img v-if="ruleForm.zhaopian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.zhaopian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.zhaopian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable :disabled=" false  ||ro.yonghuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable :disabled=" false  ||ro.xingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="手机" prop="shouji">
            <el-input v-model="ruleForm.shouji" 
                placeholder="手机" clearable :disabled=" false  ||ro.shouji"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="取消原因" prop="quxiaoyuanyin">
            <el-input v-model="ruleForm.quxiaoyuanyin" 
                placeholder="取消原因" clearable :disabled=" false  ||ro.quxiaoyuanyin"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="取消时间" prop="quxiaoshijian">
              <el-date-picker
				  :disabled=" false  ||ro.quxiaoshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.quxiaoshijian" 
                  type="datetime"
                  placeholder="取消时间">
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
        baseUrl: '',
        ro:{
				yuyuebianhao : false,
				yuyueneirong : false,
				yuyueshijian : false,
				yishenggonghao : false,
				yishengxingming : false,
				keshi : false,
				zhaopian : false,
				yonghuzhanghao : false,
				xingming : false,
				shouji : false,
				quxiaoyuanyin : false,
				quxiaoshijian : false,
				crossuserid : false,
				crossrefid : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          yuyuebianhao: '',
          yuyueneirong: '',
          yuyueshijian: '',
          yishenggonghao: '',
          yishengxingming: '',
          keshi: '',
          zhaopian: '',
          yonghuzhanghao: '',
          xingming: '',
          shouji: '',
          quxiaoyuanyin: '',
          quxiaoshijian: '',
          crossuserid: '',
          crossrefid: '',
        },


        rules: {
          yuyuebianhao: [
          ],
          yuyueneirong: [
          ],
          yuyueshijian: [
          ],
          yishenggonghao: [
          ],
          yishengxingming: [
          ],
          keshi: [
          ],
          zhaopian: [
          ],
          yonghuzhanghao: [
          ],
          xingming: [
          ],
          shouji: [
          ],
          quxiaoyuanyin: [
          ],
          quxiaoshijian: [
          ],
          crossuserid: [
          ],
          crossrefid: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



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
      this.ruleForm.quxiaoshijian = this.getCurDateTime()
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
            if(o=='yuyuebianhao'){
              this.ruleForm.yuyuebianhao = obj[o];
              this.ro.yuyuebianhao = true;
              continue;
            }
            if(o=='yuyueneirong'){
              this.ruleForm.yuyueneirong = obj[o];
              this.ro.yuyueneirong = true;
              continue;
            }
            if(o=='yuyueshijian'){
              this.ruleForm.yuyueshijian = obj[o];
              this.ro.yuyueshijian = true;
              continue;
            }
            if(o=='yishenggonghao'){
              this.ruleForm.yishenggonghao = obj[o];
              this.ro.yishenggonghao = true;
              continue;
            }
            if(o=='yishengxingming'){
              this.ruleForm.yishengxingming = obj[o];
              this.ro.yishengxingming = true;
              continue;
            }
            if(o=='keshi'){
              this.ruleForm.keshi = obj[o];
              this.ro.keshi = true;
              continue;
            }
            if(o=='zhaopian'){
              this.ruleForm.zhaopian = obj[o].split(",")[0];
              this.ro.zhaopian = true;
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
            if(o=='quxiaoyuanyin'){
              this.ruleForm.quxiaoyuanyin = obj[o];
              this.ro.quxiaoyuanyin = true;
              continue;
            }
            if(o=='quxiaoshijian'){
              this.ruleForm.quxiaoshijian = obj[o];
              this.ro.quxiaoshijian = true;
              continue;
            }
            if(o=='crossuserid'){
              this.ruleForm.crossuserid = obj[o];
              this.ro.crossuserid = true;
              continue;
            }
            if(o=='crossrefid'){
              this.ruleForm.crossrefid = obj[o];
              this.ro.crossrefid = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0){
                this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
            }
            if((json.xingming!=''&&json.xingming) || json.xingming==0){
                this.ruleForm.xingming = json.xingming
            }
            if((json.shouji!=''&&json.shouji) || json.shouji==0){
                this.ruleForm.shouji = json.shouji
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
        this.$http.get(`yuyuequxiao/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

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
						this.$http.get('yuyuequxiao/list', {
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


								this.$http.post(`yuyuequxiao/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
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


						this.$http.post(`yuyuequxiao/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
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
      zhaopianUploadChange(fileUrls) {
          this.ruleForm.zhaopian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
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
