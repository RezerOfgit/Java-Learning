package com.gemini.supplement_;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Supplement04 {
    /*
    背景： 你可能会疑惑：为什么要分 extends 和 super？
    这涉及到一个核心原则：PECS (Producer Extends, Consumer Super)。

思考： 对于 List<? extends Animal> list（哪怕它实际引用的是 List<Dog>）：
我能从中 读取 (get) 数据吗？(读取出来一定是个 Animal) -> Yes
读取 (Get) -> Yes: 你可以透过窗户看里面的动物，
并且你确定看到的任何动物都至少是一个 Animal。
所以你可以用 Animal a = list.get(0); 来接收它。这很安全。

我能往里 写入 (add) 数据吗？(比如 add(new Dog())) -> No!
写入 (Add) -> No: 你不能把一只新的动物（比如 Dog）塞进这个窗户里。
为什么？因为你不知道窗户后面具体是哪个笼子。万一后面是 Cat 的笼子，
你塞一只 Dog 进去就全乱套了。为了防止这种混乱，
管理员（编译器）干脆禁止任何人往里塞动物。
问：为什么 <? extends Animal> 不能 添加 Dog？
编译器无法保证类型安全
(提示：万一 list 实际上指向的是 List<Cat> 呢？)
     */
}
