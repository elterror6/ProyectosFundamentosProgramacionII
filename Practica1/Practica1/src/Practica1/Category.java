package Practica1;

public abstract class Category {
	protected double price;
	protected final char[] categories = { 'A' , 'B' , 'C' };
	public Category(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	public abstract char getCategoryName();
}
