/**
  LimitObjectCreation.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 25-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.advance.e3object;

/**
 * Question: How to restrict a class from creating multiple objects?
 * 
 * Restring a class from creating multiple objects or restricting class from
 * creating not more than three objects this type of interview questions will
 * come for experience interview or written tests.
 * 
 * Yes we can restrict a class from creating multiple objects.
 * 
 * As we know using singleton we can restrict a class from creating multiple
 * objects it will create single object and share it.
 * 
 * Same design pattern we can apply here with counter
 * 
 * In this we will take a static variable counter to check how many objects
 * created
 * 
 * As we can access static variables in constructor and static variables are
 * class level we can stake help of static variable to count number object
 * created.
 * 
 * First three time we will create new objects and forth time we need to return
 * 3rd object reference. if we don't want same object 4th time we can return
 * null
 * 
 * By printing the hashcode() of the object we can check how many objects
 * created.
 */
public class LimitObjectCreation {
	public static void main(String[] args) {
		RestrictObjectCreation obj1 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj2 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj3 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj4 =  RestrictObjectCreation.getInstance();
		RestrictObjectCreation obj5 =  RestrictObjectCreation.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		System.out.println(obj5.hashCode());
	}
}

class RestrictObjectCreation{
	private static RestrictObjectCreation obj;
	public static int count = 0;

	private RestrictObjectCreation() {
		System.out.println("Singleton(): Private constructor invoked");
		count++;
	}

	public static RestrictObjectCreation getInstance() {
		if (count < 3) {
			obj = new RestrictObjectCreation();
		}

		return obj;
	}
}
