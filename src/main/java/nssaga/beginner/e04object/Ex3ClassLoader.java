/**
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 14-Jul-2020		Nawal Sah				Initial Version
*/
package nssaga.beginner.e04object;

/**
 * Almost similar to that of the (class.forName) which load a class dynamically
 * 
 * The ClassLoader class has a method loadClass() which loads the class and on
 * top of it, we will call the newInstance() method which creates and return the
 * object of Object type, hence it is type casted
 */
public class Ex3ClassLoader {

	public void print() {
		System.out.println("Class loaded");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ClassLoader clazz = Ex3ClassLoader.class.getClassLoader();
		Ex3ClassLoader obj = (Ex3ClassLoader) clazz.loadClass("nssaga.object.Ex3ClassLoader").newInstance();

		// The specified class loader is used to load the class or interface. If we want
		// to dynamically load the class.
		//
		Ex3ClassLoader obj1 = (Ex3ClassLoader) Class.forName("nssaga.object.Ex3ClassLoader").newInstance();
		obj.print();
		obj1.print();
	}
}
