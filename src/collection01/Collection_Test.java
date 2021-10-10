package collection01;

import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.6
 * @Version 1.0
 */
public class Collection_Test {
    static HashMap<Integer, String> hashMap = new HashMap<>();
    static Vector<String> vector = new Vector<>();


    static {
        for (int i = 0; i < 100; i++) vector.add( "票编号"    + i);
    }

    public static void main(String[] args) {
        hashMap.put(1, "张磊");
        System.out.println(hashMap);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {

                    while (vector.size() > 0) { // size 就加锁了
                        try {
                            TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("销售了" + vector.remove(0)+   Thread.currentThread().getName()+"  ");
                    }

            }).start();
        }
    }
}
