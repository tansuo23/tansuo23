package threalocal;

import java.util.concurrent.*;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.10
 * @Version 1.0
 */
public class ThreadPool_Test01 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor(); //单线程
        ExecutorService executorService = Executors.newCachedThreadPool(); // 缓存线程池
        ExecutorService service1 = Executors.newFixedThreadPool(30); // 固定线程池
        ScheduledExecutorService service2 = Executors.newScheduledThreadPool(10); // 定时任务线程池
        for (int i = 0; i <= 1000; i++) {
            final int j = i;
            service2.execute(() -> {
                try {
                    TimeUnit.MICROSECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(j + "线程是：" + Thread.currentThread().getName());
            });
        }
        System.out.println(service2);
        try {
            TimeUnit.SECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service2);
    }
}
