package demo1;

import java.nio.IntBuffer;

/**
 * @Author Miracle Luna
 * @Date 2020/12/5 20:00
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        IntBuffer intBuffer = IntBuffer.allocate(30);
        for (int i = 0; i < intBuffer.capacity(); ++i) {
            int j = 2 * (i + 1);
            // 缓冲区重要属性： position limit capacity
            intBuffer.put(j); // put:数据写入缓冲区
        }
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            int j = intBuffer.get(); // get:数据写入缓冲区
            System.out.print(j + "   ");
        }
    }
}
