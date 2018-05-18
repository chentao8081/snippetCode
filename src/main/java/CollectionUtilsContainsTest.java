import cn.hutool.core.util.StrUtil;

public class CollectionUtilsContainsTest {
    public static void main(String[] args) {
        String code = "\"respCode\":\"000000\"";
        String result = "{\"resp\":{\"respCode\":\"105112\"}}";
        String result2 = "{\"resp\":{\"respCode\":\"000000\",\"templateSMS\":{\"createDate\":\"20170721110007\",\"smsId\":\"69cbcabd4d9c57d24af987d0eed21da4\"}}}";
        System.out.println(StrUtil.containsIgnoreCase(code, result));
        System.out.println(StrUtil.containsIgnoreCase(result, code));
        System.out.println(StrUtil.containsIgnoreCase(result2, code));
        System.out.println(StrUtil.containsIgnoreCase(code, result));
    }

}
