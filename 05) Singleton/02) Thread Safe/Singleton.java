package singleton;

// NOTE: The only time synchronization is relevant is the first time through this method.
// In other words, once we've set the `uniqueInstance` variable to an instance of Singleton, 
// we have no further need to synchronize this method. After the first time through,
// synchronization is totally unneeded overhead!

public class Singleton {
	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
