package threalocal;

import java.util.concurrent.TimeUnit;

/**
 * @author: 探索科技：建龙
 * @date 2021.8.30
 * @Version 1.0
 */
public class Th_01TransferQueue {
    volatile static Pesion p = new Pesion();
//    static ThreadLocal<Pesion> local= new ThreadLocal<>();
    public static void main(String[] args) {
        // nio核心组件 channel和 buffer selectionkey
//        ServerSocketChannel channel = ServerSocketChannel.open();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(p.name);
        }).start();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p.name = "lisi";
        }).start();
    }
}
class Pesion {
    String name = "longge"; //
}
