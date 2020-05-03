package nssaga.advance.designPattern.singleton;

/**
 * https://www.geeksforgeeks.org/singleton-design-pattern/
 * https://www.geeksforgeeks.org/singleton-design-pattern-introduction/?ref=rp
 */
public class SingletonClazz {
	public static void main(String[] args) {
		System.out.println(SingletonTest.getInstance().hashCode());
		System.out.println(SingletonTest.getInstance().hashCode());
	}
}

class SingletonTest {
	// Lazy initialization
	private static SingletonTest singleton;

	private SingletonTest() {
	};

	public static SingletonTest getInstance() {
		if (singleton == null) {
			singleton = new SingletonTest();
		}
		return singleton;
	}

}
