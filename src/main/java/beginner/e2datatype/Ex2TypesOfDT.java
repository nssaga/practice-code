/**
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 16-Jul-2018		Nawal Sah				Initial Version 
 */
package beginner.e2datatype;

/**
 * There is 3 types of data type
 * 
 * <br>
 * 1. Primitive : It holds maximum one value at a time.<br>
 * 2. Derived : It holds one or more than one value of similar type<br>
 * 3. User defined : It holds one or more than one value of dissimilar type
 */
public class Ex2TypesOfDT {

	public static void main(String[] args) {
		// Type 1
		System.out.println("Type 1 Example");
		String country = "India";
		System.out.println("Country : " + country);
		System.out.println();

		// Type 2
		System.out.println("Type 2 Example");
		String name[] = { "Nawal", "Vishwa" };
		System.out.println("Names : " + name[0] + " " + name[1]);
		System.out.println();

		// Type 3
		System.out.println("Type 3 Example");
		Student s = new Student();
		s.setName("Nawal");
		s.setAge(27);

		System.out.println("Name : " + s.getName() + " Age : " + s.getAge());
	}

}

/**
 * Every class created in java which having fields getter/setter can be called as user defined data type.
 * 
 * Student class is a data type having different type of value named as "name and age".
 */
class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
