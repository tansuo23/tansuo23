package threalocal;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Phaser;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.1
 * @Version 1.0
 */
public class PhaserTest extends Phaser {
//    static ReentrantReadWriteLock writeLock = new ReentrantReadWriteLock();
//    static Lock readlock = writeLock.readLock();
//    static Lock writelock = writeLock.writeLock();
    static ReadWriteLock writeLock = new ReentrantReadWriteLock();
    static Semaphore semaphore = new Semaphore(5, true); // 信号灯 默认是不安全的
    static Exchanger<String> exchanger = new Exchanger<>(); // 交换器

    public static void main(String[] args) {
        new Thread(() -> {
            String s = "T";
            try {
                s = exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "是：  " + s);
        }, "teng1").start();
        new Thread(() -> {
            String str = "T2";
            try {
                exchanger.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "是： " + str);

        }, "teng2").start();
    }
}
