<template>
    <el-container class="layout-container">
        <el-aside width="220px">
            <home-menu></home-menu>
        </el-aside>
        <el-container>
            <el-header>Header</el-header>
            <el-main>Main</el-main>
            <el-footer>Footer</el-footer>
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

