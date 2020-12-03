/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:54
 * @describe : Soy调料，继承自CondimentDecorator并重写getDescription和cost，以递归形式调用上层被装饰类
 * @Version : 1.0
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
