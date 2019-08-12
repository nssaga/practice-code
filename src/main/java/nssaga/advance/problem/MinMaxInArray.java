/**
  MinMaxInArray.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 06-Jun-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.advance.problem;

/**
 * Find min and max number in an array.
 */
public class MinMaxInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 44, 66, 22, 76, 21 };

		printMinMax1(arr);

		MinMaxObj minMaxObj = printMinMax2(arr);
		System.out.println("Min - " + minMaxObj.getMin() + ", Max - " + minMaxObj.getMax());

	}

	public static void printMinMax1(int[] arr) {
		int min = 0;
		int max = 0;

		if (arr.length == 1) {
			System.out.println("Min - " + arr[0] + ", Max - " + arr[0]);
			return;
		} else if (arr.length == 2) {
			if (arr[0] > arr[1])
				System.out.println("Min - " + arr[1] + ", Max - " + arr[0]);
			else if (arr[0] < arr[1])
				System.out.println("Min - " + arr[0] + ", Max - " + arr[1]);
			else
				System.out.println("Min - " + arr[1] + ", Max - " + arr[0]);
			return;
		} else {
			min = arr[0];
			max = arr[0];
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
			else if (arr[i] > max)
				max = arr[i];
		}

		System.out.println("Min - " + min + ", Max - " + max);
	}

	public static MinMaxObj printMinMax2(int[] arr) {
		MinMaxObj minMaxObj = new MinMaxObj();
		int len = arr.length;
		int i = 0;

		/*
		 * If array has even number number of element
		 */
		if (len % 2 == 0) {

			if (arr[0] > arr[1]) {
				minMaxObj.setMax(arr[0]);
				minMaxObj.setMin(arr[1]);
			}

			else {
				minMaxObj.setMax(arr[1]);
				minMaxObj.setMin(arr[0]);
			}

			i = 2;
		}
		/*
		 * If array has odd number of element
		 */
		else {
			minMaxObj.setMin(arr[0]);
			minMaxObj.setMax(arr[0]);
			i++;
		}

		while (i < len - 1) {
			if (arr[i] > arr[i + 1]) {

				if (arr[i] < minMaxObj.getMin()) {
					minMaxObj.setMin(arr[i]);
				}

				if (arr[i] > minMaxObj.getMax()) {
					minMaxObj.setMax(arr[i]);
				}
			} else {
				if (arr[i + 1] < minMaxObj.getMin()) {
					minMaxObj.setMin(arr[i]);
				}

				if (arr[i + 1] > minMaxObj.getMax()) {
					minMaxObj.setMax(arr[i]);
				}
			}
			i += 2;
		}
		return minMaxObj;

	}
}

class MinMaxObj {
	private int max;
	private int min;

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(int max) {
		this.max = max;
	}

	/**
	 * @return the max
	 */
	public int getMax() {
		return max;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(int min) {
		this.min = min;
	}

	/**
	 * @return the min
	 */
	public int getMin() {
		return min;
	}
}
