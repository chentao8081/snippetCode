package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/3/10.
 */
public class AddressTest {
    public static void main(String[] args) {
//        printStr(null);
        printStr("");
        printStr(" ");
        printStr("  ");
        printStr("1");
        printStr("11");
        printStr("111");
        printStr("1111");
        printStr("11111");
        printStr("a");
        printStr("aa");
        printStr("aaa");
        printStr("aaaa");
        printStr("aaaaa");
        printStr("1a");
        printStr("a1");
        printStr("aa1");
        printStr("aa11");
        printStr("aaa11");
        printStr("番禺广场");
        printStr("番禺广1");
        printStr("番禺广场1");
        printStr("！@#￥");
        printStr("！@#￥%");
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String str) {
        Pattern r = Pattern.compile("^(?![0-9]+$)\\S{0,4}$");
        Matcher m = r.matcher(str);
        return m.find();
    }

}
