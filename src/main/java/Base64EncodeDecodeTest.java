import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodeDecodeTest {
    public static void main(String[] args) {
        String encodedStr = base64Encoder("tony test~~");
        System.out.println(encodedStr);
        System.out.println(base64Decoder(encodedStr));
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
