package beginner.e4control.e43forloop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Reading the same backward as forward, as 121
 * 
 */
public class Palindrome {
	public static void main(String[] args) throws Exception {
		int number = 0;
		//Accept Input value form leyboard 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number= ");
		number = Integer.parseInt(br.readLine());
		isPalindrome1(number);

		String str = "abd";
		System.out.println("isPalindrome : " + isPalindrome2("fnjzxnxnjplfwzowfdrhrvhegkmoncbkembjoudteqchjwqfzlofyflkmxnooasxulwofjzknthqqxgshvwxdvhdnlzjzdjdiifg"));

	}

	public static void isPalindrome1(int number) {
		int rem = 0;
		int sum = 0;
		int temp = 0;

		temp = number;
		while (number > 0) {
			rem = number % 10;
			sum = sum * 10 + rem;
			number = number / 10;
		}
		if (temp == sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	// less complex
	public static boolean isPalindrome2(String inputString) {
		char ar[] = inputString.toCharArray();
		for (int i = 0, j = ar.length - 1; i < (ar.length / 2); i++, j--) {
			if (ar[i] != ar[j]) // comparing the reverse number position from
								// start and end
				return false;
		}
		return true;
	}

}
