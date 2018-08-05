package beginner.e4control.e42dowhile;

/**
 * Reversing number
 * @author Nawal Sah
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {

		int n = 123;
		
		System.out.println("Original number : "+n);
		System.out.println("Reversed Number : "+reverseNumber(n));

	}
	public static int reverseNumber(int n){
		int rev = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		return rev;
	}

}
