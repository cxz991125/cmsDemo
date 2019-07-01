import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import './util/global'


new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app')