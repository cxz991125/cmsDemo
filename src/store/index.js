import Vue from 'vue'
import Vuex from 'vuex'
import state from './state'
import * as getters from './Getters'
import mutations from './Mutations'
import actions from './Action'

Vue.use(Vuex)

const store = new Vuex.Store({
    state,
    getters,
    mutations,
    actions
})

export default store