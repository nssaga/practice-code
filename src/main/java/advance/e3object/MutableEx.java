/**
 * Created Date 17-Nov-2017
 * @author Nawal Sah 
 */
package advance.e3object;

/**
 * Immutable class is good for caching purpose because you don’t need to worry
 * about the value changes. Other benefit of immutable class is that it is
 * inherently thread-safe, so you don’t need to worry about thread safety in
 * case of multi-threaded environment.
 * 
 * 
 * Benefits of making a class immutable
 * 
 * Lets first identify benefits of making a class immutable. Immutable classes
 * are
 * 
 * are simple to construct, test, and use are automatically thread-safe and have
 * no synchronization issues do not need a copy constructor do not need an
 * implementation of clone allow hashCode to use lazy initialization, and to
 * cache its return value do not need to be copied defensively when used as a
 * field make good Map keys and Set elements (these objects must not change
 * state while in the collection) have their class invariant established once
 * upon construction, and it never needs to be checked again always have
 * “failure atomicity” (a term used by Joshua Bloch) : if an immutable object
 * throws an exception, it’s never left in an undesirable or indeterminate state
 * 
 * 
 * <br>
 * <br>
 * To create immutable class in java, you have to do following steps.
 * 
 * <br>
 * 1. Declare the class as final so it can’t be extended. <br>
 * 2. Make all fields private so that direct access is not allowed. <br>
 * 3. Don’t provide setter methods for variables. <br>
 * 4. Make all mutable fields final so that it’s value can be assigned only
 * once. <br>
 * 5. Initialize all the fields via a constructor performing deep copy. <br>
 * 6. Perform cloning of objects in the getter methods to return a copy rather
 * than returning the actual object reference.
 * 
 * @author nawalsah
 *
 */
public class MutableEx {
public static void main(String[] args) {
	MutableClassEx muta = MutableClassEx.getInstance(10, "Nawal");
	System.out.println(muta);
}
}

final class MutableClassEx {
	private final Integer num;
	private final String name;
	
	private MutableClassEx(Integer num, String name){
		this.num = num;
		this.name = name;
	}
	
	public Integer getNum(){
		return num;
	}
	
	public String getName(){
		return name;
	}
	
	public static MutableClassEx getInstance(Integer num, String name){
		return new MutableClassEx(num, name);
	}
	
	public String toString(){
		return name+" "+num;
	}
	
}
