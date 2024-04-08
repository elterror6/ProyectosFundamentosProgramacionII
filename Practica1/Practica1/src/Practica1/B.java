package Practica1;

public class B extends Category{
    private char category;
    public B(double price){
        super(price);
        this.category = super.categories[1];
    }
    public char getCategoryName() {
		return this.category;
	}
}
