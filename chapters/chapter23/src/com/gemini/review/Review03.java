package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review03 {
/*
场景：你想偷看某个类里被 private 隐藏起来的私有密码本。

问题：在调用反射 API 获取属性时，getFields() 和 getDeclaredFields() 这两个方法，
哪一个才能帮你拿到 private 修饰的私有属性？它们俩的核心区别是什么？

特性                      getFields()     getDeclaredFields()
能查到private 吗？	        绝对不能 ❌	        能 ✅
能查到protected/默认 吗？	    不能 ❌	            能 ✅
查不查父类的字段？	        查 (但只查父类的 public)	不查 (只查当前类自己的)
返回什么？	            所有能公开的字段数组	当前类声明的所有字段数组
像什么？	                查“企业工商公开信息”	拿着搜查令进卧室
 */
}
