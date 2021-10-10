package threalocal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.30
 * @Version 1.0
 */
public class CAS_AtomicInteger {
    static LongAdder adder = new LongAdder();
   static AtomicInteger atomic = new AtomicInteger(67);

     void m() {
        for (int i = 0; i < 100; i++) {
            atomic.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        CAS_AtomicInteger cas = new CAS_AtomicInteger();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            threads.add(new Thread(cas::m, "" + i));
        }
        threads.forEach((o) -> o.start());
        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(cas.atomic);
    }
}
