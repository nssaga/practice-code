package advance.e4control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * sequence that reads the same backwards as forwards
 */
public class Palindrome2digit {
	public static void main(String[] ar) throws Exception {
		int ch = 0, st = 0, end = 0, n = 0, i = 0, j = 0, temp = 0, r = 0, sum = 0, flag = 0, c = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Enter 2 for 2-digit,  3 for 3-digit = ");
			ch = Integer.parseInt(br.readLine());
			if (ch == 2) {
				st = 10;
				end = 99;
			} else if (ch == 3) {
				st = 100;
				end = 999;
			} else
				System.out.print("Enter only 2 or 3 ");

			// Increment number from starting
			for (i = end; i >= st; i--) {

				// initialize number "n" for getting palindrome number
				for (j = i; j >= st; j--) {
					n = i * j;
					sum = 0;
					temp = n;
					while (n > 0) {
						r = n % 10;
						sum = sum * 10 + r;
						n = n / 10;
					}
					if (sum == temp) {
						System.out.println("palindrome is " + temp + " of " + i + " * " + j);
						flag = 1;
						// break;
					}
				}
				if (flag == 1)
					break;
			}
			System.out.print("Do u want to continue 0/1= ");
			c = Integer.parseInt(br.readLine());
		} while (c == 1);
	}
}
