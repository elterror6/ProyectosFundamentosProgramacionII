package Practica1;

public class Suscriber{
    private int id;
    private Category category;
    private String name;
    private int age;

    public Suscriber(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.setCategory();
    }

    public int getId(){
        return this.id;
    }
    public Category getCategory(){
        return this.category;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setId(int id){
        this.id = id;
    }
    private void setCategory(){
        double a = 10.00, b = 20.00, c = 15.00, discount = 0.25;
        if (this.id < 50) {
            if (this.age < 18) {
            	this.category = new A(a-(a*discount));
            } else if ((18 < this.age) && (this.age < 65)) {
            	this.category = new B(b-(b*discount));
            } else {
            	this.category = new C(c-(c*discount));
            }        
        } else {
            if (this.age < 18) {
                this.category = new A(a);
            } else if ((18 < this.age) && (this.age < 65)) {
                this.category = new B(b);
            } else {
                this.category = new C(c);
            }
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}