import javax.sound.midi.SoundbankResource;
import java.awt.im.InputMethodRequests;

/**
 * @Author : Jaler
 * @Date : 2020/11/16 14:49
 * @describe :
 * @Version : 1.0
 */

/*class Person {
    public int age;//成员属性   实例变量
    public String name;
    public String sex;

    public void eat() {//成员方法
        System.out.println("吃饭！");
    }

    public void sleep() {
        System.out.println("睡觉！");
    }
}*/

/*public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();//通过new实例化对象
        person.eat();//成员方法的调用需要通过对象的引用调用
        person.sleep();

        //产生对象          实例化对象
        Person person1 = new Person();
        Person person2 = new Person();
    }
}*/


//类的成员包括：字段，方法，代码块，内部类和接口等。

//字段
/*class Person {
 *//*public String name;
    public int age;*//*

    public String name = "张三";
    public int age = 18;
}*/

//方法Method
/*class Person {
    public String name = "张三";
    public int age = 18;

    public void show() {
        System.out.println("我叫" + name + ",今年" + age + "岁");
    }
}*/

//Static关键字
    /*1、修饰属性
      2、修饰方法
      3、代码块
      4、修饰类*/

/*class TestDemo{
    public int a;
    public static int count;

}*/

/*class TestDemo {
    public int a;
    public static int count;

    public static void change(){
        count=100;
        //a=10;静态方法只能修改静态成员变量
    }
}*/

/*
class Person{
    public int age;
    public String name;
    public String sex;
    public static int count;
    public final int SIZE=10;
    public static final int COUNT=99;

    public void eat(){
        int a=10;
        System.out.println("eat()!");
    }

    public void sleep(){
        System.out.println("sleep()!");
    }

    public static void staticTest(){
        //sex="Man" //不能访问非静态成员
        System.out.println("staticTest()!");
    }
}*/


//private
/*
class Person{
    private String name="张三";
    private int age=18;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void show(){
        System.out.println("name:"+name+" age:"+age);
    }
}*/

//构造方法
/*class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
        this.name = "caocao";
        this.age = 10;
        this.sex = "男";
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show() {
        System.out.println("name: " + name + "age: " + age + "sex: " + sex);
    }
}*/

//this关键字
/*class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
        //this调用构造方法
        this("bit", 12, "man");//必须放在第一行显示
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show() {
        System.out.println("name: " + name + " age: " + age + " sex: " + sex);
    }
}*/

//代码块
//字段的初始化方式
/*1.就地初始化
2.使用构造方法初始化
3.使用代码块初始化*/

/*什么是代码块？使用{}定义的一段代码
普通代码块
构造块
静态块
同步代码块*/

/*class Person{
    private String name;
    private int age;
    private String sex;

    public Person(){
        System.out.println("I am Person init()!");
    }

    //构造代码块
    {
        this.name="bit";
        this.age=12;
        this.sex="man";
        System.out.println("I am instance init()!");
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}*/


//静态代码块
//一般用于初始化静态成员属性
/*
class Person {
    private String name;
    private int age;
    private String sex;
    private static int count = 0;

    public Person() {
        System.out.println("I am Person init()!");
    }

    //构造代码块
    {
        this.name = "bit";
        this.age = 12;
        this.sex = "man";
        System.out.println("I am instance init()!");
    }

    static {
        count = 10;
        System.out.println("I am static init()!");
    }

    public void show() {
        System.out.println("name: " + name + " age: " + age + " sex: " + sex);
    }
}
*/

//toString方法
/*class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name: "+name+" age:"+age);
    }

    @Override //注解
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}*/

//匿名对象
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("name:" + name + " age:" + age);
    }

}

