import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yishengList from '../pages/yisheng/list'
import yishengDetail from '../pages/yisheng/detail'
import yishengAdd from '../pages/yisheng/add'
import keshiList from '../pages/keshi/list'
import keshiDetail from '../pages/keshi/detail'
import keshiAdd from '../pages/keshi/add'
import yuyuejiuzhenList from '../pages/yuyuejiuzhen/list'
import yuyuejiuzhenDetail from '../pages/yuyuejiuzhen/detail'
import yuyuejiuzhenAdd from '../pages/yuyuejiuzhen/add'
import yuyuequxiaoList from '../pages/yuyuequxiao/list'
import yuyuequxiaoDetail from '../pages/yuyuequxiao/detail'
import yuyuequxiaoAdd from '../pages/yuyuequxiao/add'
import yuyuetijianList from '../pages/yuyuetijian/list'
import yuyuetijianDetail from '../pages/yuyuetijian/detail'
import yuyuetijianAdd from '../pages/yuyuetijian/add'
import tijianjiankangxinxiList from '../pages/tijianjiankangxinxi/list'
import tijianjiankangxinxiDetail from '../pages/tijianjiankangxinxi/detail'
import tijianjiankangxinxiAdd from '../pages/tijianjiankangxinxi/add'
import yangshengshipinList from '../pages/yangshengshipin/list'
import yangshengshipinDetail from '../pages/yangshengshipin/detail'
import yangshengshipinAdd from '../pages/yangshengshipin/add'
import yishuzihuajianshangList from '../pages/yishuzihuajianshang/list'
import yishuzihuajianshangDetail from '../pages/yishuzihuajianshang/detail'
import yishuzihuajianshangAdd from '../pages/yishuzihuajianshang/add'
import yulehuodongList from '../pages/yulehuodong/list'
import yulehuodongDetail from '../pages/yulehuodong/detail'
import yulehuodongAdd from '../pages/yulehuodong/add'
import yulehuodongyuyueList from '../pages/yulehuodongyuyue/list'
import yulehuodongyuyueDetail from '../pages/yulehuodongyuyue/detail'
import yulehuodongyuyueAdd from '../pages/yulehuodongyuyue/add'
import jifenshangchengList from '../pages/jifenshangcheng/list'
import jifenshangchengDetail from '../pages/jifenshangcheng/detail'
import jifenshangchengAdd from '../pages/jifenshangcheng/add'
import duihuanjifenList from '../pages/duihuanjifen/list'
import duihuanjifenDetail from '../pages/duihuanjifen/detail'
import duihuanjifenAdd from '../pages/duihuanjifen/add'
import tongzhigonggaoList from '../pages/tongzhigonggao/list'
import tongzhigonggaoDetail from '../pages/tongzhigonggao/detail'
import tongzhigonggaoAdd from '../pages/tongzhigonggao/add'
import discussyangshengshipinList from '../pages/discussyangshengshipin/list'
import discussyangshengshipinDetail from '../pages/discussyangshengshipin/detail'
import discussyangshengshipinAdd from '../pages/discussyangshengshipin/add'
import discussyishuzihuajianshangList from '../pages/discussyishuzihuajianshang/list'
import discussyishuzihuajianshangDetail from '../pages/discussyishuzihuajianshang/detail'
import discussyishuzihuajianshangAdd from '../pages/discussyishuzihuajianshang/add'
import discusstongzhigonggaoList from '../pages/discusstongzhigonggao/list'
import discusstongzhigonggaoDetail from '../pages/discusstongzhigonggao/detail'
import discusstongzhigonggaoAdd from '../pages/discusstongzhigonggao/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yisheng',
					component: yishengList
				},
				{
					path: 'yishengDetail',
					component: yishengDetail
				},
				{
					path: 'yishengAdd',
					component: yishengAdd
				},
				{
					path: 'keshi',
					component: keshiList
				},
				{
					path: 'keshiDetail',
					component: keshiDetail
				},
				{
					path: 'keshiAdd',
					component: keshiAdd
				},
				{
					path: 'yuyuejiuzhen',
					component: yuyuejiuzhenList
				},
				{
					path: 'yuyuejiuzhenDetail',
					component: yuyuejiuzhenDetail
				},
				{
					path: 'yuyuejiuzhenAdd',
					component: yuyuejiuzhenAdd
				},
				{
					path: 'yuyuequxiao',
					component: yuyuequxiaoList
				},
				{
					path: 'yuyuequxiaoDetail',
					component: yuyuequxiaoDetail
				},
				{
					path: 'yuyuequxiaoAdd',
					component: yuyuequxiaoAdd
				},
				{
					path: 'yuyuetijian',
					component: yuyuetijianList
				},
				{
					path: 'yuyuetijianDetail',
					component: yuyuetijianDetail
				},
				{
					path: 'yuyuetijianAdd',
					component: yuyuetijianAdd
				},
				{
					path: 'tijianjiankangxinxi',
					component: tijianjiankangxinxiList
				},
				{
					path: 'tijianjiankangxinxiDetail',
					component: tijianjiankangxinxiDetail
				},
				{
					path: 'tijianjiankangxinxiAdd',
					component: tijianjiankangxinxiAdd
				},
				{
					path: 'yangshengshipin',
					component: yangshengshipinList
				},
				{
					path: 'yangshengshipinDetail',
					component: yangshengshipinDetail
				},
				{
					path: 'yangshengshipinAdd',
					component: yangshengshipinAdd
				},
				{
					path: 'yishuzihuajianshang',
					component: yishuzihuajianshangList
				},
				{
					path: 'yishuzihuajianshangDetail',
					component: yishuzihuajianshangDetail
				},
				{
					path: 'yishuzihuajianshangAdd',
					component: yishuzihuajianshangAdd
				},
				{
					path: 'yulehuodong',
					component: yulehuodongList
				},
				{
					path: 'yulehuodongDetail',
					component: yulehuodongDetail
				},
				{
					path: 'yulehuodongAdd',
					component: yulehuodongAdd
				},
				{
					path: 'yulehuodongyuyue',
					component: yulehuodongyuyueList
				},
				{
					path: 'yulehuodongyuyueDetail',
					component: yulehuodongyuyueDetail
				},
				{
					path: 'yulehuodongyuyueAdd',
					component: yulehuodongyuyueAdd
				},
				{
					path: 'jifenshangcheng',
					component: jifenshangchengList
				},
				{
					path: 'jifenshangchengDetail',
					component: jifenshangchengDetail
				},
				{
					path: 'jifenshangchengAdd',
					component: jifenshangchengAdd
				},
				{
					path: 'duihuanjifen',
					component: duihuanjifenList
				},
				{
					path: 'duihuanjifenDetail',
					component: duihuanjifenDetail
				},
				{
					path: 'duihuanjifenAdd',
					component: duihuanjifenAdd
				},
				{
					path: 'tongzhigonggao',
					component: tongzhigonggaoList
				},
				{
					path: 'tongzhigonggaoDetail',
					component: tongzhigonggaoDetail
				},
				{
					path: 'tongzhigonggaoAdd',
					component: tongzhigonggaoAdd
				},
				{
					path: 'discussyangshengshipin',
					component: discussyangshengshipinList
				},
				{
					path: 'discussyangshengshipinDetail',
					component: discussyangshengshipinDetail
				},
				{
					path: 'discussyangshengshipinAdd',
					component: discussyangshengshipinAdd
				},
				{
					path: 'discussyishuzihuajianshang',
					component: discussyishuzihuajianshangList
				},
				{
					path: 'discussyishuzihuajianshangDetail',
					component: discussyishuzihuajianshangDetail
				},
				{
					path: 'discussyishuzihuajianshangAdd',
					component: discussyishuzihuajianshangAdd
				},
				{
					path: 'discusstongzhigonggao',
					component: discusstongzhigonggaoList
				},
				{
					path: 'discusstongzhigonggaoDetail',
					component: discusstongzhigonggaoDetail
				},
				{
					path: 'discusstongzhigonggaoAdd',
					component: discusstongzhigonggaoAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
