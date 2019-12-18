package com.photon.POJO;

public class Tickets {
	private int ticketID;
	private String personName;
	private String bookingDate;
	private float price;
	private static int counter = 0;
	private static final int MAX_TICKET_LIMIT = 1;

	public static int getCounter() {
		return counter;
	}

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static int getMaxTicketLimit() {
		return MAX_TICKET_LIMIT;
	}

	@Override
	public String toString() {
		return "Tickets [ticketID=" + ticketID + ", personName=" + personName + ", bookingDate=" + bookingDate
				+ ", price=" + price + "]";
	}
	
	//Constructor
	public Tickets() {
		++counter;
	}
	
	public void showDetails()	{
		
		System.out.println("Ticket id : " + this.getTicketID());
		System.out.println("Person name : " + this.getPersonName());
		System.out.println("Booking Date : " + this.getBookingDate());
		System.out.println("Amount paid : " + this.getPrice());
		System.out.println();
		
	}

}
