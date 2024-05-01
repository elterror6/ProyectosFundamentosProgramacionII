package Ejercicio3;

public class Ticket {
	protected Producto[] items;
	
	public Ticket (Producto[] items) {
		this.items = items;
	}
	
	public Producto[] getItems() {
		return this.items;
	}
	
	public void setItems(Producto[] items) {
		this.items = items;
	}
	
	public double PrecioSinIVA () {
		double precio = 0;
		for (Producto p : this.items) {
			precio += p.getPrecio();
		}
		return precio;
	}
	public double PrecioConIVA ()  {
		double precio = 0;
		for (Producto p : this.items) {
			precio += p.calcularPVP();
		}
		return precio;
	}
	@Override
	public String toString() {
		String str = "";
		for (Producto p : items) {
			str+=p;
		}
		return str;
	}
}
