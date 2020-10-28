      /** @Author : Jaler
        * @Date : 2020/10/28 10:49
        * @describe : 对于Java的基本数据类型和运算符进行测试和学习
        * @Version : 1.0
        */
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

        //类型转换
        /*int a=10;
        long b =20;
        a=b;//不兼容的类型: 从long转换到int可能会有损失
        b=a;*/

        /*int a = 10;
        double b = 1.0;
        a = b;//不兼容的类型: 从double转换到int可能会有损失
        b = a;*/

        //long表示的范围更大，可以将int赋值给long，但是不能将long赋值给int
        //double表示范围更大，可以将int赋值给double，但是不能将double赋值给int
        //结论：不同数字类型变量之间的赋值，表示范围更小的类型能隐式转换成较大范围的类型，反之则不行

        /*int a = 10;
        boolean b = true;
        b = a;//不兼容的类型: int无法转换为boolean
        a = b;*/

        //结论：int和boolean是两种毫不相干的类型，不能相互赋值

        /*byte a = 100;
        byte b = 256;//从int转换到byte可能会有损失*/

        //byte 是一个自己范围为 -128~127


        //强制类型转化
        /*int a = 0;
        double b =10.5;
        a=(int)b;*/

        /*int a=10;
        boolean b=false;
        b=(boolean)a;//不兼容的类型: int无法转换为boolean*/

        //结论：
        // 1.强制类型转化会导致精度丢失
        // 2.互不相干的类型之间无法强转


        //数值提升
        /*int a = 10;
        long b = 20;
        int c = a + b;//不兼容的类型: 从long转换到int可能会有损失
        long d = a + b;*/


        /*byte a=10;
        byte b=20;
        byte c=a+b;//从int转换到byte可能会有损失
        System.out.println(c);*/

        //在计算a+b时，会先将a和b提升为int，再将结果赋值给c

       /* byte a=10;
        byte b=20;
        byte c=(byte)(a+b);
        System.out.println(c);*/

        //结论：
        //1.不同类型的数据混合运算，范围小的会提升成范围大的
        //2.对于short,byte这种4个字节小的类型，会先提升为4个自己，再参与运算

        /*//int转换String
        int num = 10;
        //方法1
        String str1 = num+"";
        //方法2
        String str2 = String.valueOf(num);

        System.out.println(str1);
        System.out.println(str2);*/

        //运算符+，-，*，/
        /*int a = 1;
        int b = 2;
        System.out.println(a/b);//需要使用double来计算*/

        /*int a = 1;
        int b = 0;
        System.out.println(a/b);//除数不能为0*/

        //System.out.println(11.5%2.0);//可对浮点数取模

        //关系运算符
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //关系运算符返回的值类型都是boolean

    }
}
