import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodeDecodeTest {
    public static void main(String[] args) {
        String plainStr = "tony test~~";
        String encodedStr = "NDQ1NUBxcS5jb206dGVzdDEyMzQ=";
        String encodedStr2 = "YWRtaW46dGVzdDEyMzQ=";
        System.out.println(base64Encoder(plainStr));
        System.out.println(base64Decoder(encodedStr));
        System.out.println(base64Decoder(encodedStr2));
    }

    /**
     * BASE64编码
     *
     * @param plainStr
     * @return
     */
    public static String base64Encoder(String plainStr) {
        if (null == plainStr) {
            return null;
        }
        return Base64.getEncoder().encodeToString(plainStr.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * BASE64解码
     *
     * @param encodedStr
     * @return
     */
    public static String base64Decoder(String encodedStr){
        if (null == encodedStr) {
            return null;
        }
        return new String(Base64.getDecoder().decode(encodedStr), StandardCharsets.UTF_8 );
    }
}
