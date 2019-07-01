import * as types from './mutation-types'

export default {
    [types.SET_ADDCOUNT](state){
        state.count++
    },
    [types.SET_DELETECOUNT](state){
        state.count--
    }
}