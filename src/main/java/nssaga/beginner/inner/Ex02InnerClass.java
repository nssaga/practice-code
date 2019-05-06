/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: InnerClassEx2.java
 Date		: 26-Aug-2017 

 ---------------------------------------------*/
package nssaga.beginner.inner;

/**
 *
 * @author Nawal Sah
 */
public class Ex02InnerClass {
	public int data = 10;

	public int getData() {
		return data;
	}

	public static void main(String[] args) {
		final Ex02InnerClass outer = new Ex02InnerClass();

		if (outer.getData() < 20) {
			// Local inner class inside if clause
			class Inner {
				public int getValue() {
					System.out.println("Inside Inner class");
					return outer.data;
				}
			}

			Inner inner = new Inner();
			System.out.println(inner.getValue());
		} else {
			System.out.println("Inside Outer class");
		}
	}
}
