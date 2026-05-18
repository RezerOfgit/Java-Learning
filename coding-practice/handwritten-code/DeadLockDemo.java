// 死锁代码 + 排查
/*
构造死锁：两把锁，两个线程，交叉获取（t1 先 A 后 B，t2 先 B 后 A），
	中间加 sleep 保证交错。

排查命令：jps -l 找 PID → jstack <pid> 自动检测死锁。
根因分析：四个必要条件中，“环路等待”是直接原因。
修复方案：统一加锁顺序（破环路）或 tryLock 超时（破不可抢占）。
 */
public class DeadLockDemo {
	private static final Object lockA = new Object();
	private static final Object lockB = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (lockA) {
				System.out.println("t1 持有 lockA，等待 lockB");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
				synchronized (lockB) {
					System.out.println("t1 持有 lockA 和 lockB");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (lockB) {
				System.out.println("t2 持有 lockB，等待 lockA");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}
				synchronized (lockA) {
					System.out.println("t2 持有 lockB 和 lockA");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
/*
这段代码演示了典型的死锁场景。两个线程各自持有一把锁，同时又试图获取对方持有的锁，
配合 Thread.sleep(100) 保证它们交错执行，最终形成环路等待。
排查时先用 jps -l 获取 Java 进程 PID，再用 jstack <pid> 打印线程堆栈。
jstack 会在输出末尾直接标注死锁的线程和锁资源地址。
解决方法主要有两种：一是破坏环路等待，让所有线程按同一顺序获取锁；
二是用 ReentrantLock 的 tryLock 设置超时时间，规定时间内拿不到锁就释放已有锁，
从而避免死锁。

死锁发生后，你用什么命令定位？
用 jps -l 找到 Java 进程的 PID，再用 jstack <pid> 打印线程堆栈。
jstack 会在输出末尾直接标明 Found one Java-level deadlock，
并列出互相等待的线程和锁对象地址，非常直观。
 */

//怎么修？
//方式一：按顺序加锁（破坏环路等待）
// t1 和 t2 都先拿 lockA 再拿 lockB
Thread t1 = new Thread(() -> {
    synchronized (lockA) {
        System.out.println("t1 持有 lockA");
        synchronized (lockB) {
            System.out.println("t1 同时持有两把锁");
        }
    }
});

Thread t2 = new Thread(() -> {
    synchronized (lockA) {  // 改成和 t1 一样的顺序
        System.out.println("t2 持有 lockA");
        synchronized (lockB) {
            System.out.println("t2 同时持有两把锁");
        }
    }
});