package com.jsp.constructor.injection;

public class Pen {
	private String name;
	private double price;
	private String colour;

	public Pen(String name, double price, String colour) {
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	
	public void printPenDetails() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(colour);
	}
}
