<template>
    <ul class="menu-container" 
        @mousemove="chenggeLeft">
       <li class="menu-item" v-for="(item,index) in menuData" :key="index">
           <a href="#" @click.prevent="changeMenu"  class="levelOneMenu">
               <i class="el-icon-eleme"></i>
                <span>{{item}}</span>
                <i class="el-icon-caret-bottom"></i>
           </a>
           <dl>
               <dd></dd>
           </dl>
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
            }
        }
    },
    methods:{
        changeMenu(e){


        },
        chenggeLeft(){
            const target = event.target

            if(target.tagName === 'LI'){
                this.borderTop.top = getClienRect(target).y + 'px'
                this.borderTop.opacity = 1
            }
        }
    }
}
</script>

<style lang="stylus">
    .menu-container
        background-color #20222a
        height 100%
        color white
        position relative
        .menu-item
            font-size 14px
            color rgba(255,255,255,0.7)
            padding 23px
            cursor pointer
            &:hover
                .levelOneMenu
                    color white
            .levelOneMenu
                position relative
                display block
                color rgba(255,255,255,0.7)
                .el-icon-caret-bottom
                    position absolute
                    right 0
        .leftBorder
            position absolute
            top 0
            left 0
            width 5px
            height 60px
            background-color #009688
            transition all .3s
</style>


