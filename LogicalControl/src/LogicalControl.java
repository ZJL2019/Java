/**
 * @Author : Jaler
 * @Date : 2020/10/28 11:30
 * @describe : Java逻辑控制语法学习
 * @Version : 1.0
 */

public class LogicalControl {
    public static void main(String[] args) {
        //1.Java中的逻辑控制语句
        //2.Java中的输出方式

        //1.顺序结构
        /*System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");*/

        //2.分支结构
        //2.1 if else
        /*int num = 10;
        if (num % 2 == 0) {
            System.out.println("num是偶数");
        } else {
            System.out.println("num是奇数");
        }*/

        /*int num = 10;
        if (num > 0) {
            System.out.println("num是正数");
        } else if (num < 0) {
            System.out.println("num是负数");
        } else {
            System.out.println("num是奇数");
        }*/

        //判断闰年
        /*int year = 2000;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }*/

        //2.2 switch
        /*int day = 1;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }*/

        //3.循环结构
        //3.1 while

        //打印1-10的数字
        /*int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }*/

        //打印1-100的和
        /*int n = 1;
        int result = 0;
        while (n <= 100) {
            result += n;
            n++;
        }
        System.out.println(result);*/

        //计算5的阶乘
        /*int n = 1;
        int result = 1;
        while (n <= 5) {
            result *= n;
            n++;
        }
        System.out.println(result);*/

        //计算 1！+2！+3！+4！+5!
        int num = 1;
        int sum = 0;
        while (num <= 5) {
            int factorResult = 1;
            int tmp = 1;
            while (tmp <= num) {
                factorResult *= tmp;
                tmp++;
            }
            sum += factorResult;
            num++;
        }
        System.out.println("sum = " + sum);
    }
}
