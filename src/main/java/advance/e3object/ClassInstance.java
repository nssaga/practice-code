/**
 * Created Date 10-Dec-2017
 * @author Nawal Sah 
 */
package advance.e3object;

/**
 * @author nawalsah
 *
 */
public class ClassInstance {
	@SuppressWarnings("unused")
	public static void main(String... str){
		B b = new B();
	}
}

class A {
	
	static{
		System.out.println("Static block in class A.");
	}
	{
		System.out.println("Instance block in class A.");
	}
	A(){
		System.out.println("In class A constructor.");
	}
}

class B extends A {
	
	static{
		System.out.println("Static block in class B.");
	}
	{
		System.out.println("Instance block in class B.");
	}
	B(){
		System.out.println("In class B constructor.");
	}
}