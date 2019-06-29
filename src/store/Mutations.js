import {
    SET_ADDCOUNT,
    SET_DELETECOUNT
}   from './mutation-types'

export default {
    SET_ADDCOUNT(state){
        state.count++
    },
    SET_DELETECOUNT(state){
        state.count--
    }
}