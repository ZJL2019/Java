import javax.swing.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

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
        /*int num = 1;
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
        System.out.println("sum = " + sum);*/


        //do while
       /* int num=1;
        do{
            System.out.println(num);
            num++;
        }while (num<=10);*/

        //输入输出
        /*String msg="nihao";
        System.out.println(msg);//输出一个字符串，带换行
        System.out.print(msg);//输出一个字符串，不带换行
        System.out.printf("%s",msg);//格式化输出*/

        //从键盘输入
        //直接使用 System.in.read 可以读入一个字符. 但是需要搭配异常处理

        /*try {
            System.out.print("Enter a Char:");
            char i = (char) System.in.read();
            System.out.println("your char is :" + i);
        } catch (IOException e) {
            System.out.println("exception");
        }*/

        //使用Scanner读取字符串/整数/浮点数
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "工资：" + salary);
        sc.close();*/

        //使用Scanner循环读取N个数字
        /*Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int num = 0;
        while (sc.hasNextDouble()) {
            double tmp = sc.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / num);
        sc.close();*/

        //猜数字游戏
        Random random = new Random();//默认随机种子是系统时间
        Scanner sc = new Scanner(System.in);
        int toGuess = random.nextInt(100);
        while (true) {
            System.out.println("请输入要输入的数字：(1-100)");
            int num = sc.nextInt();
            if (num < toGuess) {
                System.out.println("低了");
            } else if (num > toGuess) {
                System.out.println("高了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
        sc.close();
    }
}
