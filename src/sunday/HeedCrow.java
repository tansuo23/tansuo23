package sunday;

public class HeedCrow {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("能力");
            }
        };
        runnable.run();
        Runnable runnable1 = ()-> System.out.println("简易");
        runnable1.run();
    }

}
