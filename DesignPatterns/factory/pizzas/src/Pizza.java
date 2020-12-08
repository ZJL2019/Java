import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Jaler
 * @Date : 2020/12/8 14:51
 * @describe :
 * @Version : 1.0
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;

    List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("----" + name + "----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
