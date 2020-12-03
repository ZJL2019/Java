/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:46
 * @describe : HouseBlend饮料，继承自Beverage并重写cost
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