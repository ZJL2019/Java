/**
 * @Author : Jaler
 * @Date : 2020/11/12 19:09
 * @describe :
 * @Version : 1.0
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
