import org.apache.commons.lang3.StringUtils;

public class CollectionUtilsContainsTest {
    public static void main(String[] args) {
        String code = "\"respCode\":\"000000\"";
        String result = "{\"resp\":{\"respCode\":\"105112\"}}";
        String result2 = "{\"resp\":{\"respCode\":\"000000\",\"templateSMS\":{\"createDate\":\"20170721110007\",\"smsId\":\"69cbcabd4d9c57d24af987d0eed21da4\"}}}";
        System.out.println(StringUtils.contains(code, result));
        System.out.println(StringUtils.contains(result, code));
        System.out.println(StringUtils.contains(result2, code));
        System.out.println(StringUtils.containsAny(code, result));
    }

}
