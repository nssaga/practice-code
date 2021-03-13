/**
  ArrayEx.java
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 05-Jun-2020		Nawal Sah				Initial Version
*/
package nssaga.beginner.e06array;
/**
 * size of an array must be specified by an int value and not long or short.
 * Every array type implements the interfaces Cloneable and java.io.Serializable.
 * Advantage :
 * 	Random Access, 
 * 	
 * Limitation :
 * 
 * 1. Fixed size
 */
public class ArraySyntax {
	public static void main(String[] args) {
		
		// one dimentional array declaration
		int num[] = new int[5];
		num[0] = 1;
		num[1] = 1;
		num[2] = 1;
		num[4] = 1;
		
		
		int num1[] = {1,2,3};
		
		
		
		// int[6] q;
		// At the time of declaration of array we can't declare size else get CT error.

		// int[] []a, []b; //CT error for the first variable only left dimension is
		// allowed
		// int a[] = new int[5];
		// every array in java is an object only

		// int a[] = new int[-5]; // compiler will check only int but runtime get
		// error(Negative array size exception)
		// int a[] = new int['b']; //byte, char, short and int is allowed in size

		// int[][] a = new int[2][];
		// int a[];
		// a = {1,2,3};

		// int[] b = x;
		// System.out.println(a[0]);

	}
}
