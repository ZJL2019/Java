/**
 * @Author : Jaler
 * @Date : 2020/12/8 16:34
 * @describe :
 * @Version : 1.0
 */
public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
   }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
