import {
    SET_ADDCOUNT,
    SET_DELETECOUNT
} from './mutation-types'

export default {
    SET_ADDCOUNT({commit,state}){
        commit(SET_ADDCOUNT)
    },
    SET_DELETECOUNT({commit,state}){
        commit(SET_DELETECOUNT)
    }
}