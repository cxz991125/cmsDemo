<template>
    <el-container class="layout-container">
        <el-aside width="220px">
            <home-menu></home-menu>
        </el-aside>
        <el-container>
            <el-header>
                <home-header></home-header>
            </el-header>
            <el-main>Main</el-main>
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

