package threalocal;

import java.util.LinkedList;
import java.util.List;

 /**
 * @author: 探索科技：建龙
 * @date 2021.10.2
 * @Version 1.0
 */
public class Volatile01 {

    volatile List list = new LinkedList();


    public void add(Object o) {
        list.add(o);
    }

    public int size() {
        return list.size();
    }

    static Thread t = null, t2 = null; // 成员变量
    public static void main(String[] args) {
        Volatile01 v = new Volatile01();
        new Thread(() -> {
//            System.out.println(v);
            for (int i = 0; i < 10; i++) {
                v.add(new Object()); //
                System.out.println("add  "   +   i);
//                try {
//                    TimeUnit.SECONDS.sleep(2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }, "v1").start();
        new Thread(()->{
            while (true){
                if (v.size()== 5){ //当个数到5是，退出线程
                    break;
                }
            }
            System.out.println(" v2  结束了");
        },"v2").start();

    }
}

