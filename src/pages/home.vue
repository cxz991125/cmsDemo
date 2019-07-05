<template>
    <el-container class="layout-container">
        <el-aside width="220px" class="aside">
            <home-menu></home-menu>
        </el-aside>
        <el-container class="home-container">
            <el-header>
                <home-header></home-header>
            </el-header>
            <el-main style="padding:0;background:green">
                主体
                <router-view />
            </el-main>
        </el-container>
    </el-container>
</template>

<script>
export default {
    
}
</script>

<style lang="stylus">
    .layout-container
        width 100%
        height 100%
        .aside
            transform translate3d(0,0,0)
            transition all .5s
            z-index 11
    @media screen and (max-width:992px)
        .layout-container
            .aside
                transform translate3d(-220px,0,0)
                height 100%
                position absolute
            .home-container
                width 100%
           
               
</style>

