package com.nuclues.main;
class Ticket
{
	static int counter=0;
	static int maxLimit=2;
	private int tId;
	Ticket(int tId)
	{
		this.tId=tId;
		counter++;
		System.out.println("Ticket created");
	}
	static void show()
	{
		System.out.println("Current Ticket status: "+counter);
	}
	public static void ticketDetail(Ticket t)
	{
		if(t!=null)
		{
		System.out.println("Ticket ID: "+t.tId);
		}
		else
		{
			System.out.println("Limit exceeds");
		}
	}
	public static  Ticket createTicket(int tId)
	{
		if(counter<maxLimit)
		{
			return new Ticket(tId);
		}
		return null;
	}
}
public class TicketBooking {

	public static void main(String[] args)
	{
		Ticket t1=Ticket.createTicket(100);
		Ticket.ticketDetail(t1);
		Ticket t2=Ticket.createTicket(101);
		Ticket.ticketDetail(t2);
		Ticket t3=Ticket.createTicket(102);
		Ticket.ticketDetail(t3);
	}

}
