package singleton;

// NOTE: uniqueInstance variable is initialized at the time of class loading, 
// regardless of whether it will be used or not.
// The drawback of eager initialization is that it may lead to unnecessary resource consumption 
// if the instance is not used during the runtime of the program. 
// In scenarios where the initialization of the Singleton instance is resource-intensive or time-consuming, 
// this eager initialization can impact the performance of the application.

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
