/**
  Ex4Clone.java
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

public class Ex4Clone implements Cloneable {
	private String name;

	public Ex4Clone(String name) {
		super();
		this.name = name;
	}

	public void getName() {
		System.out.println(name);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Ex4Clone ex = new Ex4Clone("Object");
		ex.getName();

		Ex4Clone clone = (Ex4Clone) ex.clone();
		clone.getName();

		/*
		 * Ex4 ex1 = new Ex4("Clone object"); Ex4 ex2 = ex2.clone();
		 */

	}
}

class Ex4 implements Cloneable {
	private String name;

	public Ex4(String name) {
		super();
		this.name = name;
	}

	public void getName() {
		System.out.println(name);
	}

}