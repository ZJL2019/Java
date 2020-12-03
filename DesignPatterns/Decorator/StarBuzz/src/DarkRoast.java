/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:48
 * @describe : DarkRoast饮料,继承Beverage并重写cost
 * @Version : 1.0
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
