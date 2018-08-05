package beginner.e4control.e43forloop;

/**
 * Write a program to generate Fibonacci series in java. <br>
 * <br>
 * Example of fibonacci series in java - 0 1 1 2 3 5 8 13 21 34 55 89. <br>
 * <br>
 * 
 * First number of series is 0 & second number of series is 1. So, logic behind
 * the series generation is that the subsequent number generated is sum of
 * previous two number of series. <br>
 * <br>
 * 
 * Example of fibonacci series in java - First number of series is 0 & second
 * number of series is 1. So, third number will be 0+1=1 So, fourth number will
 * be 1+1=2 So, fifth number will be 2+1=3 and so on�
 * 
 * @author Nawal Sah
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		fibonacci();
	}

	/**
	 * Without recursion
	 */
	public static void fibonacci() {
		int first = 0;
		int sec = 1;
		int next = 0;
		System.out.print("Fibonacci Series : ");
		for (int i = 0; i < 10; i++) {
			System.out.print(first + " ");
			next = first + sec;
			first = sec;
			sec = next;
		}
	}

}
