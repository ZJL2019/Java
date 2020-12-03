/**
 * @Author : Jaler
 * @Date : 2020/12/3 15:38
 * @describe : Beverage抽象类
 * @Version : 1.0
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
