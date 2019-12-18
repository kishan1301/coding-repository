package com.photon.main;

import java.util.Scanner;

import com.photon.pojo.Ticket;

public class Ticket_main {
	static final int MAX_TICKET = 5;

	

	public static void main(String[] args) {
		int num_ticket;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tickets you want to book");
		num_ticket = sc.nextInt();
		Ticket[] obj_ticket = new Ticket[num_ticket];

		for (int i = 0; i < num_ticket; i++) {

			if (Ticket.objCount < MAX_TICKET) {
				obj_ticket[i] = new Ticket();
				obj_ticket[i].setTicket_id(i + 1);
				// System.out.println("Enter the PERSON NAME:");
				obj_ticket[i].setPerson_name("yasir");
				// System.out.println("Enter the CUSTOMER NAME:");
				obj_ticket[i].setDate("02/02/1997");
				obj_ticket[i].setPrice(1000);
				
			}
			else{
				System.out.println("TICKET LIMIT EXCEEDED");
				break;
			}
		}
		
		sc.close();
		
//		for(Ticket t: obj_ticket){
//		t.Ticket_show();	
//		}
		
		Ticket.Ticket_show1(obj_ticket);
	
		System.out.println("Tickets sold:" +Ticket.objCount );
		System.out.println("Totals Tickets:" + MAX_TICKET);

	}


}
