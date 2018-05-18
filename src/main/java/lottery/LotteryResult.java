package lottery;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Week;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author taochen
 * @date 2018/05/07
 *
 * 红色球 （1-33 不能重复出6个数）  蓝色球(1-16 出一个数)
 *
 * 结果模式：01,05,23,28,29,33-05
 *
 * https://blog.csdn.net/ml1990s/article/details/11581845
 **/
public class LotteryResult {
    private static final int DECIMAL_SYSTEM_6 = 6;
    private static final int DECIMAL_SYSTEM_10 = 10;
    private static final int RED_BALLS_TOTAL_SIZE = 33;
    private static final int BLUE_BALLS_TOTAL_SIZE = 16;

    public static String getFinallyResult() {
        return getResult();
    }

    /**
     * 拼接字符串，返回固定格式的开奖结果
     *
     * @return
     */
    private static String getResult() {
        TreeSet<Integer> set = getRedBalls();
        String blue = getBlueBalls();
        Iterator<Integer> it = set.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            int temp = it.next();
            // 把1,2,3...等转为01,02,03...
            if (temp < DECIMAL_SYSTEM_10) {
                sb.append("0" + temp + "，");
            } else {
                sb.append(temp + "，");
            }
        }
        String result = sb.toString().substring(0, sb.toString().lastIndexOf("，"));
        result = result + " - " + blue;
        return result;
    }

    /**
     * 利用TreeSet装入红色球选出的值（1.值不重复    2.利用默认比较器或自定义比较器可以实现排序）
     *
     * @return
     */
    private static TreeSet<Integer> getRedBalls() {
        TreeSet<Integer> set = new TreeSet<>(Integer::compareTo);
        Random random = new Random();
        //保证只取6个不重复的值
        while (set.size() < DECIMAL_SYSTEM_6) {
            //nextInt(int n) 方法：随机产生0~n（包括0，不包括n）之间的int值
            set.add(random.nextInt(RED_BALLS_TOTAL_SIZE) + 1);
        }
        return set;
    }

    /**
     * 获取特殊号码值
     *
     * @return
     */
    private static String getBlueBalls() {
        Random ran = new Random();
        int blue = ran.nextInt(BLUE_BALLS_TOTAL_SIZE) + 1;
        StringBuilder sb = new StringBuilder();
        if (blue < DECIMAL_SYSTEM_10) {
            sb.append("0" + blue);
        } else {
            sb.append(blue);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(DateUtil.thisDayOfWeek());
//        System.out.println(DateUtil.dayOfWeekEnum(DateUtil.date()));

        Week week = DateUtil.dayOfWeekEnum(DateUtil.date());
        StringBuilder sb = new StringBuilder();
        sb.append("今天是").append(LocalDate.now()).append("，").append(week.toChinese()).append("，");
        switch (week) {
            case TUESDAY:
            case THURSDAY:
            case SUNDAY:
                sb.append("今天");
                break;
            case MONDAY:
            case WEDNESDAY:
            case SATURDAY:
                sb.append("明天");
                break;
            default:
                sb.append("后天");
                break;
        }
        sb.append("开奖，祝你好运！\n");
        System.out.println(sb.toString());

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入想要购买的注数（等于或者小于 5 注）：");
        int num = 1;
        try {
            num = scan.nextInt();
            if (num < 1) {
                System.out.println("最小购买 1 注，即将生成 1 注特选号码～\n");
                num = 1;
            }
            if (num > 5) {
                System.out.println("最大购买 5 注，即将生成 5 注特选号码～\n");
                num = 5;
            }
        } catch (Exception e) {
            System.out.println("输入不合法～即将退出～");
            System.exit(0);
        }

        for(int index = 0; index < num; ++index) {
            System.out.println("第 " + ( index + 1 ) + " 注特选号码： " + getFinallyResult());
        }

//        if (Week.TUESDAY.equals(week)
//                || Week.THURSDAY.equals(week)
//                || Week.SUNDAY.equals(week)) {
//            System.out.println("今天开奖，试试" + LocalDate.now() + "的幸运号码，祝你好运：" + getFinallyResult());
//        } else {
//            if (Week.MONDAY.equals(week)
//                    || Week.WEDNESDAY.equals(week)
//                    || Week.SATURDAY.equals(week)) {
//                System.out.println("明天开奖，试试" + LocalDate.now() + "的幸运号码，祝你好运：" + getFinallyResult());
//            } else  {
//                System.out.println("后天开奖，试试" + LocalDate.now() + "的幸运号码，祝你好运：" + getFinallyResult());
//            }
//        }

//        System.out.println(getFinallyResult());
//        List<Integer> redBalls = new ArrayList<>();
//        List<Integer> blueBalls = new ArrayList<>();
//        List<Integer> luckyNumbers = new ArrayList<>();
//
//        for(int i = 1; i < 34; ++i) {
//            redBalls.add(i);
//        }
//        for(int i = 1; i < 17; ++i) {
//            blueBalls.add(i);
//        }
//
//        // pick balls
//        // range of Math.random(): [0,100)
//        while (luckyNumbers.size() < 6) {
//            int i = (int) Math.ceil(Math.random() * redBalls.size());
//            luckyNumbers.add(i);
//            luckyNumbers.sort(Integer::compareTo);
//            redBalls.remove(new Integer(i));
//        }
//        System.out.println(luckyNumbers);
//
//        int i = (int) Math.ceil(Math.random() * blueBalls.size());
//        System.out.println(i);
//        luckyNumbers.add(i);
//        System.out.println(luckyNumbers);


    }
}
