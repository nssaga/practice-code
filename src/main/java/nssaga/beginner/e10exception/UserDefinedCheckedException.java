/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: UserDefinedException.java
 Date		: 08-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 * Creating user defined checked exception. <br>
 * By extending java.lang.Exception, we can create checked exception.
 * 
 * Checked exception class name: IOException, FileNotFoundException
 * 
 * FileNotFoundException is a subclass of IOException 
 * 
 * @author Nawal Sah
 */
class UserDefinedExceptionClass extends Exception {

	private static final long serialVersionUID = 1L;

	public UserDefinedExceptionClass(String message) {
		super(message);
	}
}

public class UserDefinedCheckedException {
	public static void main(String[] args) {
		String s = null;

		if (s == null) {
			try {
				throw new UserDefinedExceptionClass("User Defined Exception Class");
			} catch (UserDefinedExceptionClass e) {
				e.printStackTrace();
			}
		}

	}
}
