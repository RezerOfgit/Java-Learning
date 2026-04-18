package com.gemini.review;

/**
 * @author Re-zero
 * @version 1.0
 * 场景：ServiceA 中有一个 insertA() 方法（带有 @Transactional 默认配置）。
 * 它内部调用了 ServiceB 的 insertB() 方法，且 insertB() 带有
 * @Transactional(propagation = Propagation.REQUIRES_NEW)。
 *
 * 执行过程：insertB() 成功执行并顺利走完了它的代码块。紧接着，insertA()
 * 在继续往下执行时，突然抛出了一个 1/0 的 RuntimeException。
 * 问题：请问此时数据库中，A 数据和 B 数据分别是什么状态？（谁进去了，谁被回滚了？）为什么？
 */
public class Review04 {
    /*
    在该场景下，B 数据会成功提交到数据库，而 A 数据会被回滚。

原因分析
ServiceA.insertA() 使用默认 @Transactional（Propagation.REQUIRED），开启事务 TA。
调用 ServiceB.insertB()，其传播行为为 Propagation.REQUIRES_NEW，此时会挂起事务 TA，新建一个独立的事务 TB 来执行 insertB。
insertB 执行完毕后，事务 TB 立即提交（因为它的代码块结束且无异常），B 数据持久化。
随后回到 insertA 继续执行，insertA 抛出 1/0 运行时异常（RuntimeException），触发事务 TA 的回滚，A 数据不会被提交。
因此最终结果：B 数据已提交（保留），A 数据被回滚（不存在）。
     */
}
