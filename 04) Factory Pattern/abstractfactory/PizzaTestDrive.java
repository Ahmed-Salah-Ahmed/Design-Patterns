package abstractfactory;

import abstractfactory.pizzas.Pizza;
import abstractfactory.stores.ChicagoPizzaStore;
import abstractfactory.stores.NYPizzaStore;
import abstractfactory.stores.PizzaStore;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Samir ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Yara ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Samir ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Yara ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Samir ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Yara ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Samir ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Yara ordered a " + pizza + "\n");
	}
}
