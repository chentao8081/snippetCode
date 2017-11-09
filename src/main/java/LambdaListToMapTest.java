import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaListToMapTest {
    public static void main(String[] args) {
        String[] strArr1 = {"11", "1111"};
        String[] strArr2 = {"22", "2222"};
        String[] strArr3 = {"33", "3333"};
        List<String[]> list = new ArrayList<>();
        list.add(strArr1);
        list.add(strArr2);
        list.add(strArr3);

//        public Map<Long, String> getIdNameMap(List<Account> accounts) {
//            return accounts.stream().collect(Collectors.toMap(Account::getId, Account::getUsername));
//        }
//        refer to:
//        http://www.cnblogs.com/xujanus/p/6133865.html
        Map<String, String> mapsss = list.stream().collect(Collectors.toMap(str -> str[0], str -> str[1]));

        System.out.println(list);
        System.out.println(mapsss);
    }
}
