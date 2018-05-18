package java8;

import java.util.ArrayList;
import java.util.List;

public class StringCompareToTest {
    public static void main(String[] args) {
        String aaa = "aaa";
        String bbb = "aaaa";
        String ccc = "aaaaa";
        System.out.println(aaa.compareTo(bbb));

        List<String> list = new ArrayList<>();
        list.add(aaa);
        list.add(bbb);
        list.add(ccc);
        list.sort((str1, str2) -> str1.compareTo(str2));
        System.out.println(list);
    }
}
