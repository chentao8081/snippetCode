package hutool;

import cn.hutool.core.convert.Convert;

/**
 * @author chentao
 * @date 2018/01/19
 **/
public class StrToUnicodeTest {
    public static void main(String[] args) {
        String a = "我是一个小小的可爱的字符串";

        String unicode = Convert.strToUnicode(a);
        System.out.println(unicode);
//        Assert.assertEquals("\\u6211\\u662f\\u4e00\\u4e2a\\u5c0f\\u5c0f\\u7684\\u53ef\\u7231\\u7684\\u5b57\\u7b26\\u4e32", unicode);

        String raw = Convert.unicodeToStr(unicode);
//        Assert.assertEquals(raw, a);
        System.out.println(raw);
    }
}
