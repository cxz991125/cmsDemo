<template>
    <el-container class="layout-container">
        <el-aside width="220px">
            <home-menu></home-menu>
        </el-aside>
        <el-container>
            <el-header style="padding:0">
                <home-header></home-header>
            </el-header>
            <el-main style="padding:0">
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
</style>

