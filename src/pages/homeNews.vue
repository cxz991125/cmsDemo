<template>
    <div class="newsContainer">
        <div class="newContent">
            <div class="newsTable">
                <el-table
                ref="singleTable"
                :data="tableData"
                highlight-current-row
                style="width: 100%">
                <el-table-column type="index" width="50"></el-table-column>
                <el-table-column property="date" label="日期" width="120"></el-table-column>
                <el-table-column property="name" label="姓名" width="120"></el-table-column>
                <el-table-column property="address" label="地址"></el-table-column>
                <el-table-column property="news" label="新闻"></el-table-column>
            </el-table>
            </div>
            <el-pagination background layout="prev, pager, next" :total="1000" />
        </div>
    </div>
</template>

<script>
export default {
    data() {
      return {
        tableData: [{
          date: '2016-05-03',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }, {
          date: '2016-05-02',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }, {
          date: '2016-05-04',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }, {
          date: '2016-05-01',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }, {
          date: '2016-05-08',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }, {
          date: '2016-05-06',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }, {
          date: '2016-05-07',
          name: '王小虎',
          province: '上海',
          city: '普陀区',
          address: '上海市普陀区金沙江路 1518 弄',
          news:'新闻呢新闻',
          zip: 200333
        }]
      }
    }
}
</script>

<style lang="stylus">
    .newsContainer
        padding 10px
        height calc(100% - 60px)
        width 100%
        box-sizing border-box
        .newContent
            box-shadow 0 1px 2px 0 rgba(0,0,0,.05)
            background white
            height 100%
            position relative
            .newsTable
                min-height 90%
</style>


