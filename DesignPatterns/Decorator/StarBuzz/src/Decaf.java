/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:50
 * @describe : Decaf饮料，继承自Beverage并重写cost
 * @Version : 1.0
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
