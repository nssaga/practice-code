/**
  Ex1New.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 14-Jul-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package beginner.e3object;

public class Ex1New {
	String value = null;

	public Ex1New(String value) {
		this.value = value;
	}

	public void disp() {
		System.out.println("Welcome " + value + "!!!");
	}

	public static void main(String args[]) {
		Ex1New d = new Ex1New("JavaInterviewPoint");
		d.disp();
	}
}
