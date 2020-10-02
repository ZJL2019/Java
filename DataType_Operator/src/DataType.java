public class DataType {
    public static void main(String[] args) {
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

       /* char ch = '呵';
        System.out.println(ch);
        System.out.println(Character.SIZE / 8);*/

        //字节类型变量
        //注意：
        //1.字节类型表示的也是整数，只占一个字节，表示范围较小（-128~+127）
        //2.字节类型和字符类型互不相干

       /* byte value  = 0;
        System.out.println(value);*/

        //短整型变量
        //注意事项：
        //1.short占用2个字节，表示的数据范围是（-32768~+32767）
        /*short value = 0;
        System.out.println(value);
        System.out.println(Short.SIZE/8);*/

        //bool类型变量
        //1.boolean 类型的变量只有两种取值，true表示真，false表示假
        //2.Java的boolean 类型和int不能相互转换，不存在1表示true，0表示false这样的用法
        //3.boolean 类型有些JVM的实现是占1个字节，有些是占1个比特位，这个没有明确规定
      /*  boolean value = true;
        System.out.println(value);*/

        /*boolean value = true;
        System.out.println(value+1);

        编译错误：
        java: 二元运算符 '+' 的操作数类型错误
        第一个类型:  boolean
        第二个类型: int*/


        //字符串类型变量
        //注意事项：
        //1.Java使用双引号+若干字符的方式表示字符串字面值
        //2.和之前类型不同的是，String不是基本类型，而是引用类型
        //3.字符串中的一些特定的不太方便直接表示的字符需要进行转义
        /*String name = "zhangsan";
        System.out.println(name);*/

        /*String name = "My name is \"zhangsan\"";
        System.out.println(name);*/

        //字符串的+操作，表示字符拼接
        /*String a = "hello";
        String b = "world";
        String c = a + b;
        System.out.println(c);*/

        //字符串和整数拼接
        /*String str = "result = ";
        int a = 10;
        int b = 20;
        String result = str + a + b;
        System.out.println(result);*/

        /*int a = 10;
        int b = 20;
        System.out.println("a = " + a + ",b = " + b);*/


        //final
        //常量在运行过程中不允许被修改
        /*final int a = 10;
        a = 20;

        java: 无法为最终变量a分配值*/
    }
}
