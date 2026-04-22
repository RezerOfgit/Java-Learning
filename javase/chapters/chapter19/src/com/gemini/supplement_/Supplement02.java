package com.gemini.supplement_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement02 {
    /*
    在过去这几天里，每次写 IO 流，最让你痛苦的肯定是 finally 块里的“连环嵌套 try-catch + 判空”。虽然这体现了你极高的严谨性，但在真实企业开发中，大家都嫌这样写太臃肿了。

Java 7 引入了一个极其优雅的语法糖：try-with-resources (带资源的 try 语句)。

1. 语法对比 (ASCII 代码解剖)
Plaintext
 ❌ 传统写法 (你一直在用的“苦力版”)           ✅ 现代魔法 (try-with-resources)

 InputStream is = null;                      // ⚠️ 注意 try 后面多了一对圆括号 ()
 try {                                       try (InputStream is = new FileInputStream("..")) {
     is = new FileInputStream("..");
     is.read();                                  is.read();
 } catch (IOException e) {                   } catch (IOException e) {
     e.printStackTrace();                        e.printStackTrace();
 } finally {                                 }
     if (is != null) {                       // 💥 结束了！根本不需要写 finally！
         try {                               // JVM 会在 try 块结束时，自动帮你把圆括号里的流 close() 掉！
             is.close();
         } catch (...) {}
     }
 }
2. 它的底层原理是什么？为什么这么聪明？
你可能会问：“Java 怎么知道我要关哪个对象？”
其实，能放在 try(...) 圆括号里的对象，必须满足一个硬性条件：它的类必须实现了 AutoCloseable 或 Closeable 接口。
只要实现了这个接口，JVM 就会在代码块执行完毕（无论是正常结束还是抛出异常）时，自动隐式地调用该对象的 close() 方法。几乎所有的 IO 流（FileInputStream, BufferedReader, ObjectOutputStream 等）都在底层实现了这个接口。

3. 支持多个水管同时开启
如果你的代码里像拷贝文件那样，有输入流和输出流两个管子怎么办？可以用分号 ; 隔开：

try (
    FileInputStream fis = new FileInputStream("src.txt");
    FileOutputStream fos = new FileOutputStream("dest.txt")
) {
    // 边读边写...
} catch (IOException e) { ... }
// 块结束时，fos 和 fis 都会被自动安全关闭！
（强烈建议：在接下来的代码里，你可以尝试用这个新语法来替代繁琐的 finally！）
     */
}
