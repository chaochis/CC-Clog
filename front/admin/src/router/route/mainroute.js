import routeName from '../routename'

let mainRoute = [
  //index 主页
  {
    path: '/',
    name: routeName.ccMain,
    component: ()=> import('@/pages/ccindex'),
    meta: {
      title: '主页'
     }
  }
]

export default mainRoute
