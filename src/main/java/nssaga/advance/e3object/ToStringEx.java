/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: ToStringEx.java
 Date		: 10-Sep-2017 

 ---------------------------------------------*/
package nssaga.advance.e3object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nawal Sah
 */
public class ToStringEx {
	String s1 = this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());

	
	public static void main(String[] args) {

		ToStringEx u = new ToStringEx();
		System.out.println(u.s1);
		System.out.println(u);
		System.out.println(u.toString());

		int ar[] = { 12, 23, 13 };
		System.out.println("-----\n"+ar);
		System.out.println(ar.toString());
		System.out.println(Arrays.toString(ar));
		System.out.println(ar[0]);
		
		System.out.println("-----");
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		System.out.println(l);

		try {
			System.out.println(ar[3]);
		} catch (Exception e) {
			throw new ArrayIndexOutOfBoundsException("Index excption");
		}
		/*
		 * finally{ throw new ArrayIndexOutOfBoundsException("Index exception");
		 * }
		 */

		// we can't write anything after finally block
		/*
		 * List<String> l = new ArrayList<>(); l.add("One"); l.add("Two");
		 * System.out.println(l.toString());
		 */

	}

}
