<template>
    <ul class="menu-container" @mousemove="changeMove">
       <li class="menu-title"><span>cms-demo</span></li>
       <li class="menu-item" :key="index" 
        v-for="(item,index) in menuData" 
        :class="{menuActive:index === menuIndex}">
           <a href="#" class="levelOneMenu" @click="handlerClickMenu(index,$event)">
               <i class="el-icon-eleme"></i>
                <span>{{item.name}}</span>
                <i class="el-icon-caret-bottom"></i>
           </a>
           <ul class="submenu-item" v-show="index === menuIndex">
               <li v-for="(child,i) in item.children" :key="i">
                   <a href="#" @click.prevent="handlerClickSubMenu(child)"
                   :style="{background:subMenuName === child.name?'#009688':''}">{{child.name}}</a>
                </li>
           </ul>
       </li>
       <li class="leftBorder" :style="borderTop"></li>
    </ul>
</template>

<script>
import {getClienRect} from '../util'

export default {
    name:'homeMenu',
    data(){
        return{
            menuData:[
                {name:'首页',children:[
                    {name:'首页',routerName:'homePage'},
                    {name:'新闻',routerName:'news'},
                    {name:'二级标题3',path:'/'}
                ]},
                {name:'组件',children:[
                    {name:'二级标题4',path:'/'},
                    {name:'二级标题5',path:'/'},
                    {name:'二级标题6',path:'/'}
                ]},
                {name:'页面',children:[
                    {name:'二级标题7',path:'/'},
                    {name:'二级标题8',path:'/'},
                    {name:'二级标题9',path:'/'}
                ]},
                {name:'应用',children:[
                    {name:'二级标题10',path:'/'},
                    {name:'二级标题11',path:'/'},
                    {name:'二级标题12',path:'/'}
                ]},
                {name:'高级',children:[
                    {name:'二级标题13',path:'/'},
                    {name:'二级标题14',path:'/'},
                    {name:'二级标题15',path:'/'}
                ]},
                {name:'用户',children:[
                    {name:'二级标题16',path:'/'},
                    {name:'二级标题17',path:'/'},
                    {name:'二级标题18',path:'/'}
                ]},
                {name:'资料',children:[
                    {name:'二级标题19',path:'/'},
                    {name:'二级标题20',path:'/'},
                    {name:'二级标题21',path:'/'}
                ]},
            ],
            borderTop:{
                top:0,
                opacity:0
            },
            menuIndex:0,
            subMenuName:'二级标题1',

        }
    },
    mounted(){
        window.haha = this;
    },
    methods:{
        handlerClickMenu(index,e){
            if(index === this.menuIndex){
                this.menuIndex = -1
                return
            }
            this.menuIndex = index
            this.$nextTick(function(){
                this.changeLeft(e.target)
            })
        },
        changeMove(){
            this.changeLeft(event.target)
        },
        handlerClickSubMenu(child){
            this.subMenuName = child.name
            this.$parent.layoutMD = false
            this.$router.push({name:child.routerName})
        },
        changeLeft(el){
            if(Array.from(el.classList).indexOf('levelOneMenu') != -1){
                this.borderTop.top = getClienRect(el).y + 'px'
                this.borderTop.opacity = 1
            }
        }
    },
}
</script>

<style lang="stylus" scoped>
    .menu-container
        background-color #20222a
        height 100%
        width 220px
        min-width 220px
        color white
        position absolute
        top 0
        left 0
        overflow auto
        box-sizing border-box
        transition all .3s
        z-index 11
        .menu-title
            padding 23px
            text-align center
            font-size 18px
            border-bottom 1px solid rgba(0,0,0,0.3)
            width 100%
            box-sizing border-box
        .menuActive
            .el-icon-caret-bottom
                transform rotateX(180deg)
        .menu-item
            font-size 14px
            color rgba(255,255,255,0.7)
            &:hover
                .levelOneMenu
                    color white
            .levelOneMenu
                position relative
                display block
                color rgba(255,255,255,0.7)
                padding 23px
                
            .submenu-item
                background rgba(0,0,0,0.3)
                padding 5px 0
                a
                    padding 15px
                    padding-left 60px
                    display block
                    transition all .5s
        .leftBorder
            position absolute
            top 0
            left 0
            width 5px
            height 60px
            background-color #009688
            transition all .3s
    @media screen and (max-width: 992px)
       .menu-container
            left -220px     

.el-icon-caret-bottom
    position absolute
    transform rotateX(0)
    right 15px
</style>


