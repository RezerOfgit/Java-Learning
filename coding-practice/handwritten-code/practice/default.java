export default {
  created() {
    this.fetchMaterialList(); // 调接口拿数据
  },
  mounted() {
    // DOM 已就绪，可以操作 DOM
  },
  beforeDestroy() {
    // 清理定时器、事件监听
  }
}