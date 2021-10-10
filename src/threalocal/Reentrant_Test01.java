package threalocal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Phaser;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.1
 * @Version 1.0
 */
public class Reentrant_Test01 extends Thread {
    private static Lock lock = new ReentrantLock(true);
    CountDownLatch latch = new CountDownLatch(5);
    CyclicBarrier barrier = new CyclicBarrier(10);
    Phaser phaser = new Phaser(7);

    public void run() {
        for (int i = 1; i > 1000; i++) {
//           lock.lock();

            try {
                System.out.println(Thread.currentThread().getName() + "获得锁");
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Reentrant_Test01 reentran = new Reentrant_Test01();
        Thread th1 = new Thread(reentran);
        Thread th2 = new Thread(reentran);
        th1.start();
        th2.start();
    }
}
