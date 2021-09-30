package deomo2;

public class Letter {
    public static void main(String[] args) {
        // 为什么俩个数不一样
        int fu = fu(5);
        System.out.println(fu);
        System.out.println("------------");
        long fn = fn(5);
        System.out.println(fn);
    }

    public static int fu(int mun) {
        int reult = 1;
        if (mun > 1)
            reult = mun * fu(mun - 1);
        return reult;
    }

    public static long fn(int ant) {
        long aur = 0;
        long cur = 1;
        for (int i = 1; i <= ant; i++) {
            cur = cur * i; // 1 * 4 = 4
            aur += cur; // 0 + 4
        }
        return aur;
    }
}
