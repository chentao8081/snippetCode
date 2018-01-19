package regexp;

import cn.hutool.core.util.StrUtil;

import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/4/24.
 */
public class PwdTest {
    private static final String regEx = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,15}$";

    public static void main(String[] args) {
        printStr("test1234");
        printStr("MTU5MjAzNzI0NDc6dGVzdDEyMzQ=");
        printStr("test1234test1234");
        printStr("dGVzdDEyMzQ6dGVzdDEyMzR0ZXN0MTIzNA=="); // test1234:test1234test1234
        printStr("dGVzdDEyMzQ6dGVzdDEyMzQ==="); // test1234:test1234
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String value) {
        if (StrUtil.isBlank(value)) {
            return false;
        }
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(value);
        if (!matcher.matches()) {
            try {
                String[] pwd = base64Decoder(value).split(":");
                if (pwd.length != 2) {
                    return false;
                }
                return  pattern.matcher(pwd[1]).matches();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return true;
    }

    private static String base64Decoder(String encodedStr) throws Exception {
        return new String(Base64.getDecoder().decode(encodedStr), "utf-8");
    }
}
