package de.demmer.dennis;

public class Item {
	
	
	private double price;
	
	static int amountofItems;
	
	
	
	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0.99;
			System.out.println("Achtung Preis ist unter 0. Item wurde auf 99cent gesetzt");
		} else {
			this.price = price;
		}
	}
	
	
	public double getPrice(){
		return price;
	}
	

}
