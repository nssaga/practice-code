/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: Unboxing.java
 Date		: 26-Aug-2017 

 ---------------------------------------------*/
package beginner.e8wrapper;

import java.util.ArrayList;

/**
 * Unboxing: It is just the reverse process of autoboxing. Automatically
 * converting an object of a wrapper class to its corresponding primitive type
 * is known as unboxing. For example conversion of Integer to int, Long to
 * long, Double to double etc.
 * 
 * 
 * @author Nawal Sah
 */
public class Unboxing {
	public static void main(String[] args) {
		Character ch = 'a';

		char c = ch;
		 // unboxing - Character object to primitive conversion
		System.out.println(c);
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(25);
		
		// unboxing because get method returns an Integer object
		int i = a.get(0);
		
		System.out.println(i);
	}
}
