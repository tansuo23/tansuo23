package learn;

import java.util.HashMap;

/**
 * @Author jinglong
 * @Date 2020/12/27 21:23
 * @Version 1.0
 */
public class Temper {
    // hashmap结构：数组+链表+红黑树1.8
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "龙哥");
        map.put(2, "龙兴雨");
        map.put(3, "退哥");
        for (int i = 0; i < 3; i++) {
            System.out.println(map.get(i + 1));
        }
    }
}

