/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: ExceptionEx1.java
 Date		: 11-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 *
 * @author Nawal Sah
 */
public class ExceptionEx1 {
	static String str = "a";

	public static void main(String[] args) {
		new ExceptionEx1().method1();
		System.out.println(str);
	}

	void method1() {
		try {
			method2();
		} catch (Exception e) {
			str += "b";
		}
	}

	void method2() throws Exception {
		try {
			method3();
			str += "c";
		} catch (Exception e) {
			throw new Exception();
		} finally {
			str += "d";
		}
		method3();
		str += "e";
	}

	void method3() throws Exception {
		throw new Exception();
	}
}
