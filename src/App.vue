<template>
    <div class="test">
        <h1  >CMS-DEMO</h1>
        <h3>数字为:{{count}}</h3>
        <button type="button" class="btn btn-primary" @click="deleteCount">减一</button>
        <button type="button" class="btn btn-primary" @click="addCount">加一</button>
    </div>
</template>

<script>
import {mapGetters,mapActions} from 'vuex'

export default {
    methods:{
        ...mapActions([
           'addCount',
           'deleteCount'
        ])
    },
    computed:{
        ...mapGetters([
            'count'
        ])
    }
}
</script>


<style lang="scss">
    html,body{
        width:100%;
        height:100%;
    }
    .test{
        display: flex;
        flex-wrap: wrap;
        text-align: center;
        justify-content: center;
        align-items: center;
        height:300px;
        position: fixed;
        top:50%;
        left:50%;
        transform: translate(-50%,-50%);
        -webkit-transform: translate(-50%,-50%);
        h1,p,h3{
        width:100%;
        }
        h1{
            font-size:70px;
        }
        h3{
            font-size:50px;
        }
        button{
            margin-top:20px;
            margin-right:20px;
        }
    }
</style>
