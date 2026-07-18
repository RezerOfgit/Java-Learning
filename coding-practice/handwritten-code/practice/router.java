// 面试常问：你前端怎么做权限控制的？

router.beforeEach((to, from, next) => {
  const token = localStorage.getItem('token');
  if (to.path !== '/login' && !token) {
    next('/login'); // 未登录跳登录页
  } else {
    next();
  }
});