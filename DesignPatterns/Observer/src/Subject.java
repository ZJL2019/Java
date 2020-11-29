/**
 * @Author : Jaler
 * @Date : 2020/11/25 15:21
 * @describe : 主题接口
 * @Version : 1.0
 */
public interface Subject {
    public void registerObserver(Observer o);//注册观察者
    public void removeObserver(Observer o);//移除观察者
    public void notifyObservers();//当主题改变时，这个方法会通知所有观察者
}
