// 父传子：props
// 子传父：$emit

// 父组件
<MaterialTable :category-id="currentCategoryId" @delete="handleDelete" />

// 子组件
export default {
  props: ['categoryId'],
  methods: {
    handleDelete(id) {
      this.$emit('delete', id); // 子传父
    }
  }
}