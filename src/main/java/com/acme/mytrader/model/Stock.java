package com.acme.mytrader.model;

public class Stock {

	private String security;
	private double price;
	private int valuem = 1;
	

	public Stock(String security, double price) {		
		this.security = security;
		this.price = price;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getValuem() {
		return valuem;
	}


	@Override
	public String toString() {
		return "Stock [security=" + security + ", price=" + price + ", valuem=" + valuem + "]";
	}

}
