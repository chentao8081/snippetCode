package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/3/10.
 */
public class LicenseCodeTest {
    public static void main(String[] args) {
        printStr("");
        printStr("1");
        printStr("11");
        printStr("111");
        printStr("1111");
        printStr("a");
        printStr("aa");
        printStr("aaa");
        printStr("aaaa");
        printStr("1a");
        printStr("a1");
        printStr("aa1");
        printStr("aa11");
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String str) {
        Pattern r = Pattern.compile("^([a-zA-Z0-9]{2}|[a-zA-Z0-9]{3})$");
        Matcher m = r.matcher(str);
        return m.find();
    }

}
