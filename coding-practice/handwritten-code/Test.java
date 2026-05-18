/**
 * @author Re-zero
 * @version 1.0
 */
public class Test {
    private static final Object lockA = new Object();
    private final static Object lockB = new Object();

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
