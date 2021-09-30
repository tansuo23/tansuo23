package arithmetical;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.16
 * @Version 1.0
 */
public class Dmeo02 {
    public static long fu(int num) {
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= num ; i++) {
             cur =  cur * i;
              ans += cur;

        }
        return ans;
    }

    public static void main(String[] args) {
//        long a = fu(5);
//        System.out.println(a);
       int num = 10;
        System.out.println(fu(num));
    }
}
