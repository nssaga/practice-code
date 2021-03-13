/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: UserDefinedUncheckedExceptionClass.java
 Date		: 08-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 * By extending java.lang.RuntimeException, we can create unchecked exception.
 * 
 * Runtime Exception : NullPointerException, NumberFormatException,
 * ClassCastException, ArrayIndexOutOfBoundException
 * 
 * @author Nawal Sah
 */
public class UserDefinedUncheckedExceptionClass {

	String s1 = this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());

	/**
	 * @param args
	 * @author Nawal Sah
	 */
	public static void main(String[] args) {
		UserDefinedUncheckedExceptionClass u = new UserDefinedUncheckedExceptionClass();

		System.out.println(u.s1);
		System.out.println(u);

		String s = null;
		if (s == null) {
			try {
				throw new UserDefinedExceptionClass("User Defined Exception Class");
			} catch (UserDefinedExceptionClass e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class UserDefinedUncheckedException extends RuntimeException {

	private static final long serialVersionUID = 3758713898312109165L;

	public UserDefinedUncheckedException(String message) {
		super(message);
	}
}
