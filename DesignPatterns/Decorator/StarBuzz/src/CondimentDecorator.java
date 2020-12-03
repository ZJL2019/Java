/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:42
 * @describe : 继承自Beverage用作调料“容器”
 * @Version : 1.0
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
