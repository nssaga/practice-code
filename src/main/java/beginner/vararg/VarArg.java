/**
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 07-Jun-2018		Nawal Sah				Initial Version
 */
package beginner.vararg;

public class VarArg {

	static {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		main(10, 20);

		int[] i = { 10, 20 };
		main(i);
	}

	// 3 dots must be together, only one var args allowed in a method
	// parameter and it must be at the last
	static void main(int... is) {
		System.out.println(is.length);
	}

	/*
	 * static void main(int[] is) { // var arg converted into arrays hence we can
	 * replace var args with array System.out.println(is.length); }
	 */

	void vararg1(int... arg) {

	}

	void vararg2(int... arg) {

	}

	void vararg2(String a, int... arg) {

	}
	
	//void v(String. .. a) { }  //invalid, 3 dots will always be together
}
