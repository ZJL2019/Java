/**
 * @Author : Jaler
 * @Date : 2020/12/3 16:33
 * @describe :
 * @Version : 1.0
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
