import java.util.Arrays;

public class CountDoubleLeftBraceTest {
    public static void main(String[] args) {
        String str = "【蜂巢里】您正在进行资金操作，资金安全验证码{{验证码}}，请您本人在{{有效时间}}内完成验证。" +
                "工作人员不会向您索取该验证码，请勿告知他人。如非本人操作，请立即致电400-990-1619。";
        String str2 = "感谢您注册成为蜂巢里用户，您已成功加入企业{{企业名}}。";
        String str3 = "{{企业名}}感谢您注册成为蜂巢里用户，您已成功加入企业。";
        String str4 = "感谢您注册成为蜂巢里用户，您已成功加入企业。{{企业名}}";

//        Pattern pattern = Pattern.compile("\\{\\{");
//        Matcher matcher1 = pattern.matcher(str);
//        int count1 = 0;
//        while (matcher1.find()) {
//            ++count1;
//        }
//        System.out.println(count1);

        count(str);
        count(str2);
        count(str3);
        count(str4);
    }

    private static void count(String str) {
        String [] ary = str.split("\\{\\{");
//        Arrays.stream(ary).forEach(array -> System.out.println(array));
        System.out.println(ary.length-1);
    }
}
