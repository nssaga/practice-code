package nssaga.beginner.thread.completablefuture;

import java.util.concurrent.ThreadLocalRandom;

public class Actions {

	private static final long DELAY_MS = 1000L;

	public static void log(String log) {
		System.out.println(log);
	}

	public static void delay(long delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void delay() {
		delay(DELAY_MS);
	}

	public static boolean unlockTheDoor() {
		log("Forcing the door");
		delay();
		log("Door unlocked");
		return true;
	}

	public static int hackSecretPin(final String personName) {
		log("Hacking the Pin for - " + personName);
		delay(1500l);
		final int pin = (personName.hashCode() % 1000) + 1000;
		log("Pin hacked - " + pin);
		return pin;
	}

	public static String findBoxNumber(final String personName) {
		log("Finding box number for - " + personName);
		delay();
		final String boxNumber = "A" + ThreadLocalRandom.current().nextInt(100);
		log("FOund box number - " + boxNumber);
		return boxNumber;
	}
	
	
}
