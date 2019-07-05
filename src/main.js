import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import ElementUi from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import 'element-ui/lib/theme-chalk/display.css';
import './util/global'

Vue.use(ElementUi)

new Vue({
    router,
    store,
    render: h => h(App),
}).$mount('#app')