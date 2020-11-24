package com.bit.demo1;

/**
 * @Author : Jaler
 * @Date : 2020/11/24 15:35
 * @describe :
 * @Version : 1.0
 */
//继承
//is - a
public class Animals {
    //public String name;
    //private String name;//java: name 在 Animals 中是 private 访问控制
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}


