/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: ExceptionEx2.java
 Date		: 11-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 *
 * @author Nawal Sah
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		m(); // call recursive method m()
		System.out.println("Code after exception handling");
	}

	static void m() {
		try {
			m();
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
	}
}
