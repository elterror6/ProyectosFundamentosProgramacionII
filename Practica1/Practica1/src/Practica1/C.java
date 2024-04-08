package Practica1;

public class C extends Category{
    private char category;
    public C(double price){
        super(price);
        this.category = super.categories[2];
    }
    public char getCategoryName() {
		return this.category;
	}
}
