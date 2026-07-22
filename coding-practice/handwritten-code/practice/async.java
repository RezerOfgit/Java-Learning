// 面试常问：你怎么处理异步请求的？
async fetchMaterial(id) {
  try {
    const res = await request.get('/material/' + id);
    this.material = res.data;
  } catch (error) {
    this.$message.error('获取耗材信息失败');
  }
}