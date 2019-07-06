<template>
    <div class="home-header">
       <div class="userComponet">
           <span class="userName">管理员</span>
           <i class="el-icon-caret-bottom"></i>
       </div>
       <i class="el-icon-s-fold hidden-sm-and-up" @click="changeMD"></i>
    </div>
</template>

<script>

export default {
    name:'homeHeader',
    methods:{
        changeMD(){
            this.$parent.layoutMD = true
        }
    }
}
</script>

<style lang="stylus" scoped>
.home-header
    display flex
    align-items center
    justify-content space-between
    height 60px
    background white
    width 100%
    padding 0 20px
    box-sizing border-box
    box-shadow: 0 1px 2px 0 rgba(0,0,0,.1)
    color #333
    flex-direction row-reverse
    .el-icon-s-fold
        font-size 18px
    .userComponet
        float right
    .userName
        font-size 14px
</style>


