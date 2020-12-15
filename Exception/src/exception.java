import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Author : Jaler
 * @Date : 2020/12/15 12:15
 * @describe : Java异常处理
 * @Version : 1.0
 */
public class exception {

    public static void main(String[] args) {
        //初识异常
        //除以0
        //System.out.println((10 / 0));
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at exception.main(exception.java:14)

        //数组下标越界
        //int[] arr={1,2,3};
        //System.out.println(arr[100]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
        //at exception.main(exception.java:20)

        //访问null对象
        //Test t=null;
        //System.out.println(t.num);
        //Exception in thread "main" java.lang.NullPointerException
        //at exception.main(exception.java:26)

        //所谓异常是指程序在运行时出现错误时通知调用者的一种机制


        //异常的基本用法
        //1.未加异常捕获
        /*int[] arr={1,2,3};
        System.out.println("before");
        System.out.println(arr[100]);
        System.out.println("after");*/
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
        //at exception.main(exception.java:36)
        //没有增加异常捕获，所以未打印after

        //2.加异常捕获
        /*int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");*/

        //3.catch只能捕获对应类型的异常
        /*int[] arr={1,2,3};
        try{
            System.out.println("before");
            arr = null;
            System.out.println(arr[100]);
            System.out.println("after");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");*/

        //4.catch可以有多个
        /*int[] arr = {1, 2, 3};
        try{
            System.out.println("before");
            arr=null;
            System.out.println(arr[100]);
            System.out.println("after");
        }*//*catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }*//*
        catch (ArrayIndexOutOfBoundsException|NullPointerException e){
            ...
        }
        System.out.println("after try catch");*/

        //5.用一个catch捕获所有异常
        /*int[] arr={1,2,3};

        try{
            System.out.println("before");
            arr=null;
            System.out.println(arr[100]);
            System.out.println("after");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("after try catch");*/

        //catch在捕获异常时，不止会捕获类型匹配的异常，还会捕获目标异常类型的子类异常

        //6.finally表示善后工作
        /*int[] arr = {1, 2, 3};
        try {
            System.out.println("before");
            arr = null;
            System.out.println(arr[100]);
            System.out.println("after");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code");
        }*/

        //7.使用try回收资源
        /*try (Scanner sc=new Scanner(System.in)){
            int num=sc.nextInt();
            System.out.println("num = "+num);
        }catch (Exception e){
            e.printStackTrace();
        }*/

        //8.无合适异常处理方式
        /*try {
            func();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");*/

        //System.out.println(divide(10,0));

        //System.out.println(func());

        /*try {
            System.out.println(readFile());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }*/

        //自定义异常类
        try {
            login("admin","123456");
        }catch (UserError | PasswordError userError){
            userError.printStackTrace();
        }

        /*自定义异常通常会继承自 Exception 或者 RuntimeException
        继承自 Exception 的异常默认是受查异常
        继承自 RuntimeException 的异常默认是非受查异常*/
    }

    public static String readFile() throws FileNotFoundException {
        File file = new File("./test.txt");
        Scanner sc = new Scanner(file);
        return sc.nextLine();
    }

    //沿调用栈向上传递
    //如果向上传递一直没有合适的方法处理异常，则交由JVM处理（未使用try catch）

    //finally注意事项
    public static int func(){
        try{
            return 10;
        }finally {
            return 20;
        }
    }
    //finally 执行的时机是在方法返回之前(try 或者 catch 中如果有 return 会在这个 return 之前执行 finally). 但是如果
    //finally 中也存在 return 语句, 那么就会执行 finally 中的 return, 从而不会执行到 try 中原有的 return.

    //抛出异常

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("抛出除0异常");
        }
        return x / y;
    }

    /*public static void func() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
    }*/
    private static String userName="admin";
    private static String password="123456";

    public static void login(String userName,String password) throws PasswordError, UserError {
        if(!exception.userName.equals(userName)){
            throw new UserError("用户名错误");
        }
        if(!exception.userName.equals(password)){
            throw new PasswordError("密码错误");
        }
        System.out.println("登录成功");
    }
}

/*class Test {
    public int num = 10;
}*/





class UserError extends Exception{
    public UserError(String message) {
        super(message);
    }
}

class PasswordError extends Exception{
    public PasswordError(String message) {
        super(message);
    }
}

