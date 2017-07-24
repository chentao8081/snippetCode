import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/4/5.
 */
public class IdMatchTest {
    public static void main(String[] args) {
        printStr("");
        printStr("12345d");
        printStr("123456789112345678");
        printStr("440923199003084614");
        printStr("44092319900308461s");
        printStr("44092319900308461x");
        printStr("xxxxxxxxxxxxxxxxxx");
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String str) {
        Pattern r = Pattern.compile("^\\d{17}[\\d|x|X]{1}$");
        Matcher m = r.matcher(str);
        return m.find();
    }
}
