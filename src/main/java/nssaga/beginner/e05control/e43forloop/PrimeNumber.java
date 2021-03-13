package nssaga.beginner.e05control.e43forloop;

/**
 * Write a program to find out number is prime or not in java. <br>
 * <br>
 * 
 * What is prime number? A prime number is a natural number greater than 1 that
 * has no positive divisors other than 1 and itself. <br>
 * 
 * @author Nawal Sah
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {

		int n = 11;
		System.out.println(isPrimeNumber1(n) ? n + " is prime number." : n + " is not prime number.");

		primeNumber2(n);
	}

	/**
	 * time complexity of O(n)
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrimeNumber1(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Way 2
	public static void primeNumber2(int n) {
		for (int i = 2; i < n; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}

		}
	}

	/**
	 * Complexity O(n/2)
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrimeNumber3(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
