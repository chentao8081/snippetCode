import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/3/10.
 */
public class MediaUrlValidatorTest {
    private static final String regEx = "(http(s)?:)?//(?i)\\b((?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+" +
            "(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:\\'\".,<>?«»“”‘’]))";

    public static void main(String[] args) {
//        printStr("http://www.zuidaima.com/sdfsdf.htm?aaaa=%ee%sss ?sdfsyyy空格结束.jpg");
//        printStr("https://www.zuidaima.com/sdfsdf.htm?aaaa=%ee%sss ?sdfsyyy空格结束.jpg");
//        printStr("http:www.zuidaima.com/sdfsdf.htm?aaaa=%ee%sss ?sdfsyyy空格结束.pdf");
//        printStr("https:www.zuidaima.com/sdfsdf.htm?aaaa=%ee%sss ?sdfsyyy空格结束.pdf");
//        printStr("htp");
//        printStr("http:");
//        printStr("http:ww.jpg");
//        printStr("http://.");
//        printStr("http://.jpg");
//        printStr("http://www.fengcol.ddd303575222-e93kdk.jpg");
//        printStr("undefinehttp:ww");
//        printStr("http://fengchaoli-platform-dev.img-cn-shenzhen.aliyuncs.com/20170120202112aY1MVxVW.jpeg");
//        printStr("");
//        printStr("underfined");
//        printStr("http:www.fengchao.xxx.s/dddl/123.jpg");
        printStr("null");
        printStr("null//fengchaoli-platform-dev.oss-cn-shenzhen.fengchaoli.com/20170509172221JEb16AvS.png");
        printStr("//fengchaoli-platform-dev.oss-cn-shenzhen.fengchaoli.com/20170509172221JEb16AvS.png");
        printStr("http://fengchaoli-platform-dev.oss-cn-shenzhen.fengchaoli.com/20170509103005KcfJffw7.png");
        printStr("https://fengchaoli-platform-dev.oss-cn-shenzhen.fengchaoli.com/20170509103005KcfJffw7.png");
    }

    private static void printStr(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(" ").append("----> ").append(patternMatch(str));
        System.out.println(sb.toString());
    }

    private static boolean patternMatch(String str) {
//        Pattern r = Pattern.compile("^[http://|ftp://|https://]\\s*");
//        Pattern r = Pattern.compile("((http|https)://)([a-zA-Z0-9\\._-]+\\.)");
//        Pattern r = Pattern.compile("(http:|https:|http://|https://)(([a-zA-Z0-9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,4})*(/[a-zA-Z0-9\\&%_\\./-~-]*)?");
//        Pattern r = Pattern.compile("(?i)\\b((?:[a-z][\\w-]+:(?:/{1,3}|[a-z0-9%])|www\\d{0,3}[.]|[a-z0-9.\\-]+[.][a-z]{2,4}/)(?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:\\'\".,<>?«»“”‘’]))");
//        Pattern r = Pattern.compile("^[http:|https:|http://|https://]\\S+$");
        Pattern r = Pattern.compile(regEx);
        Matcher m = r.matcher(str);
        return m.matches();
    }

}
