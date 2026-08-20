// 面试常问：你前端怎么调后端接口的？Token 怎么带的？

import axios from 'axios';

const request = axios.create({
  baseURL: '/api',
  timeout: 5000
});

// 请求拦截器：自动带上 JWT Token
request.interceptors.request.use(config => {
  const token = localStorage.getItem('token');
  if (token) {
    config.headers['Authorization'] = 'Bearer ' + token;
  }
  return config;
});

// 响应拦截器：统一处理错误
request.interceptors.response.use(
  response => response.data,
  error => {
    if (error.response.status === 401) {
      // Token 过期，跳登录页
      router.push('/login');
    }
    return Promise.reject(error);
  }
);

export default request;