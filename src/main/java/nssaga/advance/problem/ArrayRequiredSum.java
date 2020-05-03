package nssaga.advance.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find a pair of elements from an array whose sum equals a given number
 * 
 * @author Nawal Sah
 *
 */
public class ArrayRequiredSum {
	public static void main(String arg[]) {
		int array[] = { 2, 10, 4, 5, 7, 1, 3, 9, 6, 8, 11, 12 };
		int requiredSum = 16;

		sumOfContinueNumber(array, requiredSum);
		System.out.println("==============================");
		prettyPrint(getRandomArray(9), 11);
	}

	/**
	 * Print numbers from an continued array whose sum equals a given number. High
	 * complexity
	 * 
	 * @author Nawal Sah
	 */
	public static void sumOfContinueNumber(int array[], int requiredSum) {

		for (int i = 0; i < array.length; i++) {
			String str = "[ ";
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum = sum + array[j];
				str = str + array[j] + ", ";
				if (sum == requiredSum) {
					System.out.println(" sum : " + sum + ", array : " + str + "]");
					str = "[ ";
				}
			}
		}
	}

	/**
	 * Print numbers from an random array whose sum equals a given number.
	 * 
	 * @author Nawal Sah
	 */
	public void sumOfRandomNumber(int array[], int requiredSum) {
		System.out.println("sumOfRandomNumber");
	}

	/**
	 * Given an array of integer, find two elements in the array whose sum is equal
	 * to n. Complexity is low.
	 * 
	 * @param numbers
	 * @param sum
	 * 
	 */

	public static void printPairsUsingSet(int[] numbers, int sum) {
		if (numbers.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<>(numbers.length);
		for (int number : numbers) {
			int target = sum - number; // if target number is not in set then add
			if (!set.contains(target)) {
				set.add(number); // not required
			} else {
				System.out.printf("(%d, %d) %n", number, target);
			}
		}
	}

	/**
	 * Given numbers, find two numbers from an array so that the sum is equal to
	 * that number k. Low complexity than above due to low comparison
	 * 
	 * @param numbers
	 * @param requiredSum
	 */
	public static void printPairsUsingTwoPointers(int[] numbers, int requiredSum) {
		if (numbers.length < 2) {
			return;
		}

		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == requiredSum) {
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < requiredSum) {
				left = left + 1;
			} else if (sum > requiredSum) {
				right = right - 1;
			}
		}
	}

	// http://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz4qHsIRXED
	/*
	 * Find two elements in an array that sum to k.
	 */
	public static void prettyPrint(int[] numbers, int requiredSum) {
		System.out.println("Random Integer array : " + Arrays.toString(numbers));
		System.out.println("Sum : " + requiredSum);
		System.out.println("pair of numbers from an array whose sum equals " + requiredSum);
		System.out.println("printPairsUsingSet");
		printPairsUsingSet(numbers, requiredSum);
		System.out.println("printPairsUsingTwoPointers");
		printPairsUsingTwoPointers(numbers, requiredSum);
	}

	/**
	 * Utility method to return random array of Integers in a range of 0 to 15
	 */
	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;
	}

}
