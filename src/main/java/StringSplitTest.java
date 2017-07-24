import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by DELL on 2017/3/27.
 */
public class StringSplitTest {
    public static void main(String[] args) {
        String entpRoles = ",111111111111,,222222222, , 33333333333333";
        String[] roleIdArr = StringUtils.split(entpRoles, ",");
        List<String> roleIds = new ArrayList<String>();
        for (String role : roleIdArr) {
            System.out.println(role);
        }
        for (String roleId : roleIdArr) {
            if (org.apache.commons.lang3.StringUtils.isNotBlank(roleId)) {
                if (existRole(roleId)) {
                    roleIds.add(roleId);
                }
            }
        }
        System.out.println(roleIds);
    }

    private static boolean existRole(String roleId) {
        Collection<String> roleIds = new ArrayList<String>();
        roleIds.add("111111111111");
        roleIds.add("222222222");
        return roleIds.contains(roleId);
    }
}
