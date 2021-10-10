package collection01;

import java.util.PriorityQueue;
import java.util.concurrent.LinkedTransferQueue;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.8
 * @Version 1.0
 */
public class Priority_Demo01 {
    public static void main(String[] args) {

        PriorityQueue p = new PriorityQueue();
        LinkedTransferQueue<String> transferQueue = new LinkedTransferQueue<>();
        transferQueue.add("j");
        p.add("e");
        p.add("l");
        p.add("a");
        p.add("m");
        p.add("h");
        for (int i = 0; i < 10; i++) {
            System.out.print(p.poll() + "   ");
        }
        System.out.println(transferQueue);
    }
}
