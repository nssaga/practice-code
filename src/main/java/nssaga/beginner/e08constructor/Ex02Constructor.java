package nssaga.beginner.e08constructor;

public class Ex02Constructor {
	public static void main(String[] args) {
		Ex02Constructor1 e1 = new Ex02Constructor1();
		// Ex02Constructor2 e2 = new Ex02Constructor2();
		Ex02Constructor3 e3 = new Ex02Constructor3();
		Ex02Constructor4 e4 = new Ex02Constructor4();
		Ex01Constructor e5 = new Ex01Constructor();
	}
}

class Ex02Constructor1 {
	Ex02Constructor1() {
		System.out.println("Default construtor");
	}
}

class Ex02Constructor2 {
	// Private constructor is not visible and not allowed to create objct
	private Ex02Constructor2() {
		System.out.println("private construtor");
	}
}

class Ex02Constructor3 {
	public Ex02Constructor3() {
		System.out.println("public construtor");
	}
}

class Ex02Constructor4 {
	// not visible outside of package, only visible to same package and extended
	// class
	protected Ex02Constructor4() {
		System.out.println("protected construtor");
	}
}