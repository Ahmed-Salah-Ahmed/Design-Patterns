package singleton;

// NOTE: Not guaranteed to work prior to Java 5.

public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
