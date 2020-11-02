import javax.sound.midi.SoundbankResource;

/**
 * @Author : Jaler
 * @Date : 2020/11/2 19:59
 * @describe :
 * @Version : 1.0
 */
public class UseOfMethods {
    public static void main(String[] args) {
        //什么是方法(method)？类似C/C++中的函数

        //两个整数相加
        /*int a = 10;
        int b = 20;
        System.out.println("第一次调用方法之前");
        int ret = add(a, b);
        System.out.println("第一次调用方法之后");
        System.out.println("ret = " + ret);

        System.out.println("第二次调用方法之前");
        ret = add(30, 40);
        System.out.println("第二次调用方法之后");
        System.out.println("ret = " + ret);*/


        //计算1！+2！+3！+4！+5！
        /*int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += factor(i);
        }
        System.out.println("sum = " + sum);*/

        //实参和形参的关系
        //交换变量
        /*int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("使用swap方法");
        System.out.println("a = " + a + " b = " + b);
        int arr[]={10,20};
        //java将数组设置为引用类型，这样在传参时只用传递数组的首地址
        swap2(arr);
        System.out.println("arr[0] = " + arr[0] + " arr[1] = " + arr[1]);*/

        //方法重载
        int a = 10;
        int b = 20;
        int ret = add(a, b);
        System.out.println("ret = " + ret);

        double a2 = 10.5;
        double b2 = 20.5;
        double ret2 = add(a2, b2);
        System.out.println("ret2 = " + ret2);

        double a3 = 10.5;
        double b3 = 10.5;
        double c3 = 20.5;
        double ret3 = add(a3, b3, c3);
        System.out.println("ret3 = " + ret3);
    }


    //采用引用类型参数
    public static void swap2(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    //传值交换
    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    //计算阶乘
    public static int factor(int n) {
        System.out.println("计算 n 的阶乘中！ n = " + n);
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //两数相加
    public static int add(int x, int y) {
        //System.out.println("调用方法中 x = " + x + " y = " + y);
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double add(double x, double y, double z) {
        return x + y + z;
    }
}
