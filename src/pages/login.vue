<template>
    <div class="login-container">
        <h1 class="title">cms-demo</h1>
        <div class="from">
            <input type="text" placeholder="请输入您的账号">
            <input type="password" placeholder="请输入您的密码">
            <input type="button" value="登录" class="btn" @click="submit">
        </div>
    </div>
</template>

<script>
export default {
    methods:{
        submit(){
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
            .btn
                margin-top 30px
                background:linear-gradient(-90deg,rgba(26,214,253,1),rgba(29,98,240,1));
                color white
                cursor:pointer
                letter-spacing 10px
                text-indent 10px
                &:hover
                    opacity .7
            input 
                width 90%
                background #f2f2f2
                font-size 12px
                height 45px
                padding 0 10px
                box-sizing border-box
                &:nth-child(2)
                    margin-top 30px
           


</style>


