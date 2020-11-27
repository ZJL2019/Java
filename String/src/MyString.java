import javax.sound.midi.SoundbankResource;
import java.lang.reflect.Field;

/**
 * @Author : Jaler
 * @Date : 2020/11/27 14:07
 * @describe : 认识String类
 * 了解String类的基本用法
 * 掌握String类常见操作
 * 认识字符串常量池
 * StringBuffer和StringBuilder
 * @Version : 1.0
 */
public class MyString {
    public static void main(String[] args) {
       /* //1.创建字符串
        //a
        String str = "Hello World!";
        //b
        String str2 = new String("Hello World!");
        //c
        char[] array = {'a','b','c','d'};
        String str3 = new String(array);
        //String是引用类型，可以赋值，相当于同时引用堆的同一块空间
        //如果修改，则相当于重新分配空间赋值*/


        //字符串比较
        //比较整数
        /*int x = 10;
        int y = 10;
        System.out.println(x==y);*/

        //a.
        /*String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);//true*/
        //a方法中,str1和str2指向同一块堆空间

        //b.
        /*String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4);//false*/
        //b方法中,str3和str4分别指向一块堆空间

        //总结:字符串==判断的是，是否指向同一个对象

        //equals--比较字符串

        //String str1 = new String("Hello");
        //String str2 = new String("Hello");
        //System.out.println(str1.equals(str2));

        //注意事项：
        //String str = new String("Hello");
        //1.
        //System.out.println(str.equals("Hello"));//str可能为null，会抛出异常
        //2.
        //System.out.println("Hello".equals(str));//推荐使用
        //"Hello"这样的字面常量，本质也是一个String对象


        //String直接赋值，相当于将这个对象保存在了一个字符串常量池中，当下一次赋值时，先在池中查找，然后直接引用，如果找不到才重新开辟
        //String构造赋值，则是通过new申请开辟空间，然后进行赋值

        //String str1 = new String("hello");
        //String str2 = "hello";
        //System.out.println(str1==str2);

        //String str3 = new String("Hello").intern();//手动入池
        //String str4 = "Hello";
        //System.out.println(str3==str4);

        //字符串不可变
        //String str = "hello";
        //str=str+" world";
        //str+="!!!";
        //System.out.println(str);
        //内存中没有修改字符串，只是通过‘+’的结果重新创建了字符串，然后更改了原本变量的引用方向

        //修改字符串

        //a
        //String str = "Hello";
        //str='h'+str.substring(1);
        //System.out.println(str);

        //字符，字节，与字符串

        //获取指定位置的字符
        //String str = "hello";
        //System.out.println(str.charAt(0));

        //System.out.println(str.charAt(10));

        //字符串与字符数组的转化
        /*String str = "hello world";
        char[] data = str.toCharArray();

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();*/

        //字符数组转字符串
        /*System.out.println(new String(data));//全部转化
        System.out.println(new String(data,5,5));*/


        //判断一个字符串是否全部是由数字组成
        /*String str = "1a23456";
        System.out.println(isNumber(str) ? "字符串是由数字组成的" : "字符串中有非数字字符");*/

        //字节与字符串

        //实现字符串与字节数的转化处理
        //String转byte[]
        /*String str="helloworld";
        byte[] data=str.getBytes();
        for (byte datum : data) {
            System.out.print(datum + " ");
        }

        System.out.println(new String(data));*/


        //字符串常见操作
        //不区分大小写比较
        /*String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));//不区分大小写
        System.out.println(str1.equalsIgnoreCase(str2));//区分大小写*/


        //compareTo()
        //1. 相等：返回0.
        //2. 小于：返回内容小于0.
        //3. 大于：返回内容大于0.
        //根据Unicode值判断
        //System.out.println("A".compareTo("a"));
        //System.out.println("a".compareTo("A"));
        //System.out.println("A".compareTo("A"));
        //System.out.println("AB".compareTo("AC"));
        //System.out.println("刘".compareTo("杨"));


        //字符串查找
        //contains
        //String str = "helloworld";
        //System.out.println(str.contains("world"));

        //indexOf
        /*String str = "helloworld";
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("bit"));
        if (str.indexOf("hello") != -1) {
            System.out.println("可以查找到指定字符串！");
        }*/

        //使用indexOf需要注意，如果内容重复，则只能返回一个位置
        /*String str = "helloworld";
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l",5));
        System.out.println(str.lastIndexOf("l"));*/

        //判断开头和结尾
        /*String str = "**@@helloworld!!";
        System.out.println(str.startsWith("**"));
        System.out.println(str.startsWith("@@",2));
        System.out.println(str.endsWith("!!"));*/

        //字符串替换
        /*String str="helloworld";
        System.out.println(str.replaceAll("l","_"));
        System.out.println(str.replaceFirst("l","_"));*/

        //字符串拆分
        //String str="hello world hello bit";
        /*String[] result = str.split(" ");
        for (String s:
             result) {
            System.out.println(s);
        }*/

        //字符串部分拆分
        /*String[] result = str.split(" ",2);//limit表示result的长度
        for (String s :
                result) {
            System.out.println(s);
        }*/

        // 拆分ip
        /*String str="192.168.1.1";
        String[] result = str.split("\\.");
        for (String s:
                result) {
            System.out.println(s);
        }*/


        /*
        1. 字符"|","*","+"都得加上转义字符，前面加上"\".
        2. 而如果是""，那么就得写成"\\".
        3. 如果一个字符串中有多个分隔符，可以用"|"作为连字符
        */

        //多次拆分
        /*String str = "name=zhangsan&age=18";
        String[] result = str.split("&|=");
        for (String s :
                result) {
            System.out.println(s);
        }*/
        /*for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=");
            System.out.println(temp[0] + "=" + temp[1]);
        }*/

        //字符串截取(前闭后开)
        /*String str="helloworld";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));*/

        //其他方法
        //trim
        //去掉string前面和后面的空格保留中间的
        /*String str = "     hello   world   ";
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");*/

        //toUpperCase
        //toLowerCase
        //字符转化为大写,只转换字母
        /*String str = "   hello%$$%@#$%world 哈哈哈  ";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());*/

        //length
        //数组使用length是指属性，字符串时length()方法
        /*String str = "   hello%$$%@#$%world 哈哈哈  ";
        System.out.println(str.length());*/

        //isEmpty
        /*System.out.println("hello".isEmpty());
        System.out.println("".isEmpty());*/
        //System.out.println(new String().isEmpty());

        //首字母大写
        /*System.out.println(firstUpper("yuisama"));
        System.out.println(firstUpper(""));
        System.out.println(firstUpper("a"));*/

        //StringBuffer 相比String来说是可以修改的，引用指向不变
        /*StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        fun(sb);
        System.out.println(sb);*/

        //字符串翻转
        StringBuffer sb = new StringBuffer("helloworld");
        System.out.println(sb.reverse());

        //指定删除范围
        System.out.println(sb.delete(5,10));

        //插入数据
        System.out.println(sb.insert(0,"你好"));

        //StringBuffer采用同步处理，属于线程安全操作
        //StringBuilder采用异步处理，属于线程不安全操作
    }

    public static void fun(StringBuffer temp){
        temp.append("\n").append("www.baidu.com");
    }

    public static String firstUpper(String str){
        if("".equals(str)||str==null){
            return str;
        }
        if(str.length()>1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return str.toUpperCase();
    }

    public static boolean isNumber(String str) {
        char[] data = str.toCharArray();
        for (char datum : data) {
            if (datum < '0' || datum > '9') {
                return false;
            }
        }
        return true;
    }
}
