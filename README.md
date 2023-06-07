# Design-Patterns
 Head First Design Patterns Book Samples

1) The Strategy Pattern:
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that
use it.

2) The Observer Pattern:
The Observer Pattern defines a one-to-many relationship between a set of objects . When the state of one object changes , all of its dependents are notified.
The subject is the sole owner of that data, the observers are dependent on the subject to update them when the data changes. This Leads to a cleaner OO design than allowing many objects to control the same data.
Observer Pattern is a great example of loose coupling. Strive for loosely coupled designs between objects that interact.

3) The Decorator Pattern:
The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. Decorators are wrappers for our core objects. Wrapping enforces us to replace inheritance with composition.

Decorators have the same supertype as the objects they decorate. You can use one or more decorators to wrap an object. We can pass around a decorated object in place of the original (wrapped) object. The decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job.

We typically create decorators by using other patterns like Factory and Builder.

4) The Factory Pattern:
Factories handle the details of object creation.

Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types. the abstract Creator class gives you an interface with a method for creating objects, also known as the "factory method." Any other methods implemented in the abstract Creator are written to operate on products produced by the factory method. Only subclasses actually implement the factory method and create products.

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

5) The Singleton Pattern:

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it. 

Classic Singleton consists of a unique instance variable, private constructor, public getInstance.

Threads can cause multiple instances
→ public synchronized getInstance
The only time synchronization is relevant is the first time through this method. In other words, once we've set the `uniqueInstance` variable to an instance of Singleton, we have no further need to synchronize this method. After the first time through, synchronization is totally unneeded overhead.

We have 2 solutions:
→ In java 5 or higher, Use “double-checked locking” which means we use a Volatile variable & Check for an instance and if there isn’t one THEN enter a synchronized block.

→ Move to an eagerly created instance rather than a lazily created one.
The drawback of eager initialization is that it may lead to unnecessary resource consumption if the instance is not used during the runtime of the program. In scenarios where the initialization of the Singleton instance is resource-intensive or time-consuming, this eager initialization can impact the performance of the application.

Class loaders, reflection, and serialization/deserialization can cause problems with Singleton:
→ Using an enum to create your Singleton.
public enum Singleton { UNIQUE_INSTANCE;}
Singleton singleton = Singleton.UNIQUE_INSTANCE; 

