package arithmetical;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.16
 * @Version 1.0
 */
public class Dmeo01 {
    public static void fu(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 >> i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        fu(1);
    }
}
