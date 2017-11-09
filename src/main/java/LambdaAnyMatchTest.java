import java.util.ArrayList;
import java.util.List;

public class LambdaAnyMatchTest {
    public static void main(String[] args) {
        List<String> aaa = new ArrayList<String>();
        aaa.add("aaa");
        aaa.add("bbb");
        aaa.add("ccc");
        aaa.add("ddd");

        System.out.println(aaa.stream().anyMatch(str -> "aaa".equals(str)));
        System.out.println(aaa.stream().anyMatch(str -> "eee".equals(str)));
    }
}
