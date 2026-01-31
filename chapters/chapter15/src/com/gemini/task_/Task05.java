package com.gemini.task_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task05 {
    /*
    定义了一个泛型接口 interface Usb<U, R> (U代表参数，R代表返回值)。

    问题： 在 main 方法中创建 Camera 对象时，必须确定 U 和 R 的具体类型吗？(Yes/No)
     */
    public static void main(String[] args) {

    }
}
// 定义接口：U是参数类型，R是返回值类型
interface Usb<U, R> {
    R connect(U u);
}

// 🎯 情况 1：实现接口时，直接“定死”类型
// 这里的 connect 方法接收 String，返回 Integer
class Mouse implements Usb<String, Integer> {
    @Override
    public Integer connect(String u) {
        return Integer.parseInt(u);
    }
}

// 🎯 情况 2：实现接口时，自己依然保持泛型（把皮球踢给使用者）
// Camera 类自己也定义了 U, R，并传给 Usb 接口
class Camera<U, R> implements Usb<U, R> {
    @Override
    public R connect(U u) {
        return null;
    }
}