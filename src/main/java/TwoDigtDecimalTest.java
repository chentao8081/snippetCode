import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class TwoDigtDecimalTest {
    public static void main(String[] args) {
        System.out.println("=============");
        System.out.println(genEntpFund1());
    }


    public static BigDecimal genEntpFund() {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        double amount;
        while (true) {
            amount = random.nextInt(100);
            if (0 < amount && amount < 100) {
                amount = amount / 100;
                break;
            }
        }

        return new BigDecimal(amount);
    }

    public static BigDecimal genEntpFund1() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        double doubleAmount;
        while (true) {
            doubleAmount = Math.random();
            if (0 < doubleAmount && doubleAmount < 1) {
                break;
            }
        }
        String strAmount = decimalFormat.format(doubleAmount);

        return new BigDecimal(strAmount);
    }
}
