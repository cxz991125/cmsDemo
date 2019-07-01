import Vue from 'vue'
const requireComponent = require.context('../',true,/\.vue$/);

requireComponent.keys().forEach(item => {

    const component = requireComponent(item).default
    
    if(component.name){
        Vue.component(component.name,component)
    }
});