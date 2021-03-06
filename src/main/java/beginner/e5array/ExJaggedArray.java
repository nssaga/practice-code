/**
  ExJaggedArray.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-Oct-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package beginner.e5array;

/**
 * Jagged array is array of arrays such that member arrays can be of different
 * sizes, i.e., we can create a 2-D arrays but with variable number of columns
 * in each row. These type of arrays are also known as Jagged arrays.
 */
public class ExJaggedArray {
	public static void main(String[] args) {
		int r = 5;

		// Declaring 2-D array with 5 rows
		int[][] arr = new int[r][];

		// Creating a 2D array such that first row
		// has 1 element, second row has two
		// elements and so on.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		// Initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}

		// Displaying the values of 2D Jagged array
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
