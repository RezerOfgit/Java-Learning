package com.rezero.stringbuffer_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String --> StringBuffer
        String str = "hello tom";
        //方式1 使用构造器
        //注意: 返回的才是StringBuffer 对象,对str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2 使用的是append 方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer --> String
        StringBuffer stringBuffer3 = new StringBuffer("String与StringBuffer互相转换");
        //方式1 使用StringBuffer 提供的toString 方法
        String s = stringBuffer3.toString();
        //方式2 使用构造器来搞定
        String s1 = new String(stringBuffer3);
    }
}
