import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../pages/login'
import Home from '../pages/home'

Vue.use(VueRouter)

const routes = [
    {path:'/home',component:Home},
    {path:'*',component:Login}
];

const router = new VueRouter({
    routes
})

export default router