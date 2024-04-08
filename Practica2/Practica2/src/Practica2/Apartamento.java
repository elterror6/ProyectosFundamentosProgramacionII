package Practica2;

public class Apartamento extends Alojamiento {
	private static int n;
	public Apartamento(String name, String address, double price) {
		super(name, address, price);
		Apartamento.n++;
	}
	
	public static int getN() {
		return Apartamento.n;
	}
	@Override
	public String toString() {
		String str = "APARTAMENTO:\n"+super.toString();
		return str;
	}
}
