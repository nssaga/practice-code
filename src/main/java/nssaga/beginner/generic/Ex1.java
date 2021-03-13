package nssaga.beginner.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * In the case of array, at the time of retrieval it is not required to perform
 * type casting because there is guarantee present inside array<br>
 * String[] s = new String[100];<br>
 * At the time of retrieval type casting is not required. <br>
 * But in the case of collection at the time of retrieval compulsory we should
 * perform type casting because there is not guarantee for the type element
 * present inside in collection<br>
 * 
 */
public class Ex1 {
	public static void main(String[] args) {
		String[] names = new String[100];
		names[0] = "nawal";
		names[1] = "sah";
		// names[2] = new Integer(10);
		// incompatible data type, it will throw error at compile time and the array
		// make it
		// type safe.

		System.out.println(names.length);

		List list = new ArrayList<>();
		list.add("nawal");
		list.add("sah");
		list.add(new Integer(12));
		System.out.println((String) list.get(2)); // it will throw error at runtime not CT because value is number but
													// we are casting it string, hence we can say collection doesn't
													// provide type safety
	}
}
