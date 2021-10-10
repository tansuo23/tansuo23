package threalocal;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author: 探索科技：建龙
 * @date 2021.10.4
 * @Version 1.0
 */
public class Jvm_Test {
    // 四种引用 强 软
    public static void main(String[] args) throws Exception {
        SoftReference<Integer> softReference = new SoftReference<Integer>(new Integer(1023 * 1023 * 34));
        WeakReference<String> s = new WeakReference<String>(new String());
        System.out.println(s.get());
        System.gc();
        System.out.println(s.get());
        ThreadLocal<String> local = new ThreadLocal<>();
        local.set(new String());
//        local.remove();
    }
}
