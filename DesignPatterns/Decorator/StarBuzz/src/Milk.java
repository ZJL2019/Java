/**
 * @Author : Jaler
 * @Date : 2020/12/3 16:09
 * @describe : Milk调料，继承自CondimentDecorator并重写getDescription和cost，以递归形式调用上层被装饰类
 * @Version : 1.0
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }

    @Override
    public double cost() {
        return 0.10+beverage.cost();
    }
}
