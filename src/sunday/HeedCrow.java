package sunday;

import jdk.internal.instrumentation.InstrumentationMethod;

import java.util.HashSet;
import java.util.stream.Stream;

public class HeedCrow {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("龙龙");
            }
        };
        runnable.run();
        Runnable runnable1 = ()-> System.out.println("腾家龙");
        runnable1.run();
    }

}
