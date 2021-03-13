/**
 * Created Date 05-Nov-2017
 * @author Nawal Sah 
 */
package nssaga.beginner.e12oops.e2abstraction;

/**
 * 
 * What is the Actual Use of Interface in Java?
 * 
 * In interface you cannot define any method inside interface, it a just
 * declaration. By rule, all method inside interface must be abstract (Well,
 * this rule is changing in Java 8 to allow lambda expressions, now interface
 * can have one non-abstract method, also known as a default method). So, if you
 * can't define anything, Why we need an interface? what's the use of an
 * interface, if we are anyway going to write a class and override them to
 * provide behavior, Can't we declare those methods inside the class itself
 * without using interface etc. Well, if you are thinking in terms of behavior
 * then you are really missing the point of interface.
 * 
 * Interface is great to declare Type, they promote code reusability, and they
 * are the real driver of polymorphism in Java.
 * 
 * Interface also allows multiple inheritance in Java, which makes it possible
 * for a class to become Canvas, as well as EventListener, which is used to draw
 * graphics as well as to process events.
 * 
 * 
 * Why we need Interface in Java?
 * 
 * There are several reasons, an application developer needs an interface, one
 * of them is Java's feature to provide multiple inheritance at interface level.
 * It allows you to write flexible code, which can adapt to handle future
 * requirements.
 * 
 * Some of the concrete reasons, why you need interface is :
 * 
 * 1) If you only implement methods in subclasses, the callers will not be able
 * to call them via the interface (not common point where they are defined).
 * 
 * 2) Java 8 will introduce default implementation of methods inside the
 * interface, but that should be used as exception rather than rule. Even Java
 * designer used in that way, it was introduced to maintain backward
 * compatibility along with supporting lambda expression. All evolution of
 * Stream API was possible due to this change.
 * 
 * 3) Interfaces are a way to declare a contract for implementing classes to
 * fulfill; it's the primary tool to create abstraction and decoupled designs
 * between consumers and producers.
 * 
 * 4) Because of multiple inheritance, interface allows you to treat one thing
 * differently. For example a class can be treated as Canvas during drawing and
 * EventListener during event processing. Without interface, it's not possible
 * for a class to behave like two different entity at two different situations.
 * Here is an example of how interface supports multiple inheritance in Java
 * 
 * <code>
 * interface Canvas{ 
 * 	public void paint(Graphics g); 
 * }
 * 
 * interface EventListener{ 
 * 	public boolean process(Event e); 
 * }
 * 
 * public class Game implements Canvas, EventListener{
 * 
 *  &#64;Override 
 *  public void paint(Graphics g){ 
 *  		g.drawLine(Color.RED); 
 *  }
 * 
 * }
 *
 * 
 * &#64;Override public boolean process(Event e){ 
 * 		KeyCode code = e.getKeyPressed().getCode(); 
 * 		}
 * }
 * </code>
 * 
 * 5) Interface are key of API design. In fact smaller interface like
 * Comparable, Runnable, Callable makes core of Java API. Though great care is
 * required while designing and publishing interface, because once published,
 * you can not change interface without breaking up all your clients, i.e.
 * classes which have implemented your interface. On extreme case, from Java 8
 * onwards, you can use default method to rescue, but as I said, it should be
 * exception than rule.
 * 
 * 6) "Programming to interface than implementation" is one of the popular
 * Object oriented design principle, and use of interface promotes this. A code
 * written on interface is much more flexible than the one which is written on
 * implementation.
 * 
 * 7) Use of interface allows you to supply a new implementation, which could be
 * more robust, more performance in later stage of your development.
 * 
 * In short main use of interface is to facilitate polymorphism. interface
 * allows a class to behave like multiple types, which is not possible without
 * multiple inheritance of class. It also ensures that you follow programming to
 * interface than implementation pattern, which eventually adds lot of
 * flexibility in your system.
 * 
 * 
 * Real use of interface is in unit testing. Code which are written using
 * interface are loosely coupled and easier to test because you can easily
 * supply a mock or stub implementation instead of real one. Since unit testing
 * is very important for delivering quality software, its better to use
 * interface in Java then class, especially for type declaration.
 * 
 * 
 * @author nawalsah
 *
 */
public class InterfaceDesc {

}
