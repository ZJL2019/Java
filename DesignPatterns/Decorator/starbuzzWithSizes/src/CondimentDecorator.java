/**
 * @Author : Jaler
 * @Date : 2020/12/3 16:27
 * @describe :
 * @Version : 1.0
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
