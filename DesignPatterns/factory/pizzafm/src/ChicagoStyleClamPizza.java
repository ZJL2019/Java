/**
 * @Author : Jaler
 * @Date : 2020/12/8 16:28
 * @describe :
 * @Version : 1.0
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
