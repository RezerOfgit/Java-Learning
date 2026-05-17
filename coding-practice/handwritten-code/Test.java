import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Test {
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
