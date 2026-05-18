// 生产者消费者 — BlockingQueue 版
/*
1. 声明阻塞队列
2. 生产者 put()
3. 消费者 take()
4. 异常处理
5. 无显式锁
6. 日志只作观察
7. 启动线程
 */

public class ProducerConsumer2 {
    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    queue.put(1);
                    System.out.println("生产，当前库存：" + queue.size());
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    queue.take();
                    System.out.println("消费，当前库存：" + queue.size());
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        producer.start();
        consumer.start();
    }
}

/*
size 的输出准确吗？
BlockingQueue 的 size() 是精确的，但由于多线程并发，打印时刻与实际状态可能
有时差，这里的输出仅用于观察生产消费趋势，不参与逻辑判断，所以没问题。

这是用 BlockingQueue 实现的生产者消费者模型。
ArrayBlockingQueue 是一个有界的阻塞队列，内部通过锁和条件变量实现了线程安全。
生产者线程调用 put 方法，当队列满时会被自动阻塞，直到有空间；消费者线程调用 take，
队列空时自动阻塞，直到有新元素。
这就把原先需要手动处理 synchronized、wait、notifyAll 以及 while 条件判断的
复杂性都屏蔽掉了，代码更可靠。
线程中断时，put 和 take 会抛出 InterruptedException，在 catch 块中用 break 
跳出循环，确保线程可以优雅终止。
打印的 queue.size() 仅用来监控生产消费速度，并不参与逻辑控制，所以并发下的
瞬时差异不影响正确性。

BlockingQueue 内部是如何实现的？
它基于 ReentrantLock 和两个 Condition（notFull、notEmpty），put 时若满
则调用 notFull.await()，插入后调用 notEmpty.signal()；take 时若空则调用
 notEmpty.await()，取出后调用 notFull.signal()，逻辑和我们手写的 
 wait/notify 版类似，只是更健壮。
 */