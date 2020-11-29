/**
 * @Author : Jaler
 * @Date : 2020/11/25 15:24
 * @describe : 观察者接口
 * @Version : 1.0
 */
public interface Observer {
    public void update(float temperature,float humidity,float pressure);//当气象改变时，主题会把状态值当做参数传送给观察者
}
