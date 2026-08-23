// 面试官可能问：你简历上写了 v-hasPermi 指令，怎么实现的？
Vue.directive('hasPermi', {
  inserted(el, binding) {
    const permissions = store.state.user.permissions;
    const required = binding.value;
    if (!permissions.includes(required)) {
      el.parentNode.removeChild(el);
    }
  }
});
// 使用：<el-button v-hasPermi="'material:delete'">删除</el-button>