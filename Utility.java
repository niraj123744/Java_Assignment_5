package com.mypackage;

public class Utility {

	public static Object scan;

// day_of_week
		public static int dayOfWeek(int d, int m, int y) {
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}
		public static int inputInt() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
// monthly_payment
		public static double monthlyPayment(double p, double y, double r) {
			double n = 12 * y;
			double r0 = r / (12 * 100);
			double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
			return payment;
		}
		public static double inputDouble() {
			// TODO Auto-generated method stub
			return 0;
		}

		

// convert_binaryusing_binaryfunction
	public static int toDecimal(int[] binary) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static boolean isNumber(String in) {
		// TODO Auto-generated method stub
		return false;
	}
	
//temperature_conversion
	public static int temperaturConversion(int tem, char t) {
		// TODO Auto-generated method stub
		int conver;
		if (t == 'c' || t == 'C') {
			conver = (tem * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			conver = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;
		}
		return conver;
	}
	
//poweroftwo
	public int inputInteger() {
		// TODO Auto-generated method stub
		return 0;
	}
}

