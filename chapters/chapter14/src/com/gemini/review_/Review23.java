package com.gemini.review_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Review23 {
    /*
    考察点：Task 25 报错的原因。
    题目： 调用 prop.load(reader) 时，必须捕获或抛出 IOException，
    而不能只抛出 FileNotFoundException。
    原因是：FileNotFoundException 是 IOException 的子类，
    根据多态和异常处理规则，方法声明抛出父类异常时，
    调用者必须处理这个父类异常范围内的所有可能性。
     */
}
