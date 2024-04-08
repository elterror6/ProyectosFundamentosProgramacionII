package Practica2;

public class Hotel extends Alojamiento {
	private static int n;
	public Hotel(String name, String address, double price) {
		super(name, address, price);
		Hotel.n++;
	}
	public static int getN() {
		return Hotel.n;
	}
	@Override
	public String toString() {
		String str = "HOTEL:\n"+super.toString();
		return str;
	}
}
