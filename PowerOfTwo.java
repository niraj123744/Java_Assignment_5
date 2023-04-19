package com.mypackage;

import java.lang.*;
import java.util.Scanner;

public class PowerOfTwo {

		public static void main(String args[]) {
			int number;
			PowerOfTwo powerOfTwo = new PowerOfTwo();

			do {
				System.out.println("Enter Number (N):");
				number = new Utility().inputInteger();
			} while (!powerOfTwo.checkNumberLessthen31(number));
			powerOfTwo.printPowerOfTwo(number);
		}

		// check Number Less then 31
		public boolean checkNumberLessthen31(int number) {
			if (number > 31)
				return false;
			else
				return true;
		}

		// Power of 2 table Print
		public void printPowerOfTwo(int number) {
			for (int i = 0; i < number; i++) {
				System.out.println("2 ^ " + i + " " + Math.pow(2, i));

			}
		}
	}

