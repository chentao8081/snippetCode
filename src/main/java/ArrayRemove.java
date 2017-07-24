import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/3/10.
 */
public class ArrayRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1111111111111111111");
        list.add("2222222222222222222");
        list.add("3333333333333333333");
        list.add("other");

        System.out.println(list);

        if (list.contains("other")) {
            list.remove("other");
        }
        System.out.println("======================");
        System.out.println(list);
    }
}
