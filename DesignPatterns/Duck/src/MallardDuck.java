/**
 * @Author : Jaler
 * @Date : 2020/11/12 18:37
 * @describe : 绿头鸭，会嘎嘎叫，会飞，继承超类Duck
 * @Version : 1.0
 */

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
