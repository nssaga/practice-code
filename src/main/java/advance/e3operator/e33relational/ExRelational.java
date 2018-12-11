/**
  ExRelational.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 04-Aug-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package advance.e3operator.e33relational;

public class ExRelational {
	public static void main(String[] args) {
		// case 1
		// boolean b = true > false;
		// operator can be applied on every primitive type except boolean

		// case 2
		// String s = "abc" > "cdf";
		// operator can't applied on object type

		boolean a = 10 > 20; // true
		// boolean b = 10 > 20 > 30; // compile time error
		// nesting of relational opeator is not allowed else it throw CE "Unresolved
		// compilation problem: The operator > is undefined for the argument type(s)
		// boolean, int"

		// equality operator can be applied on any primitive type
		boolean b = true == false;

		// equality operator in object is used to compare object reference (address
		// comparison) or has code

		Thread t = new Thread();
		Object o = new Object();
		String s = new String("nawal");
		String s1 = new String();

		System.out.println(t == o);
		System.out.println(o == s);
		//System.out.println(t == s1);
		//System.out.println(t == s);// compile time error "Incompatible operand types Thread and String"
		// if we apply equality operator for object type then it is mandatory the
		// relation of argument type in object else it will throw compile time error

	}
}
