/*------------------------------------------------------------------------------------------------------
 NEWGEN SOFTWARE TECHNOLOGIES LIMITED
 Author                         : nawal.sah
 Group                          : AP-2
 Project/Product                : ADF Phonix Project 
 Module                         : Web Portal Development
 File Name                      : ExceptionHandling.java
 Date (DD/MM/YYYY)              : May 5, 2017
 Description                    : 
 ------------------------------------------------------------------------------------------------------*/


package nssaga.beginner.e10exception;

import java.io.IOException;

/**
 * Custom Exception Handling for negative number
 * */

public class CustomExceptionHandling {

	public static void main(String[] args) throws NegativeNumberException, IOException {
		try {
			testException(-5);
			testException(-10);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Releasing resources");
		}
		testException(15);
	}

	public static void testException(int i) throws NegativeNumberException, IOException {
		if (i < 0) {
			throw new NegativeNumberException("Negative Integer " + i);			 
		} else if (i > 10) {
			throw new IOException("Only supported for index 0 to 10");
		}

	}

}

class NegativeNumberException extends RuntimeException {

	private static final long serialVersionUID = 8557444268184180864L;

	public NegativeNumberException() {
		super();
	}

	public NegativeNumberException(String msg) {
		super(msg);
	}
}


