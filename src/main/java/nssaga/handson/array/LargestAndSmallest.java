/*------------------------------------------------------------------------------------------------------
 Author                         : nawal.sah
 File Name                      : ArrayEx.java
 Date (DD/MM/YYYY)              : May 18, 2017
 Description                    : 
 ------------------------------------------------------------------------------------------------------*/

package nssaga.handson.array;

import java.util.Arrays;

public class LargestAndSmallest {
	public static void main(String[] args) {
		LargestAndSmallest ae = new LargestAndSmallest();
		ae.findLargSmallNum();
		System.out.println("----");
		ae.findLargSmallNum2();
	}

	// Way 1
	/**
	 * @Description write a java program to find largest & smallest number in an
	 *              array
	 */
	public void findLargSmallNum() {
		int a[] = new int[] { 5, 23, 45, 75, 10, 50, 7 };
		int s = a[0];
		int l = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > l) {
				l = a[i];
			} else if (a[i] < s) {
				s = a[i];
			}
		}
		System.out.println("the smallest number in the array is:" + s);
		System.out.println("the largest number in the array is:" + l);
	}

	// Way 2
	public void findLargSmallNum2() {
		int a[] = { 5, 23, 45, 75, 10, 50, 7 };
		Arrays.sort(a);
		System.out.println("the smallest number in the array is:" + a[0]);
		System.out.println("the largest number in the array is:" + a[a.length - 1]);
	}
}
