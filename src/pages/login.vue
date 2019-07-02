<template>
    <div class="login-container">
        <h1 class="title">cms-demo</h1>
        <div class="from">
            <el-input 
            v-model="userName" 
            prefix-icon="el-icon-user"
            placeholder="请输入您的用户名"></el-input>
            <el-input v-model="password" 
            prefix-icon="el-icon-edit"
            placeholder="请输入您的密码" show-password></el-input>
            <el-button type="primary" @click="submit">登录</el-button>
        </div>
    </div>
</template>

<script>
export default {
    data(){
        return{
            userName:'',
            password:'',
            medium:'medium'
        }
    },
    methods:{
        submit(){
            this.$message({
                message: '登录成功~',
                type: 'success'
            })

            this.$router.push('./home')
        }
    }
}
</script>

<style lang="stylus" scoped>
    .title
        margin 50px 0
        font-size 42px
        font-weight 300
    .login-container
        max-width 400px
        margin 0 auto
        text-align center
        display flex
        justify-content center
        flex-wrap wrap
        .from
            width 300px
            background #ffffff
            padding 60px 30px
            border-top-left-radius: 3px
            border-top-right-radius: 3px
            border-bottom-left-radius: 3px
            border-bottom-right-radius: 3px
            .el-input
                margin-bottom 25px
            .el-button
                width 100%
           


</style>


