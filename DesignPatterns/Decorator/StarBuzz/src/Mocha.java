/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:51
 * @describe : Mocha调料，继承自CondimentDecorator并重写getDescription和cost，以递归形式调用上层被装饰类
 * @Version : 1.0
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
