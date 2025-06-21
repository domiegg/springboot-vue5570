import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yuyuetijian from '@/views/modules/yuyuetijian/list'
    import discusstongzhigonggao from '@/views/modules/discusstongzhigonggao/list'
    import duihuanjifen from '@/views/modules/duihuanjifen/list'
    import yulehuodong from '@/views/modules/yulehuodong/list'
    import keshi from '@/views/modules/keshi/list'
    import yangshengshipin from '@/views/modules/yangshengshipin/list'
    import yuyuequxiao from '@/views/modules/yuyuequxiao/list'
    import yulehuodongyuyue from '@/views/modules/yulehuodongyuyue/list'
    import forum from '@/views/modules/forum/list'
    import tijianjiankangxinxi from '@/views/modules/tijianjiankangxinxi/list'
    import discussyishuzihuajianshang from '@/views/modules/discussyishuzihuajianshang/list'
    import yonghu from '@/views/modules/yonghu/list'
    import jifenshangcheng from '@/views/modules/jifenshangcheng/list'
    import yishuzihuajianshang from '@/views/modules/yishuzihuajianshang/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import yuyuejiuzhen from '@/views/modules/yuyuejiuzhen/list'
    import yisheng from '@/views/modules/yisheng/list'
    import discussyangshengshipin from '@/views/modules/discussyangshengshipin/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yuyuetijian',
        name: '预约体检',
        component: yuyuetijian
      }
      ,{
	path: '/discusstongzhigonggao',
        name: '通知公告评论',
        component: discusstongzhigonggao
      }
      ,{
	path: '/duihuanjifen',
        name: '兑换积分',
        component: duihuanjifen
      }
      ,{
	path: '/yulehuodong',
        name: '娱乐活动',
        component: yulehuodong
      }
      ,{
	path: '/keshi',
        name: '科室',
        component: keshi
      }
      ,{
	path: '/yangshengshipin',
        name: '养生视频',
        component: yangshengshipin
      }
      ,{
	path: '/yuyuequxiao',
        name: '预约取消',
        component: yuyuequxiao
      }
      ,{
	path: '/yulehuodongyuyue',
        name: '娱乐活动预约',
        component: yulehuodongyuyue
      }
      ,{
	path: '/forum',
        name: '留言板',
        component: forum
      }
      ,{
	path: '/tijianjiankangxinxi',
        name: '体检健康信息',
        component: tijianjiankangxinxi
      }
      ,{
	path: '/discussyishuzihuajianshang',
        name: '艺术字画鉴赏评论',
        component: discussyishuzihuajianshang
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/jifenshangcheng',
        name: '积分商城',
        component: jifenshangcheng
      }
      ,{
	path: '/yishuzihuajianshang',
        name: '艺术字画鉴赏',
        component: yishuzihuajianshang
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/yuyuejiuzhen',
        name: '预约就诊',
        component: yuyuejiuzhen
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/discussyangshengshipin',
        name: '养生视频评论',
        component: discussyangshengshipin
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
