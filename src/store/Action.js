import * as types from './mutation-types'

export default {
    addCount({commit,state}){
        commit(types.SET_ADDCOUNT)
    },
    deleteCount({commit,state}){
        commit(types.SET_DELETECOUNT)
    }
}