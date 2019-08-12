package nssaga.beginner.e12oops.e3inheritance;

/**
 * visibility cannot be reduced of the inherited method
 * 
 * if there is a function public void foo() in base class and if it is
 * overridden in derived class, then access specifier for foo() cannot be
 * anything other than public in derived class. If foo() is private function in
 * base class, then access specifier for it can be anything in derived class.
 * 
 * Is Overriding possible with private methods? No
 */
public class Ex04Derived {

}

/*
 * ex1
 */
class Ex04Base01 {
	public void foo() {
		System.out.println("Foo in base public");
	}
}

class Ex04Derived01 extends Ex04Base01 {
	public void foo() {
		System.out.println("foo in derived public");
	}
}

/*
 * ex2
 */
class Ex04Base02 {
	private void foo() {
		System.out.println("Foo in base2 private");
	}
}

class Ex04Derived02 extends Ex04Base02 {
	public void foo() {
		System.out.println("foo in derived2 public");
	}
}

/*
 * ex3
 */
class Ex04Base03 {
	protected void foo() {
		System.out.println("Foo in base2 private");
	}
}

class Ex04Derived03 extends Ex04Base03 {
	/*
	 * private void foo() { System.out.println("foo in derived2 public"); }
	 */
}