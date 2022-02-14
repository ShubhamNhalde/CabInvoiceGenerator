package com.bridgelabz.cabinvoicegenerator;

public class CalculateFare {

	final int COSTPERKM = 10;
	final int COSTPERMIN = 1;
	final int MINFARE = 5;

	public static void main(String[] args) {
		CalculateFare cabInvoiceGenerator = new CalculateFare();
		System.out.println(cabInvoiceGenerator.calculateFare(5, 20) + " Rs");
	}

	public double calculateFare(double distance, double time) {
		double fare = COSTPERKM * distance + COSTPERMIN * time;
		if (fare > MINFARE) return fare; 
		else return MINFARE;
	}

}
