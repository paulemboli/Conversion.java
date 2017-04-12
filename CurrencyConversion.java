package Review.java;

import java.util.Scanner;

public class CurrencyConversion {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double pesosToDollars = 0.0544;
		double quetzalToDollars = 0.1305;
		double colonToDollars = 0.1144;
		double usDollars = 0.0;
		
		double mPesos = 0.0;
		double gQuetzal = 0.0;
		double sColon = 0.0;
		
		System.out.println("Enter number of Mexican Pesos: ");
		
		mPesos = scnr.nextInt();
		
		double mexicanPeson = 0;
		
		mPesos = (mexicanPeson * pesosToDollars);
		
		
	}

}
