package com.mypackage;
import java.util.Scanner;
public class Day_of_week {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

			new Utility();
			System.out.println("Enter the date [M-D-Y]");
			System.out.println("Month:");
			int m=Utility.inputInt();
			System.out.println("Date:");
			int d=Utility.inputInt();
			System.out.println("Year:");
			int y=Utility.inputInt();
			int day=Utility.dayOfWeek(m,d,y);
			System.out.println(day);
		}

	}
	
