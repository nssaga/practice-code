/**
  StackOverFlowException.java
 ***********************************************************************************************************************
 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	    Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 11-May-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e10exception;

/**
 * When a method is called, a new stack frame gets created on the call stack.
 * This stack frame holds parameters of the invoked method, its local variables
 * and the return address of the method i.e. the point from which the method
 * execution should continue after the invoked method has returned.
 * 
 * The creation of stack frames will continue until it reaches the end of method
 * invocations found inside nested methods.
 * 
 * During this process, if JVM encounters a situation where there is no space
 * for a new stack frame to be created, it will throw a StackOverflowError.
 * 
 * The most common cause for the JVM to encounter this situation is
 * unterminated/infinite recursion – the Javadoc description for
 * StackOverflowError mentions that the error is thrown as a result of too deep
 * recursion in a particular code snippet.
 * 
 * However, recursion is not the only cause for this error. It can also happen
 * in a situation where an application keeps calling methods from within methods
 * until the stack is exhausted. This is a rare case since no developer would
 * intentionally follow bad coding practices. Another rare cause is having a
 * vast number of local variables inside a method.
 * 
 * The StackOverflowError can also be thrown when an application is designed to
 * have cyclic relationships between classes. In this situation, the
 * constructors of each other are getting called repetitively which causes this
 * error to be thrown. This can also be considered as a form of recursion.
 * 
 * Another interesting scenario that causes this error is if a class is being
 * instantiated within the same class as an instance variable of that class.
 * This will cause the constructor of the same class to be called again and
 * again (recursively) which eventually results in a StackOverflowError.
 */
public class StackOverFlowException {

	public static void main(String[] args) {
		// UnintendedInfiniteRecursion.calculateFactorial(5);

		StackOverFlowExceptionInit ex = new StackOverFlowExceptionInit();
		ex.print();
	}
}

class UnintendedInfiniteRecursion {
	public static int calculateFactorial(int number) {
		return number * calculateFactorial(number - 1);
	}
}

/**
 * Initializing the same class inside the constructor. It will recursively and
 * full the stack
 */
class StackOverFlowExceptionInit {
	private int a = 0;

	private StackOverFlowExceptionInit exceptionInit;

	public StackOverFlowExceptionInit() {
		exceptionInit = new StackOverFlowExceptionInit();
	}

	public void print() {
		System.out.println("Printing");
	}
}
