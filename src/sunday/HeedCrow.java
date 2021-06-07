package sunday;

import jdk.internal.instrumentation.InstrumentationMethod;

import java.util.HashSet;
import java.util.stream.Stream;

public class HeedCrow {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("learing");
            }
        };
        runnable.run();
        Runnable runnable1 = ()-> System.out.println("岭南");
        runnable1.run();
    }

}
