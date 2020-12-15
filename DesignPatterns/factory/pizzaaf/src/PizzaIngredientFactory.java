/**
 * @Author : Jaler
 * @Date : 2020/12/13 19:39
 * @describe :
 * @Version : 1.0
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
