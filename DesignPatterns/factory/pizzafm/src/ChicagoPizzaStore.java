/**
 * @Author : Jaler
 * @Date : 2020/12/8 16:17
 * @describe :
 * @Version : 1.0
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else{
            return null;
        }
    }
}
