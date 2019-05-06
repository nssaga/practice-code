package nssaga.advance.e4control;

/**
 * Write a program to find out number is prime or not in java. <br>
 * <br>
 * 
 * What is prime number? A prime number is a natural number greater than 1 that
 * has no positive divisors other than 1 and itself. <br>
 * <br>
 * I have seen at many places iteration starting from i=2 to i<=n/2 which offers
 * time complexity of O(n/2). But, we will start iterating from i=2 to
 * i<=Math.sqrt(n). Q. why i<=Math.sqrt(n)? A.It will help us in reducing time
 * complexity from O(n/2) to O(root(N)).
 * 
 * 
 * 
 * @author Nawal Sah
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {

		int n = 11;
		System.out.println(isPrimeNumber1(n) ? n + " is prime number." : n + " is not prime number.");
		n = 12;
		System.out.println(isPrimeNumber1(n) ? n + " is prime number." : n + " is not prime number.");
		n = 13;
		System.out.println(isPrimeNumber2(n) ? n + " is prime number." : n + " is not prime number.");
		n = 14;
		System.out.println(isPrimeNumber2(n) ? n + " is prime number." : n + " is not prime number.");
	}

	/**
	 * time complexity of O(n/2)
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

	/**
	 * time complexity of O(root(2))
	 * 
	 * Complexity comparison of program when we iterate till i<=Math.sqrt(n) and
	 * i<=n/2 >
	 * 
	 * <br>
	 * when we iterate till i<=Math.sqrt(n) , When, i=2 to i<=Math.sqrt(n). Time
	 * complexity = O(root(N) ), i=2 to i<=3 [max two executions]<br>
	 * when we iterate till i<=n/2, when, i=2 to i<=n/2 Time complexity = O( n/2
	 * ), i=2 to i<=5 [max 4 execution]
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrimeNumber2(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

