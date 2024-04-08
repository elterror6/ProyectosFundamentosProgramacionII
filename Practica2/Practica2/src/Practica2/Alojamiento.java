package Practica2;

public class Alojamiento {
	protected String name;
	protected String address;
	protected double price;
	
	public Alojamiento(String name, String address, double price) {
		this.name = name;
		this.address = address;
		this.price = price;
	}
	public Alojamiento(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPrice(double price) {
		this.price =  price;
	}
	
	@Override
	public String toString() {
		String str = "\t Nombre: " + this.name + "; Direcci�n: "+ this.address+"; Precio/noche: "+this.price;
		return str;
	}
	@Override
	public boolean equals(Object o) {
		boolean eq=false;
		if (o == this) {
			eq = true;
		} else if (o != null) {
			Alojamiento aux = (Alojamiento) o; 
			if (name.equals(aux.name) && address.equals(aux.address)) {
				eq = true;
			}
		}
		return eq;
	}
}
