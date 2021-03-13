/**
  BinarySearch.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 22-Mar-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.collection.search;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 6, 9, 20, 23 };
		int elem = 9;
		int index = binarySearch(arr, elem);

		if (index == -1)
			System.out.println("not found");
		else
			System.out.println("Found at position : " + (index + 1));
	}

	static int binarySearch(int arr[], int elem) {
		int lower = 0;
		int upper = arr.length - 1;

		while (lower <= upper) {
			int mid = (lower + upper + 1) / 2;
			if (arr[mid] < elem) {
				lower = mid + 1;
			} else if (arr[mid] > elem) {
				upper = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	static int binarySearchRecursive(int[] arr, int low, int high, int search) {
		int mid = low + (high - low) / 2;

		if (arr[mid] == search) {
			return mid;
		}

		if (search < arr[mid]) {
			return binarySearchRecursive(arr, low, mid - 1, search);
		} else {
			return binarySearchRecursive(arr, mid + 1, high, search);
		}
	}

}
