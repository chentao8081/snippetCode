package regexp;

import cn.hutool.core.util.StrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DELL on 2017/4/11.
 */
public class RandomPwdTest {
    private final static Logger logger = LoggerFactory.getLogger(RandomPwdTest.class);

    public static void main(String[] args) {
        System.out.println("=============");
        String password = createRandomInitPassword();
        logger.info("Create password: {}", password);
        System.out.println("password: " + password);
    }

    /**
     * 随机成生八位小写字母及数字的密码
     * @return
     */
    public static String createRandomInitPassword() {
        boolean containNum = false;
        boolean containStr = false;

        String codes = "1234567890abcdefghjkmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            char c = codes.charAt(random.nextInt(codes.length()));
            if (!containNum) {
                containNum = isNumber(c);
            }
            if (!containStr) {
                containStr = !isNumber(c);
            }
            sb.append(c);
        }

        if (!containNum || !containStr) {
            sb = new StringBuffer();
            sb.append(createRandomInitPassword());
        }
        return sb.toString();
    }

    public static <T> Boolean isNumber(T number) {
        // 检查是否为数字
        if (Integer.class.isAssignableFrom(number.getClass())) {
            if ((Integer) number > Integer.MAX_VALUE) {
                return false;
            }
        }
        if (String.class.isAssignableFrom(number.getClass())) {
            if (StrUtil.isEmpty((String)number) || ((String)number).length() > 255) {
                return false;
            }
        }
        Pattern r = Pattern.compile("^[0-9]+$");
        Matcher m = r.matcher(number.toString());
        return m.find();
    }
}
