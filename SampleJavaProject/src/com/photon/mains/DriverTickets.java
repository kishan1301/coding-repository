package com.photon.mains;

import java.util.Scanner;

import com.photon.POJO.Tickets;

public class DriverTickets {

	/*
	 * static { final int MAX_TICKET_LIMIT = 5; }
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Tickets[] ticketsCopy = new Tickets[5];

		boolean choice = true;
		int ch = 0;
		

		while (choice) {
			
			
			System.out.println("Select the services...\n " + "1. Booking\n " + "2. View Bookings\n "
					+ "3. Show tickets status\n" + " 4. Exit\n");

			ch = in.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter the number of tickets to be booked : ");
				int numOfTickets = in.nextInt();

				Tickets[] tickets = new Tickets[numOfTickets];

				for (int i = 0; i < numOfTickets; i++) {
					if (Tickets.getCounter() < Tickets.getMaxTicketLimit()) {
						tickets[i] = new Tickets();

						System.out.println("\nEnter details of the person...");
						tickets[i].setTicketID(i + 1);

						System.out.println("For Ticket id : " + tickets[i].getTicketID());

						System.out.println("Person name : ");
						tickets[i].setPersonName(in.next());

						System.out.println("Booking Date : ");
						tickets[i].setBookingDate(in.next());

						System.out.println("Amount paid : ");
						tickets[i].setPrice(in.nextFloat());

						ticketsCopy[i] = tickets[i];

					} else {
						System.out.println("Today's limit reached...\nPlease visit again tomorrow. Thank you!");
						break;
					}

				}
				break;

			case 2:
				try {
					for (Tickets t : ticketsCopy) {
						t.showDetails();
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					break ;
					
				}

			case 3:
				System.out.println("The status is...");
				System.out.println("Limit on the tickets purchased is " + Tickets.getMaxTicketLimit());
				System.out.println("Numbers of the tickets booked is " + Tickets.getCounter());
				break;

			case 4:
				choice = false;
			}

		}

		in.close();
	}

}
