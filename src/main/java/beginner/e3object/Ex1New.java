/**
 
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
