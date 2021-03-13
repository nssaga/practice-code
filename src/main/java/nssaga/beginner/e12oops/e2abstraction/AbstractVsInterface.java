package nssaga.beginner.e12oops.e2abstraction;

/**
 * https://java-questions.com/difference-between-abstract-class-and-interface-java.html
 * 
 * A class is called abstract when it is declared with keyword abstract.
 * Abstract class may contain abstract method. It can also contain n numbers of
 * concrete method. Interface can only contain abstract methods.
 * 
 * Interface can have only abstract methods but abstract class can have concrete
 * and abstract methods.
 * 
 * The abstract class can have public, private, protected or default variables
 * and also constants but in interface the variable is by default public static
 * final. In nutshell the interface does'nt have any variables it only has
 * constants.
 * 
 * A class can extend only one abstract class but a class can implement multiple
 * interfaces. Abstract class doesn't support multiple inheritance whereas
 * interface does.
 * 
 * If an interface is implemented it's mandatory to implement all of its methods
 * but if an abstract class is extended it's mandatory to implement only the
 * abstract methods.
 * 
 * The problem with an interface is, if you want to add a new feature (method)
 * in its contract, then you MUST implement those method in all of the classes
 * which implement that interface. However, in the case of an abstract class,
 * the method can be simply implemented in the abstract class and the same can
 * be called by its subclass.
 * 
 * 
 * It is also considered that abstract class is faster than interface, since the
 * compiler needs to find the implementation and figure out the concrete class.
 * But, the results show that improve in performance is very minimal and it
 * should not be consider during building classes.
 * 
 * 
 * When to use abstract class over interface: 
 * 
 * Abstract class is mainly used to:
 * 
 * Define a default behavior for subclasses. It means that all child classes
 * should have perform same functionality.
 * 
 * Interface can be used to define a contract or behavior. A class can
 * implement multiple interfaces. Interface can also act as a contract between
 * two systems to interact.
 * 
 */
public class AbstractVsInterface {

}
