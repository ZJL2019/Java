import java.util.logging.Logger;

public class DataType {
    public static void main(String[] args){
        //整型变量 大小为4 与操作系统无关
        /*int num = 10;
        System.out.println(num);//整型变量定义和初始化
        System.out.println(Integer.MAX_VALUE);//整型int的最大值
        System.out.println(Integer.MIN_VALUE);//整型int的最小值

        //数据溢出
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue+1);

        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue-1);*/

        //长整型变量 大小为8 与操作系统无关
        /*long num = 10L; //定义一个长整型变量，初始值为10l也可以
        System.out.println(num);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);*/

        //双精度浮点型变量
        /*double num = 1.0;
        System.out.println(num);

        int a = 1;
        int b = 2;
        System.out.println(a/b);*/

        //在Java中，int除以int的值仍然是int(会直接舍弃小数部分)
        //如果想得到0.5，需要使用double类型计算
        /*double c=1.0;
        double d=2.0;
        System.out.println(c/d);*/

        //Java中的double虽然也是8个字节，但是浮点数的内存和整数内存布局差距很大，不能单纯的用2^n的形式表示数据范围
        //Java的double类型的内存布局遵守IEEE754标准，尝试使用有限的内存空间表示可能无限的小数，势必会存在一定的精度误差
        /*double val=1.1;
        System.out.println(val*val);*/

        //单精度浮点型变量
        //float类型在Java中占4个字节
        /*float num = 1.0f;
        System.out.println(num);*/

        //字符类型变量
        //char ch = 'A';
        //注意：
        //1.Java中使用单引号+单个字母的形式表示字符字面量
        //2.计算机中的字符本质是一个整数，在C语言中使用ASCII表示字符。而Java中使用Unicode表示字符
        //3.因此一个字符占用两个字节，表示字符种类更多，包括中文

        char ch = '呵';
        System.out.println(ch);
        System.out.println(Character.SIZE/8);

    }
}
