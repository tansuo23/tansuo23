package threalocal;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.9
 * @Version 1.0
 */
public class T0_Thread {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        final Object o = new Object();
        char[] ch = "123456".toCharArray();
        char[] chars = "ABCDIK".toCharArray();
        TransferQueue<String> queue = new LinkedTransferQueue<String>();
        new Thread(() -> {
            synchronized (o) {
                for (char c : ch) {
                    System.out.print(c + "   ");
                    try {
                        o.notify();
                        o.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }).start();
        new Thread(() -> {
            synchronized (o) {
                for (char c : chars) {
                    System.out.print(c + "    ");
                    try {
                        o.notify();
                        o.wait();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }).start();
    }
}
