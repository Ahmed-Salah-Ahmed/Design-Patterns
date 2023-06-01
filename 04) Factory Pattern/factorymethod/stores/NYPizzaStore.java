package factorymethod.stores;

import factorymethod.pizzas.NYStyleCheesePizza;
import factorymethod.pizzas.NYStyleClamPizza;
import factorymethod.pizzas.NYStylePepperoniPizza;
import factorymethod.pizzas.NYStyleVeggiePizza;
import factorymethod.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
