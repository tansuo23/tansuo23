package sunday.demo1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.stream.Stream;

/**
 * @Author jinglong
 * @Date 2020/12/5 20:02
 * @Version 1.0
 */
public class TeartKeep {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // stream类的使用 generate无限
        Stream<Integer> generate = Stream.generate(() -> 2);
        generate.limit(40).forEach(System.out::println);
        System.out.println("--------------");
        Stream<Integer> gt = Stream.iterate(1, e -> e + 5);
        gt.limit(50).forEach(System.out::println);

    }
}
