package factorymethod.stores;

import factorymethod.pizzas.ChicagoStyleCheesePizza;
import factorymethod.pizzas.ChicagoStyleClamPizza;
import factorymethod.pizzas.ChicagoStylePepperoniPizza;
import factorymethod.pizzas.ChicagoStyleVeggiePizza;
import factorymethod.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
