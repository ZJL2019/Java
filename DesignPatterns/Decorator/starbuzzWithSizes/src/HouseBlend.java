/**
 * @Author : Jaler
 * @Date : 2020/12/3 16:34
 * @describe :
 * @Version : 1.0
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
