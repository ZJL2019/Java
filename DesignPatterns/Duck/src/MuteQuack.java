/**
 * @Author : Jaler
 * @Date : 2020/11/12 18:44
 * @describe : 不会叫，继承自QuackBehavior接口类
 * @Version : 1.0
 */

public class MuteQuack implements QuackBehavior{
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
