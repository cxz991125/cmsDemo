import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../pages/login'
import Home from '../pages/home'
import homePage from '../pages/HomePage'
import homeNews from '../pages/homeNews'

Vue.use(VueRouter)

const routes = [
    {
        path:'/home',component:Home,
        children:[
            {
                path:'',
                name:'homePage',
                component:homePage
            },
            {   
                path:'news',
                name:'news',
                component: homeNews
            }
        ]
    },
    {
        path:'/login',component:Login
    },
    {
        path:'*',component:Login
    }
]

const router = new VueRouter({
    routes
})

export default router