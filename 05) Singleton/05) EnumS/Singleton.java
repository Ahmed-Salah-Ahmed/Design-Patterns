package singleton;

// NOTE: Thread Safe, avoids problems 
// with Class loaders, reflection, and serialization/deserialization

public enum Singleton {
	UNIQUE_INSTANCE;
 
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