public class ClassesAndObjects {
    public static void main(String[] args) {
        //Person person = new Person();
        /*System.out.println(person.name);
        System.out.println(person.age);*/

        //System.out.println(person.name.length());//NullPointerException
        //null在Java中为“空引用”，表示一个无效对象，类似C中的空指针，如果对null进行 . 就会引发异常

        /*System.out.println(person.name);
        System.out.println(person.age);*/

        /*person.show();
        Person person1 = new Person();
        person1.name = "李四";
        person1.age = 20;
        person1.show();*/

        //a) 修饰属性，Java静态属性和类相关, 和具体的实例无关. 换句话说, 同一个类的不同实例共用同一个静态属性.
        /*TestDemo t1 = new TestDemo();
        t1.a++;
        TestDemo.count++;
        System.out.println(t1.a);
        System.out.println(TestDemo.count);
        System.out.println("==========");
        TestDemo t2 = new TestDemo();
        t2.a++;
        TestDemo.count++;
        System.out.println(t2.a);
        System.out.println(TestDemo.count);*/
        //示例代码内存解析：count被static所修饰，所有类共享。且不属于对象，访问方式为：类名 . 属性。

        //b)修饰方法
        /*如果在任何方法上应用 static 关键字，此方法称为静态方法。
        1.静态方法属于类，而不属于类的对象。
        2.可以直接调用静态方法，而无需创建类的实例。
        3.静态方法可以访问静态数据成员，并可以更改静态数据成员的值*/

        /*TestDemo.change();//无需创建实例对象，就可以调用
        System.out.println(TestDemo.count);*/

        //注意：静态方法和实例无关，而是和类相关
        //静态方法不能直接使用非静态方法或非静态成员变量
        //this和super两个关键字不能在静态上下文中使用(this是当前实例的引用，super是当前实例的父类实例的引用)

        //产生对象 实例化对象
       /* Person person = new Person();
        System.out.println(person.age);//默认值为0
        System.out.println(person.name);//默认值为null*/
        //System.out.println(person.count); warning
        /*System.out.println(Person.count);
        System.out.println(Person.COUNT);
        Person.staticTest();*/
        //总结：所有被static所修饰的方法或者属性，全部不依赖于对象
       /* person.eat();
        person.sleep();*/

        /*Person person = new Person();
        person.show();*/

        /*Person person = new Person();
        person.setName("caocao");
        String name = person.getName();
        System.out.println(name);
        person.show();*/

        /*Person person = new Person();
        person.show();
        Person person1 = new Person("zhangfei", 80, "男");
        person1.show();*/

        /*Person person = new Person();
        person.show();*/


        //普通代码块
        //定义在方法中的代码块
       /* {
            int x =10;
            System.out.println("x1 = "+x);
        }
        int x = 100;
        System.out.println("x2 = "+x);*/

        //构造代码块
        //构造在类中的代码块(不加修饰符)。也叫实例代码块，一般用于初始化实例的成员变量
        /*Person person = new Person();
        person.show();*/
        //构造代码块，先于构造方法执行

        //静态代码块
        //不管生成多少个对象，其只会执行一次，且是最先执行的
        //静态代码块执行完毕后，构造代码块执行，再然后是构造方法执行
        /*Person person = new Person();
        Person person1 = new Person();*/

        /*
        1.toString方法会在 println 的时候被自动调用.
        2.将对象转成字符串这样的操作我们称为序列化.
        3.toString是Object类提供的方法, 我们自己创建的Person类默认继承自Object类, 可以重写toString方法实
        现我们自己版本的转换字符串方法.
        @Override在Java中称为 "注解", 此处的 @Override 表示下面实现的 toString 方法是重写了父类的方法.
        */
        /*Person person = new Person("caocao",19);
        person.show();
        System.out.println(person);*/


        /*
        匿名只是表示没有名字的对象.
        没有引用的对象称为匿名对象.
        匿名对象只能在创建对象时使用.
        如果一个对象只是用一次, 后面不需要用了, 可以考虑使用匿名对象*/
        new Person("caocao", 19).show();

    }
}


