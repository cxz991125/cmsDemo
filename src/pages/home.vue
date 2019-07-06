<template>
    <div class="layout-container" :class="{'layout-md':layoutMD}">
        <home-menu></home-menu>
        <div class="main-body">
            <home-header></home-header>
        </div> 
        <div class="layer" @click="closeMD"></div>
    </div>
</template>

<script>
export default {
    data(){
        return{
            layoutMD:false
        }
    },
    methods:{
        closeMD(){
            this.layoutMD = false
        }
    }
}
</script>

<style lang="stylus">
.layout-container
    width 100%
    height 100%
    display flex
    .main-body 
        width calc(100% - 220px)
        position absolute
        top 0
        left 220px
        right 0
        height 100%
        overflow: hidden
        transition all .3s
    .layer
        position fixed
        top 0
        left 0
        width 100%
        height 100%
        background rgba(0,0,0,0.5)
        z-index 10
        display none

@media screen and (max-width: 992px)
    .layout-container
        .main-body
            left 0
            width 100%
    .layout-md
        .menu-container
            left 0px !important
        .layer
            display:block !important
        .main-body
            left 220px
</style>

