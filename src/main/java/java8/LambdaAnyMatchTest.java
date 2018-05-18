package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaAnyMatchTest {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test1() {
        List<String> aaa = new ArrayList<String>();
        aaa.add("aaa");
        aaa.add("bbb");
        aaa.add("ccc");
        aaa.add("ddd");

        System.out.println(aaa.stream().anyMatch(str -> "aaa".equals(str)));
        System.out.println(aaa.stream().anyMatch(str -> "eee".equals(str)));
    }

    private static void test2() {
        List<String> aaa = new ArrayList<String>();

        aaa.add("12345");
        aaa.add("123456");
        aaa.add("1234567");
        aaa.add("12345678");
        aaa.add("123456789");
        aaa.add("1234567890");
        aaa.add("12345678901");

        System.out.println(aaa.stream().anyMatch(str -> str.length() > 10));
    }
}
