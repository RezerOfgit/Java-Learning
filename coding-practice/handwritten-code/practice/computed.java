// computed：有缓存，依赖不变就不重新计算，适合"算出来的值"
// watch：监听某个值变化后执行副作用，适合"发请求、做操作"

// 项目示例：筛选耗材列表
computed: {
  filteredList() {
    return this.materials.filter(m => m.stock > 0); // 有缓存，依赖不变不重算
  }
}