package bigtest;

import java.math.BigDecimal;

public class Demt {
    public static void main(String[] args) {
        // BigDecimal用法
        BigDecimal decimal = new BigDecimal(5.5545411);
        BigDecimal db = BigDecimal.ZERO; // 0
        BigDecimal db2 = BigDecimal.TEN; // 10
        int ruelt = BigDecimal.ROUND_UNNECESSARY; // 7
        BigDecimal one = BigDecimal.ONE; // 1
        BigDecimal bd8 = BigDecimal.valueOf(2, 3);
        System.out.println("-----" + bd8);
        BigDecimal db3 = decimal.setScale(5, 3);
        System.out.println("big是：" + ruelt);
        System.out.println("big是：" + one);
    }
}
