/**
 * @Author : Jaler
 * @Date : 2020/12/8 15:15
 * @describe :
 * @Version : 1.0
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName()+"\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName()+"\n");
        System.out.println(pizza);
    }
}
