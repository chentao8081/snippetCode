import com.xiaoleilu.hutool.util.ReUtil;

/**
 * Created by DELL on 2017/3/28.
 */
public class StringReplaceTest {
    public static void main(String[] args) {
        String subject = "您企业收到的来自于 {0} 采购 {{1}} 的联合采购邀约（{{2}}）。请查看并回复该意向单。";
        String searchStr = "\\{0\\}";
        String replacement = "woooooooooo";

        System.out.println(subject);
        System.out.println("===========");
        String a = ReUtil.replaceAll(subject, searchStr, replacement);
        System.out.println(subject);
        System.out.println(a);
    }
}
