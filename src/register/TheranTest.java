package register;

import java.io.IOException;

public class TheranTest {

    private int num = 8;

    public TheranTest() {
        new Thread(() -> System.out.println(this.num)).start();
    }


    public static void main(String[] args) throws IOException {
        new TheranTest();
        System.in.read();
    }
}
