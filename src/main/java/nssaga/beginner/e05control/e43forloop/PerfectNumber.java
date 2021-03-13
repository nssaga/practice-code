/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: Test.java
 Date		: 03-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e05control.e43forloop;

/**
 * Perfect number, a positive integer that is equal to the sum of its proper
 * divisors. The four perfect numbers 6, 28, 496 and 8128
 * 
 * @author Nawal Sah
 */
public class PerfectNumber {

	public static void main(String[] args) {
		// int n = 49;
		int n = 28;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				sum = sum + i;
				System.out.println("Divisor : " + i);
			}
		}
		System.out.println("Sum : " + sum);
		if (sum == n) {
			System.out.println("perfect number");
		} else {
			System.out.println("not a perfect number");
		}

	}

	public static boolean isPerfect(int num) {
		int sum = 0;
		boolean isP = false;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum == num) {
			isP = true;
		}

		return isP;
	}

}
