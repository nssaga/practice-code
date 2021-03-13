/**
  Ex05.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 14-Jul-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e12oops.e3inheritance;

public class Ex05 {
	int num = 0;

	public static void main(String[] args) throws Exception {

		Demo2 d3 = new Demo2();
		d3.m1(20);
		
		d3.m1("acv");

	}
}

class Demo1 {
	public void m1(int n) {
		System.out.println("demo 1");
	}

	/**
	 * Static method can't override
	 * 
	 */
	public static void m1(String n) {
		System.out.println("demo static");
	}
}

class Demo2 extends Demo1 {

	public void m1(int... n) {
		System.out.println("demo 2");
	}

	public void m1(int n) {
		System.out.println("Demo3");
	}

}