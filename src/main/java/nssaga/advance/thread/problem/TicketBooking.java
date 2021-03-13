/**
  TicketBooking.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 24-Feb-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.advance.thread.problem;

public class TicketBooking {
	public static void main(String[] args) {
		// BookTicketWithoutSync bt = new BookTicketWithoutSync();
		BookTicketWithSync bt = new BookTicketWithSync();
		Thread t1 = new Thread(bt, "Passenger 1");
		Thread t2 = new Thread(bt, "Passenger 2");

		t1.start();
		t2.start();
	}
}

class BookTicketWithoutSync implements Runnable {
	int ticketAvailable = 1;

	@Override
	public void run() {
		System.out.println("Ticket booking started for - " + Thread.currentThread().getName());
		if (ticketAvailable > 0) {
			System.out.println("Booking ticket for - " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				System.out.println("Booking interruption exception for - " + Thread.currentThread().getName());
			}
			ticketAvailable--;
			System.out.println("Ticket booked for - " + Thread.currentThread().getName());
			System.out.println("Available ticket - " + ticketAvailable);
		} else {
			System.out.println("Ticket not available for booking  - " + Thread.currentThread().getName());
		}
	}
}

class BookTicketWithSync implements Runnable {
	int ticketAvailable = 1;

	@Override
	public void run() {
		System.out.println("Ticket booking started for - " + Thread.currentThread().getName());
		synchronized (this) {
			if (ticketAvailable > 0) {
				System.out.println("Booking ticket for - " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException ie) {
					System.out.println("Booking interruption exception for - " + Thread.currentThread().getName());
				}
				ticketAvailable--;
				System.out.println("Ticket booked for - " + Thread.currentThread().getName());
				System.out.println("Available ticket - " + ticketAvailable);
			} else {
				System.out.println("Ticket not available for booking  - " + Thread.currentThread().getName());
			}
		}
	}
}