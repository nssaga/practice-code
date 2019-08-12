/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: ExceptionEx4.java
 Date		: 11-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 *
 * @author Nawal Sah
 */
public class ExceptionEx04 {
	static String s = "";

	public static void main(String[] args) {
		// try-catch-finally
		try {
			throw new Exception();
		} catch (Exception e) {
			// 1st nested try-catch-finally
			try {
				// 2nd nested try-catch-finally
				try {
					throw new Exception();
				} catch (Exception ex) {
					s += "a";
				} finally {
					s += "b";
				}
				throw new Exception();
			} catch (Exception x) {
				s += "c";
			} finally {
				s += "d";
			}
		} finally {
			s += "e";
		}
		System.out.println(s);
	}
}
