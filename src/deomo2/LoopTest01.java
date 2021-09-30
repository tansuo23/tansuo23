package deomo2;

/**
 * @author: 探索科技：建龙
 * @date 2021.9.27
 * @Version 1.0
 */
public class LoopTest01 {
    public static void main(String[] args) {

        int row, name;
        for (row = 1; row <= 10; row++) {
            for (name = 1; name <= row; name++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
