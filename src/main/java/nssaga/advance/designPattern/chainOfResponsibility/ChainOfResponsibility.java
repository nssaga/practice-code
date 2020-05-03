package nssaga.advance.designPattern.chainOfResponsibility;

/**
 * https://www.javamadesoeasy.com/2020/01/chain-of-responsibility-design-pattern.html
 * 
 */
public class ChainOfResponsibility {

	public static void main(String[] args) {
		Rupees rs100 = new Rs100(100);
		Rupees rs50 = new Rs50(50);
		Rupees rs10 = new Rs10(10);

		// CHAINING
		rs100.next = rs50;
		rs50.next = rs10;

		rs100.message(1180);
	}
}

abstract class Rupees {
	int rs; // used in all extended class

	abstract void message(int amount);

	Rupees next;
}

class Rs100 extends Rupees {

	public Rs100(int amount) {
		this.rs = amount;
	}

	void message(int amount) {
		if (amount > 100) {
			System.out.println("Dispensing 100 = " + amount / 100);
			amount = amount - (100 * (amount / 100));
		}
		next.message(amount);
	}
}

class Rs50 extends Rupees {

	public Rs50(int amount) {
		this.rs = amount;
	}

	void message(int amount) {
		if (amount > 50) {
			System.out.println("Dispnesing 50 = " + amount / 50);
			amount = amount - 50 * (amount / 50);
		}
		next.message(amount);
	}
}

class Rs10 extends Rupees {

	public Rs10(int amount) {
		this.rs = amount;
	}

	void message(int amount) {
		if (amount > 10) {
			System.out.println("Dispnesing 10 = " + amount / 10);
			amount = amount - 10 * (amount / 10);
		}
		System.out.println("Done");
	}
}
