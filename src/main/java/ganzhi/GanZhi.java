package ganzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author taochen
 * @date 2018/05/08
 **/
public class GanZhi {
    private final static String[][] TIAN_GAN_DI_ZHI = new String[][]{
            // 10天干
            {"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"},
            //12地支
            {"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"}};

    // 12生肖，（注：12生肖对应12地支，即子鼠，丑牛，寅虎，卯兔，辰龙，巳蛇，午马，未羊，申猴，酉鸡，戌狗，亥猪）
    private final static String[] animalYear = new String[]{"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};

    private static final List<String> GanZhi = init();

    private static List<String> init() {
        List<String> GanZhi = new ArrayList<>();
        int index = 0;
        while (true) {
            StringBuilder sb = new StringBuilder();
//            System.out.println("index: " + index);
            String temp = sb.append(TIAN_GAN_DI_ZHI[0][index%10]).append(TIAN_GAN_DI_ZHI[1][index%12]).toString();
            if (GanZhi.contains(temp)) {
                break;
            }
//            System.out.println("temp: " + temp);
            GanZhi.add(temp);
            ++index;
        }
        return GanZhi;
    }

    private static String calculateGanZhi(int year) {
        int tempYear = handleYear(year);
        if (year > 0) {
            // 数组下标由0开始，需要减1
            // 公元元年，即1年
            return TIAN_GAN_DI_ZHI[0][tempYear % 10 - 1] + TIAN_GAN_DI_ZHI[1][tempYear % 12 - 1];
        } else {
            // 公元前1年
            return TIAN_GAN_DI_ZHI[0][tempYear % 10] + TIAN_GAN_DI_ZHI[1][tempYear % 12];
        }
    }

    private static String calculateAnimal(int year) {
        int tempYear = handleYear(year);
        if (year > 0) {
            // 数组下标由0开始，需要减1
            // 公元元年，即1年
            return animalYear[tempYear % 12 - 1];
        } else {
            // 公元前1年
            return animalYear[tempYear % 12];
        }
    }

    private static int handleYear(int year) {
        int temp;
        if (year > 0) {
            temp = year - 3;
            if (temp < 0) {
                temp += 60;
            }
            // 数组下标由0开始，需要减1
            // 公元元年，即1年
            return temp;
        } else {
            temp = -year + 3;
            // 公元前1年
            return temp;
        }
    }

    public static void main(String[] args) {
        // 接收控制台输入的信息
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入年份（正整数表示公元后，负整数表示公元前，如：2018表示公元2018年，-2018表示公元前2018年）：");
        // 取出控制台输入的信息
        int year = scan.nextInt();
        System.out.println(calculateGanZhi(year));
        System.out.println(calculateAnimal(year));

//        System.out.println(GanZhi);
//        List<String> ddd = new ArrayList<>();
//        for (int i = 0; i < 12; ++i) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(DI_ZHI.get(i)).append(animalYear[i]);
//            ddd.add(sb.toString());
//        }
//        System.out.println(ddd);
//        System.out.println(ddd.stream().map(dd -> String.valueOf(dd)).collect(Collectors.joining("，")));
    }
}
