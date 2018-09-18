package com.nucleus.mains;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.annotation.Generated;

import com.nucleus.POJO.Vendor;

public class DriverVendor {
	
	static Vendor vendor = new Vendor();

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		

		/*for (int i = 0; i < 4; i++) {*/
			/*vendor = new Vendor();*/
			System.out.println("Enter Vendor details: ");
			//vendor.setVendorID(i + 1);
			System.out.println("Vendor ID: " + (vendor.getVendorID() + 1));
			
			System.out.print("Vendor name: ");
			//in.nextLine();
			vendor.setVendorName(in.nextLine());
			System.out.print("Contract's starting date (DD-MM-YYYY): ");
			vendor.setContractStartDate(in.nextLine());
			System.out.print("Contract's ending date (DD-MM-YYYY): ");
			vendor.setContractEndDate(in.nextLine());
			System.out.print("Customer name: ");
			vendor.setCustomerName(in.nextLine());
//			break;
		
		/*The query to show the total time of the
		contract the respective vendor has alloted.*/
		System.out.print("Enter vendor's name to show details "
				+ "and the date from which you have to search the remaining contract:");
		getDetails(in.next(), in.next());
		
		in.close();
	}
	
	public static void getDetails(String vendorName, String ramainingDate)	{
		//System.out.println(vendorName);
		long totalDays = 0;
		SimpleDateFormat myFormat = new SimpleDateFormat("DD-MM-YYYY");
		
		//System.out.println(vendorName);

		if(vendor.getVendorName().equalsIgnoreCase(vendorName))	{
			
			/*Date startingDate = new Date();
			Date expiringDate = new Date();*/
			
			try {
				Date startingDate = myFormat.parse(vendor.getContractStartDate());
				Date expiringDate = myFormat.parse(vendor.getContractEndDate());
				Date remainigDays = myFormat.parse(ramainingDate);
				
				totalDays = expiringDate.getTime() - startingDate.getTime();
				int days = (int) TimeUnit.DAYS.convert(totalDays, TimeUnit.MILLISECONDS) ;
				float left =  (expiringDate.getTime() - remainigDays.getTime()) / 30;
				
				System.out.println("Total tenure of the contract is " + days
						+ "days.\nThe remaining contract is  " + (float)left + " months.");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}		
		
	}

}
