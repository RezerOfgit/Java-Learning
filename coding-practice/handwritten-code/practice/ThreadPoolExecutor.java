ThreadPoolExecutor executor = new ThreadPoolExecutor(
    5,                          // corePoolSize: 核心线程数，常驻线程
    10,                         // maximumPoolSize: 最大线程数
    60,                         // keepAliveTime: 非核心线程空闲存活时间
    TimeUnit.SECONDS,           // keepAliveTime 的时间单位
    new LinkedBlockingQueue<>(100), // workQueue: 等待队列
    new ThreadFactory() {       // threadFactory: 自定义线程名（方便排查）
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "dcp-worker-" + r.hashCode());
        }
    },
    new ThreadPoolExecutor.CallerRunsPolicy() // handler: 拒绝策略
);