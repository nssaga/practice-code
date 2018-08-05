/**
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 29-Jul-2018		Nawal Sah				Initial Version
*/
package beginner.e4control.e41ifelse;

public class Ex1If {

	// Main method
	public static void main(String[] args) {
		// If example
		int age = 18;
		if (age > 17) { // executes if condition is true
			System.out.println("Age " + age);
		}

		// If else example
		if (age > 18) { // executes if condition is true
			System.out.println("Your age is greater than 18");
		} else { // Executes if above condition is false
			System.out.println("Your age is less than or equal to 18");
		}

		// If - else - else if example
		if (age < 18) { // executes if condition is true
			System.out.println("You are young");
		} else if (age < 35) {
			System.out.println("You are adult");
		} else { // Executes if above condition is false
			System.out.println("You are dependent on your child as you are old, change your mind like old is gold");
		}

	}
}
