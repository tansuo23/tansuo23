package sunday;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("hello", "world");
        s.forEach(System.out::println);
        Byte[] arr = {34, 64, 67, 8, 74, 46};
        Stream<Byte> arr1 = Stream.of(arr);
        arr1.forEach(System.out::println);
        System.out.println("-------------");
        Long[] ar = {12l, 34l, 376l};
        Stream<Long> ar1 = Stream.of(ar);
        ar1.forEach(System.out::println);
        System.out.println("===========");
        Double[] d = {3.2, 5.1, 99.9,};
        Stream<Double> stream = Stream.of(d);
        stream.forEach(System.out::println);
        Float[] f = {3.2f,14.6f,67.5f};
        Stream<Float> f1 = Stream.of(f);
        f1.forEach(System.out::println);
        System.out.println("--------------");
        Character[] c= {'c','x'};
        Stream<Character> c1 = Stream.of(c);
        c1.forEach(System.out::println);
        System.out.println("-----------");
        Short[] shorts ={3,5,6,7,8};
        Stream<Short> shorts1 = Stream.of(shorts);
        shorts1.forEach(System.out::println);
        System.out.println("-=-----------");
        Boolean[] booleans = {false,true,};
        Stream<Boolean> booleans1 = Stream.of(booleans);
        booleans1.forEach(System.out::println);
    }
}
