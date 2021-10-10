package threalocal;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.2
 * @Version 1.0
 */
public class LockSupport_Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {

            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                if(i == 2){
                    Thread.yield();
                   LockSupport.park();
                }
                if(i == 10){
                    LockSupport.park();
                }

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        LockSupport.unpark(t);
    }
}
