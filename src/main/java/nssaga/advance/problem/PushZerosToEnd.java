/**
  PushZerosToEnd.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 28-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.advance.problem;

public class PushZerosToEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		pushZerosToEnd(arr);
		for (Integer i : arr)
			System.out.print(arr[i]);
		System.out.println("-------");
		for (int i = 0; i< arr.length; i++)
			System.out.print(arr[i]);
	}

	public static void pushZerosToEnd(int[] num) {
		int count = 0;
		int len = num.length;
		for (int i = 0; i < len; i++) {
			if (num[i] != 0) {
				num[count++] = num[i];
			}
		}
		while (count < len) {
			num[count++] = 0;
		}
	}
}
