package sunday;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(2, 4, 6, 7, 8, 7, 5);
        integerStream.forEach(System.out::println);
//        Stream<Integer> generate = Stream.generate(()-> 2);
//        generate.forEach(System.out::println);
        System.out.println("------------分割线----------");
        Stream<Integer> iterate = Stream.iterate(5, e -> e + 5);
        iterate.limit(5).forEach(System.out::println);
        String str = "entaongg";
        IntStream chars = str.chars();
        chars.forEach(System.out::println);
        char c = str.charAt(3);
        System.out.println(c);


    }
}
