/**
 * @Author : Jaler
 * @Date : 2020/12/8 15:55
 * @describe :
 * @Version : 1.0
 */
public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    final public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
