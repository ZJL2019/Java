/**
 * @Author : Jaler
 * @Date : 2020/12/3 16:32
 * @describe :
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
