/**
 * @Author : Jaler
 * @Date : 2020/11/12 18:45
 * @describe : 吱吱叫，重写QuackBehavior接口
 * @Version : 1.0
 */

public class Squeak implements QuackBehavior{
    public void quack(){
        System.out.println("Squeak");
    }
}
