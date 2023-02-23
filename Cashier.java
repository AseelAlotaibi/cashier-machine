package uqu.oop.aseel;

import java.util.ArrayList;

public class Cashier {
	
	private String name;
	private ArrayList<Invoice> invoices = new ArrayList<Invoice>();
	
	public Cashier(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}
	
	public void showCashierInvoices() {
		int index = 1;
		System.out.println("Cashier name: " + name);
		
		for (Invoice invoice : invoices) 
		{
			System.out.println("\n\n=============|Invoice " + index + "|=============");
			invoice.displayInvoice();
			System.out.println("===========|Invoice " + index + " END" + "|===========");
			index++;
		}
		
		System.out.println("\n\n===End of all " + name + " Invoices===\n\n");
	}

	public String toString() {
		return "Cashier " + name;
	}
	
}
