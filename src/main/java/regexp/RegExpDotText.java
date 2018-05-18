package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDotText {
    public static void main(String[] args) {
        printStr("");
        printStr("@");
        printStr("@@@");
        printStr("123@123.com");
        printStr("我@我.");
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String str) {
        Pattern r = Pattern.compile("^(?=.*@)(?=.*\\.).{3,60}$");
        Matcher m = r.matcher(str);
        return m.find();
    }
}
