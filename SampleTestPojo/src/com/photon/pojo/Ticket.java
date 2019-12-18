package com.photon.pojo;

public class Ticket {
	int ticket_id, price;
	String Person_name, Date;

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPerson_name() {
		return Person_name;
	}

	public void setPerson_name(String person_name) {
		Person_name = person_name;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Ticket [ticket_id=" + ticket_id + ", price=" + price + ", Person_name=" + Person_name
				+ ", Booking Date=" + Date + "]";
	}

	public static int objCount = 0;

	public Ticket() {
		objCount++;
	}

	void Ticket_status() {

		System.out.println();
	}

	// public void Ticket_show() {
	//
	// System.out.println(" Ticket_id :" + this.ticket_id);
	// System.out.println(" Ticket_id :" + this.price);
	// System.out.println(" Ticket_id :" + this.Person_name);
	// System.out.println(" Ticket_id :" + this.Date);
	//
	//
	// }

	
	public static void Ticket_show1(Ticket t[]) {
		for (int i = 0; i < objCount; i++) {
			System.out.println("TICKET ID: "  + t[i].ticket_id);
			System.out.println("PERSON NAME: " + t[i].Person_name);
			System.out.println("TICKET PRICE: "+ t[i].price);
			System.out.println("BOOKING DATE: "+ t[i].Date);
		}
	}

}
