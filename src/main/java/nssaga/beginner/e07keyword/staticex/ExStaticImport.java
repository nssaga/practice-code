/**
  ExStatic.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 14-Jul-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e07keyword.staticex;

import static java.lang.System.*;

/**
 * The static import is a new feature which is added in Java 5 through which we
 * can access any static member of a class directly. There is no need to qualify
 * it by the class name. For example we can use “System.out.println()” directly
 * with out prefixing System class like “out.println” (As out is a static member
 * of System class).
 * 
 * Important point to be noted here is that we need to add static keyword in the
 * import statement
 * 
 * Advantage of static import:
 * 
 * Main advantage of using static import in Java is saving keystrokes. If you
 * are frequently using System.out.println() statements, you can static import
 * System.out or System.* and type out.println() or println() in your code.
 * 
 * 
 * Disadvantage of static import:
 * 
 * If you overuse of the static import feature, it makes the program unreadable
 * and unmaintainable. Static import has another disadvantage in terms of
 * conflicts, once you use static import Integer.MAX_VALUE than after you can
 * not use MAX_VALUE as variable or constants in you code.
 */
public class ExStaticImport {

	public static void main(String args[]) {
		// With out static import
		System.out.println("\"out\" member of \"System\" class without static import");
		System.err.println("\"err\" member of \"System\" class without static import");

		// Using static import
		out.println("\"out\" member of \"System\" class with static import");
		err.println("\"err\" member of \"System\" class with static import");
	}
}
