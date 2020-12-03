/**
 * @Author : Jaler
 * @Date : 2020/12/3 16:21
 * @describe :
 * @Version : 1.0
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}

