package nssaga.beginner.e05control.e43forloop;

/**
 * how to reverse String in java with example, we will
 * keep performance in mind, with and without using StringBuffer in java. <br>
 * 
 * Complexity offered by our program to reverse String in java will be O(n/2),
 * where n is number of characters in string in java. <br>
 * 
 * Now, lets see how complexity is O(n/2). We are executing only half the number
 * of characters we have in our string.
 * <br>
 * Best case: O(n/2)- (1/2), when we have odd number of characters in string. <br>
 * Average case: O(n/2) , generally when we have even number of characters in
 * string. Worst case: O(n/2).
 * 
 * @author Nawal Sah
 *
 */
public class ReverseString {
	public static void main(String... args) {
		String originalString = "abcde"; // String to be reversed

		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String without StringBuffer: " + reverseString(originalString));
		
		StringBuffer sb = new StringBuffer(originalString);
		System.out.println("Reversed String with StringBuffer: " + sb.reverse());
	}

	/*
	 * return reversed String.
	 */
	public static String reverseString(String originalString) {
		char ar[] = originalString.toCharArray();
		char temp;
		for (int i = 0, j = ar.length - 1; i < (ar.length / 2); i++, j--) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}

		return new String(ar);
	}
}
