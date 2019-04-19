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
package beginner.oops.e3inheritance;


/**
 * Whenever we are creating object for child class, parent class constructor
 * called automatically to initialize all the properties.
 * 
 * Order of execution, first parent object and then child constructor called.
 * 
 * Whenever we are creating child class object parent constructor will be
 * executed but parent object won't be created and only object will be created for child class not for parent.
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