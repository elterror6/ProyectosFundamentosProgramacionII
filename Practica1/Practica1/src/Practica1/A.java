package Practica1;

public class A extends Category{
	private char category;
	public A(double price) {
		super(price);
		this.category = super.categories[0];
	}
	public char getCategoryName() {
		return this.category;
	}
}
