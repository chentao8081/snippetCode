import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chentao on 08/06/2017.
 */
public class ContainsSamePairSymbolsTest {
    public static void main(String[] args) {
//        String str1 = "您企业{{企业名称}}}}未能成功开通蜂巢平安交易通";
//        String str2 = "您企业{{企业名称}}}}}}未能成功开通蜂巢平安交易通";
//        System.out.println("containsSamePairSymbols: " + containsSamePairSymbols(str1, str2, "{{"));
//        System.out.println("containsSamePairSymbols: " + containsSamePairSymbols(str1, str2, "}}"));
        System.out.println("isMsgTemplatePairSymbolsEven: " + isMsgTemplatePairSymbolsEven("{{", "{"));
        System.out.println("isMsgTemplatePairSymbolsEven: " + isMsgTemplatePairSymbolsEven("{{{", "{"));
    }

    public static Boolean containsSamePairSymbols(String str1, String str2, String symbol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < symbol.length(); ++i) {
            sb.append("\\").append(symbol.charAt(i));
        }
        System.out.println(sb.toString());
        Pattern pattern = Pattern.compile(sb.toString());
        Matcher matcher1 = pattern.matcher(str1);
        Matcher matcher2 = pattern.matcher(str2);

        int count1 = 0;
        while (matcher1.find()) {
            ++count1;
        }
        int count2 = 0;
        while (matcher2.find()) {
            ++count2;
        }

        return count1 == count2;
    }

    public static Boolean isMsgTemplatePairSymbolsEven(String str, String symbol) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < symbol.length(); ++i) {
            sb.append("\\").append(symbol.charAt(i));
        }
        Pattern pattern = Pattern.compile(sb.toString());
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            ++count;
        }

        return count%2 == 0;
    }
}
