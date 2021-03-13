package nssaga.beginner.e12oops.e2abstraction;

/**
 * We can't create object for abstract class either directly or indirectly
 * because abstract class is non implemented.
 * 
 * Why constructor is inside abstract class. Ans: Constructor is used to perform
 * initialization for the instance variable of abstract class, which are
 * inheriting from parent to child class
 * 
 * Abstract class can contain instance variable and these instance variables are
 * public by default
 * 
 * Abstract class must have abstract keyword and also with method if don't body,
 * if we don't write abstract then it give CT exception. Example below
 */

public class ExAbstraction {
	public static void main(String[] args) {

	}
}

abstract class ExAbstract1 {
	abstract void m1();
}
