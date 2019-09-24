import Vue from 'vue'
import Router from 'vue-router'
import mainRoute from './route/mainRoute'

Vue.use(Router)


let router = new Router({
  routes: [
    ...mainRoute
  ]
})

router.beforeEach((to, from, next) => {
  document.title = to.meta.title
  next()
})


export default router

