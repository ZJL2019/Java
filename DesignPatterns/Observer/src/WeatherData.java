import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @Author : Jaler
 * @Date : 2020/11/25 15:28
 * @describe : 气象数据类用于注册主题，移除主题，通知观察者，气象数据更新
 * @Version : 1.0
 */
/*
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) { //注册观察者，只需要添加至ArrayList中
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) { //移除观察者，只需要从ArrayList中移除
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() { //遍历ArrayList中的所有观察者，并把状态告诉他们(update)
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() { //当气象数据更新，我们通知观察者
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) { //观测气象数据，并更新
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
*/

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    ;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}