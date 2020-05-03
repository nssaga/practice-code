/**
  Puzzle.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 01-May-2020		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.advance.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Puzzle {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Reading first line input for array size and number of query
		String line1 = br.readLine(); 
		String[] arr = line1.split(" ");
		int no_queries = Integer.parseInt(arr[1]);
		String[] list = br.readLine().split(" ");

		for (int i = 1; i <= no_queries; i++) {
			String[] query = br.readLine().split(" ");

			if (query[0].equals("1")) {
				// flip
				int index = Integer.parseInt(query[1]) - 1;
				if (list[index].equals("1")) {
					list[index] = "0";
				} else {
					list[index] = "1";
				}
			} else {
				// ODD or EVEN
				int r = Integer.parseInt(query[2]) - 1;
				if (list[r].equals("1")) {
					System.out.println("ODD");
				} else {
					System.out.println("EVEN");
				}

			}
		}
	}
}
