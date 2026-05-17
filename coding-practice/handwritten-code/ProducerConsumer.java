// 生产者消费者 — wait/notify 版
/* 共享变量 → 锁 → while 判断 → wait → 操作 → notifyAll
① 共享队列 + 锁对象
② 条件判断必须用 while，而不是 if
③ 生产者等待条件：while (queue.size() == MAX_SIZE)
④ 消费者等待条件：while (queue.isEmpty())
⑤ wait() 在循环体内，被中断时 break
⑥ 生产/消费操作
⑦ 通知用 notifyAll()，不用 notify()
⑧ 启动线程
 */

public class ProducerConsumer {
	private static final Queue<Integer> queue = new LinkedList<>();
	private static final int MAX_SIZE = 10;

	public static void main (String[] args) {
		//生产者
		Thread producer = new Thread(() -> {
			while (true) {
				synchronized (queue) {
					while (queue.size() == MAX_SIZE) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							break;
						}
					}
					queue.add(1);
					System.out.println("生产，当前库存：" + queue.size());
					queue.notifyAll();
				}
			}
		});
		
		//消费者
		Thread consumer = new Thread(() -> {
			while (true) {
				synchronized (queue) {
					while (queue.isEmpty()) {
						try {
							queue.wait();
						} catch (InterruptedException e) {
							break;
						}
					}
					queue.poll();
					System.out.println("消费，当前库存：" + queue.size());
					queue.notifyAll();
				}
			}
		});

		producer.start();
		consumer.start();
	}
}

/*
我实现的是基于 wait/notifyAll 的生产者消费者模型。
共享容器是一个 LinkedList 队列，最大容量设为 10。生产者和消费者都用 
synchronized (queue) 保证互斥。关键点是条件判断用 while 而不是 if，
防止虚假唤醒，也保证在多线程被 notifyAll 唤醒后重新检查条件。
生产者发现队列满时就 queue.wait() 释放锁并等待；消费者发现队列空时同理。
当条件满足，生产者往队列加元素，消费者从队列取元素，操作完成后调用 
queue.notifyAll() 通知所有等待线程，避免因为用 notify() 而可能唤醒同类
导致程序停滞。这样实现了线程安全且高效的生产消费模式。
 */