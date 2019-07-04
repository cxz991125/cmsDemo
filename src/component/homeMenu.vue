<template>
    <ul class="menu-container" 
        @mousemove="changeMove">
       <li class="menu-title"><span>cms-demo</span></li>
       <li class="menu-item" 
        :key="index" 
        v-for="(item,index) in menuData" 
        :class="{menuActive:index === menuIndex}">
           <a href="#" class="levelOneMenu" @click="handleClickMenu(index,$event)">
               <i class="el-icon-eleme"></i>
                <span>{{item}}</span>
                <i class="el-icon-caret-bottom"></i>
           </a>
           <ul class="submenu-item" v-show="index === menuIndex">
               <li><a href="#">二级标题</a></li>
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
            menuData:['首页','组件','页面','应用','高级','用户','资料',],
            borderTop:{
                top:0,
                opacity:0
            },
            menuIndex:-1,

        }
    },
    methods:{
        handleClickMenu(index,e){
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
        changeLeft(el){
            if(Array.from(el.classList).indexOf('levelOneMenu') != -1){
                this.borderTop.top = getClienRect(el).y + 'px'
                this.borderTop.opacity = 1
            }
        }
    }
}
</script>

<style lang="stylus" scoped>
    .menu-container
        background-color #20222a
        height 100%
        color white
        position relative
        .menu-title
            padding 23px
            text-align center
            font-size 18px
            border-bottom 1px solid rgba(0,0,0,0.3)
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
        .leftBorder
            position absolute
            top 0
            left 0
            width 5px
            height 60px
            background-color #009688
            transition all .3s

.el-icon-caret-bottom
    position absolute
    transform rotateX(0)
    right 15px
</style>


