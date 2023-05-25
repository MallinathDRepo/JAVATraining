package com.dateDemo;

import java.util.*;
import com.DateOperation.MyDate;
import com.Utility.DateUtility;

public class Entry {
	public static void main(String args[]) {
		
		// Accept date from user
		Scanner sc = new Scanner(System.in);
		int date, month, year; 
		System.out.print("Enter Date: ");
		date=sc.nextInt();
		
		System.out.print("Enter Month: ");
		month=sc.nextInt();
		
		System.out.print("Enter Year: ");
		year=sc.nextInt();
		
		//send date to MyDate to validate
		MyDate d = new MyDate(date, month, year);
		
		//Print the valid date
		if(d.getDay()<10 && d.getMonth()<10)
			System.out.println("Your valid date is : "+d.getDay()+"/0"+d.getMonth()+"/"+d.getYear());
		else
			System.out.println("Your valid date is : "+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
		
		int mon = d.getMonth();
		boolean leap = DateUtility.LeapYear(year);

		if (mon == 4 || mon == 6 || mon == 9 || mon == 11)
		{
			System.out.println("Month is of 30 Days");
		}
		else if (mon==2 && leap==true)
		{
			System.out.println("Month is of 29 Days & is LEAP year");
		}
		else
			System.out.println("\nMonth is of 31 Days");
		
		sc.close();
	}
}