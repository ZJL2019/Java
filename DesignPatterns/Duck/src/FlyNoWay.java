/**
 * @Author : Jaler
 * @Date : 2020/11/12 18:41
 * @describe : 重写FlyBehavior接口，不会飞
 * @Version : 1.0
 */

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can‘t fly");
    }
}
