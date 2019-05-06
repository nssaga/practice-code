/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: Autoboxing.java
 Date		: 26-Aug-2017 

 ---------------------------------------------*/
package nssaga.beginner.e09wrapper;

import java.util.ArrayList;

/**
 *
 * Autoboxing: Automatic conversion of primitive types to the object of their
 * corresponding wrapper classes is known as autoboxing. For example 
 * conversion of int to Integer, long to Long, double to Double etc
 * 
 * @author Nawal Sah
 */
public class Autoboxing {
	public static void main(String[] args) {
		// Primitive data type
		char c = 'a';

		// primitive to Wrapper class autoboxing
		Character ch = c;
		
		System.out.println(ch);
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		// Autoboxing because ArrayList stores only objects
		l.add(25);
		System.out.println(l.get(0));
	}
}
