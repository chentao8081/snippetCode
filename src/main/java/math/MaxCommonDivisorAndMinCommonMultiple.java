package math;

import java.util.Scanner;

/**
 * @author taochen
 * @date 2018/05/08
 *
 * 求最大公约数和最小公倍数
 *
 * https://blog.csdn.net/lwcumt/article/details/8029241
 **/
public class MaxCommonDivisorAndMinCommonMultiple {
    public static void main(String[] args) {
        // 接收控制台输入的信息
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        // 取出控制台输入的信息
        int num1 = scan.nextInt();

        System.out.print("请输入第二个整数：");
        // 取出控制台输入的信息
        int num2 = scan.nextInt();

        // 调用maxCommonDivisor()方法
        System.out.println("最大公约数：" + maxCommonDivisor(num1, num2));
        // 调用minCommonMultiple()方法
        System.out.println("最小公倍数：" + minCommonMultiple(num1, num2));
    }

    /**
     * 递归法求最大公约数
     *
     * @param m
     * @param n
     * @return
     */
    public static int maxCommonDivisor(int m, int n) {
        if (m < n) {
            // 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {
            // 若余数为0,返回最大公约数
            return n;
        } else {
            // 否则,进行递归,把n赋给m,把余数赋给n
            return maxCommonDivisor(n, m % n);
        }
    }

    /**
     * 循环法求最大公约数
     *
     * @param m
     * @param n
     * @return
     */
    public static int maxCommonDivisor2(int m, int n) {

        if (m < n) {
            // 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        while (m % n != 0) {
            // 在余数不能为0时,进行循环
            int temp = m % n;
            m = n;
            n = temp;
        }
        // 返回最大公约数
        return n;
    }

    /**
     * 求最小公倍数
     *
     * @param m
     * @param n
     * @return
     */
    public static int minCommonMultiple(int m, int n) {
        return m * n / maxCommonDivisor(m, n);
    }
}
