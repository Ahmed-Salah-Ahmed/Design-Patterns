package decorator;
import component.Pizza;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	public abstract String getDescription();
}
