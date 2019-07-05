<template>
    <div class="home-header">
        <!-- <el-row>
            <el-col :span="12"><i class="el-icon-s-fold hidden-sm-and-up" ></i></el-col>
            <el-col :span="12" :offset="14">
                <div>
                    <div class="userName">
                        <span>管理员</span>
                        <span class="el-icon-caret-bottom"></span>
                    </div>
                </div>
            </el-col>
        </el-row> -->
        <el-row>
  <el-col :span="12"><div class="grid-content bg-purple"></div></el-col>
  <el-col :span="12"><div class="grid-content bg-purple-light"></div></el-col>
</el-row>
    </div>
</template>

<script>
export default {
    name:'homeHeader'
}
</script>

<style lang="stylus" scoped>
.home-header
    display flex
    align-items center
    justify-content space-between
    height 100%
    background red
    i 
        display inline-block
    .el-icon-s-fold
        font-size 20px
        cursor pointer
    .userName
        font-size 14px
        cursor pointer
</style>


