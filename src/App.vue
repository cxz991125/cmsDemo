<template>
    <transition name="fade" mode="out-in">
        <router-view/>
    </transition>
</template>

<script>

export default {
   
}
</script>



<style lang="stylus">
    @import url(./assets/css/reset.css)
    @import url(./assets/css/base.css)
    html,body 
        width 100%
        height 100%
    .fade-enter 
        opacity 0
    .fade-leave
        opacity 1
    .fade-enter-active
        transition opacity .5s
    .fade-leave-active
        opacity 0
        transition opacity .5s
</style>


