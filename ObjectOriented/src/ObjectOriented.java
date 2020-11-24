//import java.util.Date;

import com.bit.demo1.Animals;

import javax.xml.catalog.Catalog;
import java.util.*;
//导入java.util中所有类
//import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * @Author : Jaler
 * @Date : 2020/11/24 14:59
 * @describe : 了解Java有关面向对象的特性
 * @Version : 1.0
 */
public class ObjectOriented {
    public static void main(String[] args) {
        //包(package)--是组织类的一种方式
        //使用包的主要目的是保证类的唯一性

        //使用java.util.Date这种方式引入这个包中的Date类
        /*java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());*/

        //使用import语句导入包
        /*Date date = new Date();
        System.out.println(date.getTime());*/

        //注意事项：import和C++的#include差别很大，C++必须通过#include引入其他文件内容
        //但是java不需要，import只是为了写代码的时候更方便 import更类似于namespace和using

        //使用import static可以导入包中静态的方法和字段
        //out.println("hello");
        /*double x = 30;
        double y = 40;
        double result = sqrt(pow(x,2)+pow(y,2));
        System.out.println(result);*/

        //private的成员只能在类内使用
        //如果某个成员不包含public和private关键字，此时这个成员可以在包的内部使用，不能在包外使用
        //Test test= new Test();
        //System.out.println(test.value);//java: value在com.bit.demo1.Test中不是公共的; 无法从外部程序包中对其进行访问

        /*Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();*/

        //Animals animals = new Animals("小动物");
        //System.out.println(animals.name);//java: name 在 com.bit.demo1.Animals 中是 protected 访问控制

        //final
        //final int a = 10; //表示a为常量不可修改
        //a = 20;

        //向上转型
        //直接赋值
        //Animals bird2 = new Bird("圆圆");
        //方法传参
        //feed(bird2);
        //方法返回
        //Animals animals = findMyAnimals();

        /*Animals animals = new Animals("圆圆");
        animals.eat("谷子");
        Animals animals1 = new Bird("扁扁");
        animals1.eat("谷子");*/

        /*Shape shape = new Flower();
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();

        drawShape(shape);
        drawShape(shape1);
        drawShape(shape2);*/


       /* Animals animals = new Cat("小猫");
        *//*Bird bird = (Bird)animals;
        bird.fly();*//*
        if(animals instanceof Bird) {//instanceof可以判定一个引用是否是某个类的实例. 如果是, 则返回 true. 这时再进行向下转型就比较安全了
            Bird bird = (Bird)animals;
            bird.fly();
        }*/

        /*IShape shape = new Cycle();
        shape.draw();*/

        Cat cat = new Cat("小猫");
        walk(cat);

        Frog frog = new Frog("小青蛙");
        walk(frog);


        Robot robot = new Robot("机器人");
        walk(robot);
    }

    public static void walk(IRunning running){
        System.out.println("我带着伙伴去散步");
        running.run();
    }

    public static  void drawShape(Shape shape){
        shape.draw();
    }

    public static void feed(Animals animals) {
        animals.eat("谷子");
    }

    public static Animals findMyAnimals() {
        Bird bird = new Bird("圆圆");
        return bird;
    }
}

//final修饰类，此时被修饰的类无法被继承
/*final class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }
}*/

class Bird extends Animals {
    //super 表示获取到父类实例的引用
    //this:访问本类中的属性和方法  先查找本类，如果本类没有就查找父类
    //super:由子类访问父类中的属性和方法  直接查找父类
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }

    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}

//java: 无法从最终Cat进行继承
/*class LittleCat extends Cat {//

    public LittleCat(String name) {
        super(name);
    }
}*/

//组合
//组合并没有涉及到特殊的语法(诸如 extends 这样的关键字), 仅仅是将一个类的实例作为另外一个类的字段.
//这是我们设计类的一种常用方式之一.
//组合表示 has - a
class Student {
    public Student() {
    }
}

class Teacher {
    public Teacher() {
    }
}

class School {
    public School() {
    }

    public Student[] students;
    public Teacher[] teachers;
}


//多态
abstract class Shape{ //抽象类:包含抽象方法的类
    abstract public void draw();//抽象方法

    void func(){
        System.out.println("func");
    }
}
//不可以被实例化，只能被继承重写
//抽象方法不能是private
//抽象类中可以包含非抽象方法，和字段

/*class Cycle extends Shape{
    @Override
    public void draw(){
        System.out.println("o");
    }
}

class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("□");
    }
}

class Flower extends Shape{
    @Override
    public void draw(){
        System.out.println("♣");
    }
}*/

//接口
//接口中的方法一定是抽象方法，因此可以省略abstract
//接口中的方法一定是public,因此可以省略public
//Cycle使用implements实现接口
//接口中只能包含抽象方法
//对于字段来说，接口中只能包含静态常量(public,static,final都可以省略,仍表示静态常量)
//创建接口一般以I开头，使用形容词命名
interface IShape{
    void draw();
}

class Cycle implements IShape{
    @Override
    public void draw() {
        System.out.println("o");
    }
}


class Animal{
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying{
    void fly();
}

interface IRunning{
    void run();
}

interface ISwimming{
    void swim();
}

class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(this.name+"正在用四条腿跑");
    }
}

class Fish extends Animal implements ISwimming{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim(){
        System.out.println(this.name+"正在用尾巴游");
    }
}

class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println(this.name+"正在往前跳");
    }

    @Override
    public void swim(){
        System.out.println(this.name+"正在蹬腿游泳");
    }
}

class Duck extends Animal implements IRunning,ISwimming,IFlying{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在用翅膀飞");
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用两条腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在飘在水上");
    }
}


class Robot implements IRunning{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用轮子跑");
    }
}
