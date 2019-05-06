/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: ExceptionEx3.java
 Date		: 11-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 * int i=10/0; will throw ArithmeticException in java and next line will not
 * execute
 * 
 * @author Nawal Sah
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// System.out.println(m6());
		// m7();
		// m8();
	}

	static void m1() {
		int i = 10 / 0;
		System.out.println("Did this line execute?");

	}

	static void m2() {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception handled  properly in catch block");
		}
		System.out.println("Code after exception handling");
	}

	static void m3() {
		try {
			int i = 10 / 0; // will throw ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled in catch block");
		} finally {
			System.out.println("finally block executed");
		}

		System.out.println("code after try-catch-finally block");
	}

	static void m4() {
		try {
			System.out.println("in try block");
			System.exit(0); // quit here and nothing will execute
		} finally {
			System.out.println("finally block executed");
		}
	}

	static void m5() {
		try {
			int i = 10 / 0;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException handled in catch block");
		} finally {
			System.out.println("finally block executed");
		}

		System.out.println("code after try-catch-finally block");
	}

	/**
	 * In this program, i=10/0 will throw ArithmeticException and enter catch
	 * block to return "catch", but ultimately control will enter finally block
	 * to return "finally" in java.
	 * 
	 * @return
	 * @author Nawal Sah
	 */
	@SuppressWarnings("finally")
	static String m6() {
		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			return "catch";
		} finally {
			return "finally";
		}
	}

	/**
	 * Answer. Yes, program will compile successfully in java. In the above
	 * above > i=10/0 will throw ArithmeticException and will be handled in
	 * first catch block.
	 * 
	 * ArithmeticException has been used in first catch block RuntimeException
	 * has been used in second catch block Exception has been used in third
	 * catch block
	 * 
	 * Exception is superclass of RuntimeException and RuntimeException is
	 * superclass of ArithmeticException in java.
	 * 
	 * @author Nawal Sah
	 */
	static void m7() {
		try {
			int i = 10 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Exception handled - ArithmeticException");
		} catch (RuntimeException re) {
			System.out.println("Exception handled - RuntimeException");
		} catch (Exception e) {
			System.out.println("Exception handled - Exception");
		}
	}

	/**
	 * Answer. No, program will not compile. Exception is superclass of
	 * ArithmeticException. Exception class handled in starting catch block must
	 * be subclass of Exception class handled in following catch blocks
	 * (otherwise we will face compilation error) in java.
	 * 
	 * @author Nawal Sah
	 */
	static void m8() {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception handled - RuntimeException");
		} /*catch (ArithmeticException ae) {
			System.out.println("Exception handled - ArithmeticException");
		}*/
	}
	
	

}
