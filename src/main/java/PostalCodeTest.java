import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/4/5.
 */
public class PostalCodeTest {
    public static void main(String[] args) {
        printStr("");
        printStr("1");
        printStr("d");
        printStr("123456");
        printStr("1234567");
        printStr("12345d");
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String str) {
        Pattern r = Pattern.compile("^[\\d]{6}$");
        Matcher m = r.matcher(str);
        return m.find();
    }
}
