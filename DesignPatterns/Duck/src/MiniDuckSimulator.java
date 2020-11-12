/**
 * @Author : Jaler
 * @Date : 2020/11/12 18:47
 * @describe : 测试Duck类以及其子类实现
 * @Version : 1.0
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //绿头鸭
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        //模型鸭
        Duck model = new ModelDuck();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
