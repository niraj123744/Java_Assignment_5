package com.mypackage;
import java.util.Scanner;
public class Monthly_payment {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
			new Utility();
			System.out.println("Enter the Principal amount:");
			double p=Utility.inputDouble();
			System.out.println("Enter the rate interest:");
			double r=Utility.inputDouble();
			System.out.println("Enter the years");
			int y=Utility.inputInt();
			Utility.monthlyPayment(p, r, y);
		}

	}
	
