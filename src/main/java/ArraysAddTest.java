import java.util.Arrays;
import java.util.List;

/**
 * @author taochen
 * @date 2018/05/08
 **/
public class ArraysAddTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bbb");
        System.out.println(list);

        list.add("ccc");
        System.out.println(list);
    }
}
