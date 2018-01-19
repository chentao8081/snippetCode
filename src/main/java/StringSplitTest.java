
import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by DELL on 2017/3/27.
 */
public class StringSplitTest {
    public static void main(String[] args) {
//        String entpRoles = ",111111111111,,222222222, , 33333333333333";
//        String str = "你已成功绑定蜂巢里帐号,{{帐号}},你可以在微信上接受蜂巢里的通知,如需解绑，请在网页上进行操作 如需解绑1，请在网页上进行操作1";
        String str = ",收到新意向单,你企业收到了新的意向单,交易对象：{{采购企业名称}} 交易货品：{{联采货品名称}} 订单编号：{{订单编号}} 请在电脑上查看并回复该意向单。";
        String[] strArr = StrUtil.split(str, ",");
        System.out.println("length: " + strArr.length);
        List<String> strs = new ArrayList<String>();
        for (String string : strArr) {
            System.out.println("string: " + string);
        }
//        for (String str1 : strArr) {
//            if (org.apache.commons.lang3.StringUtils.isNotBlank(str1)) {
//                if (existRole(str1)) {
//                    strs.add(str1);
//                }
//            }
//        }
//        System.out.println(strs);
    }

    private static boolean existRole(String roleId) {
        Collection<String> roleIds = new ArrayList<String>();
        roleIds.add("111111111111");
        roleIds.add("222222222");
        return roleIds.contains(roleId);
    }
}
