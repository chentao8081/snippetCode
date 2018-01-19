package java8;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaListToMapTest {
    public static void main(String[] args) {
//        String[] strArr1 = {"11", "1111"};
//        String[] strArr2 = {"22", "2222"};
//        String[] strArr3 = {"33", "3333"};
//        List<String[]> list = new ArrayList<>();
//        list.add(strArr1);
//        list.add(strArr2);
//        list.add(strArr3);

//        public Map<Long, String> getIdNameMap(List<Account> accounts) {
//            return accounts.stream().collect(Collectors.toMap(Account::getId, Account::getUsername));
//        }
//        refer to:
//        http://www.cnblogs.com/xujanus/p/6133865.html
//        Map<String, String> mapsss = list.stream().collect(Collectors.toMap(str -> str[0], str -> str[1]));
//
//        System.out.println(list);
//        System.out.println(mapsss);

        List<String> dataList = new ArrayList<>();
        dataList.add("aaa");
        dataList.add("bbb");
        String paramStr = dataList.stream().map(data -> String.valueOf(data)).collect(Collectors.
                joining("√"));
        System.out.println("paramStr: " + paramStr);


        List<UserRole> roles = new ArrayList<>();
        UserRole role1 = new UserRole();
        role1.setRoleName("admin");
        UserRole role2 = new UserRole();
        role2.setRoleName("manager");
        UserRole role3 = new UserRole();
        role3.setRoleName("sales_operator");
        roles.add(role1);
        roles.add(role2);
        roles.add(role3);

        List<String> names = roles.stream().map(userRole -> userRole.getRoleName()).collect(Collectors.toList());
        if (names.contains("admin")) {
            System.out.println("admin");
        } else {
            System.out.println("not admin");
        }
    }
}

@Data
class UserRole {
    String roleName;
}
