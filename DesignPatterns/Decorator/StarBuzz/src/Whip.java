/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:56
 * @describe : Whip调料，继承自CondimentDecorator并重写getDescription和cost，以递归形式调用上层被装饰类
 * @Version : 1.0
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
