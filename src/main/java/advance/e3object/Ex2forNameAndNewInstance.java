/**
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 14-Jul-2018		Nawal Sah				Initial Version
*/
package advance.e3object;

/**
 * Class.forName() will load the class dynamically by the path of class and it
 * indirectly will give you “class” object. Once the class is loaded we will be
 * using newInstance() method to create the object dynamically.
 * 
 * it also makes it independent and don't reflect any changes to code.
 */

public class Ex2forNameAndNewInstance {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName("advance.e3object.InstanceTest");

		InstanceTest test = (InstanceTest) clazz.newInstance();
		test.print();
	}
}

class Test {
	static {
		System.out.println("Static block");
	}

	public Test() {
		System.out.println("constructor block");
	}

	public void print() {
		System.out.println("Method executed");
	}
}