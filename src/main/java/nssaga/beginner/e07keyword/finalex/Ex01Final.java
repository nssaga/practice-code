/**
  Ex071Final.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 12-Apr-2020		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e07keyword.finalex;

/**
 * Final keyword can be used before class, variable and method
 * 
 * Final cann't be override or inherited, if do so it will gives compile time error
 * 
 * Final list can't be referenced to new but can be data added or removed
 */
public class Ex01Final {
	// Final must be initialize on declaration time, if not initialize on
	// declaration then it must be initialized in constructor
	final int x = 10;

	final int y;

	final int z = 9;

	// final int a;
	// a =4; // Initialization can only done during declaration or in constructor

	public Ex01Final() {
		y = 3; // initialized in constructor as not initialized during declaration
		// z = 2; // Can't re-initialize
	}

}

class FinalEx01 {
	final int x = 10;

}
