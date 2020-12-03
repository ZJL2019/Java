/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:44
 * @describe : Espresso饮料，继承自Beverage并重写cost
 * @Version : 1.0
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
