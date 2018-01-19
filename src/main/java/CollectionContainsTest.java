import cn.hutool.core.collection.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/5/10.
 */
public class CollectionContainsTest {
    public static void main(String[] args) {
        List<String> roleList = new ArrayList<String>();
        roleList.add("111");
        roleList.add("222");
        roleList.add("333");

        List<String> mRoleList = new ArrayList<String>();
        mRoleList.add("111");

        System.out.println(CollectionUtil.containsAny(roleList, mRoleList));
    }
}
