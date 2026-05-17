// 生产者消费者 — BlockingQueue 版

public class ProducerConsumer2 {
	private static final BlockingQueue<Integer> queue = new ArraBlockingQueue<>(10));

	public static voids main(String[] args) {
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
	}

	producer.start();
	consumer.start();
}