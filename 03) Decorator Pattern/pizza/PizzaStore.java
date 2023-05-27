import component.Pizza;
import component.ThincrustPizza;
import decorator.Cheese;
import decorator.Olives;

public class PizzaStore {
 
	public static void main(String args[]) {
		Pizza pizza = new ThincrustPizza();
		Pizza cheesePizza = new Cheese(pizza);
		Pizza greekPizza = new Olives(cheesePizza);

		System.out.println(greekPizza.getDescription() 
				+ ": $" + greekPizza.cost());

	}
}
