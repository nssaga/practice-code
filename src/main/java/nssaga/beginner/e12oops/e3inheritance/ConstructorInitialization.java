/**
  ConstructorInitialization.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 03-Mar-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e12oops.e3inheritance;

/**
 * Whenever we are creating object for child class, parent class no args
 * constructor called automatically to initialize all the properties.
 * 
 * Order of execution, first parent object and then child constructor called.
 * 
 * Whenever we are creating child class object parent args no constructor will be
 * executed but not args constructor also parent object won't be created and
 * only object will be created for child class not for parent.
 * 
 * Constructor doen't inherit to sub class.
 * 
 * constructor of base class with no argument gets automatically called in
 * derived class constructor
 * 
 * But, if we want to call parameterized constructor of base class, then we can
 * call it using super(). The point to note is base class constructor call must
 * be the first line in derived class constructor
 * 
 * Why Constructors are not inherited in Java? Constructor is a block of code
 * that allows you to create an object of class and has same name as class with
 * no explicit return type.
 * 
 * Whenever a class (child class) extends another class (parent class), the sub
 * class inherits state and behavior in the form of variables and methods from
 * its super class but it does not inherit constructor of super class because of
 * following reasons:
 * 
 * Constructors are special and have same name as class name. So if constructors
 * were inherited in child class then child class would contain a parent class
 * constructor which is against the constraint that constructor should have same
 * name as class name
 * 
 * If we define Parent class constructor inside Child class it will give compile
 * time error for return type and consider it a method. But for print method it
 * does not give any compile time error and consider it a overriding method.
 * 
 * Now suppose if constructors can be inherited then it will be impossible to
 * achieving encapsulation. Because by using a super class’s constructor we can
 * access/initialize private members of a class. A constructor cannot be called
 * as a method. It is called when object of the class is created so it does not
 * make sense of creating child class object using parent class constructor
 * notation. i.e. Child c = new Parent(); A parent class constructor is not
 * inherited in child class and this is why super() is added automatically in
 * child class constructor if there is no explicit call to super or this.
 */

public class ConstructorInitialization {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.getName());
	}
}

class Person {
	private String name;
	private int age;

	/**
	 * 
	 */
	public Person() {
		System.out.println("parent constructor executed , has code : " + this.hashCode());
	}

	public Person(String name) {
		System.out.println("parent arg constructor executed , has code : " + this.hashCode());
	}
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

}

class Student extends Person {
	private int rollNo;
	private int marks;

	public Student() {
		System.out.println("student constructor executed, child object created, has code: " + this.hashCode());
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}