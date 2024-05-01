package Ejercicio3;

public class Factura extends Ticket {
	private Cliente comprador;
	
	public Factura (Producto[] items, Cliente comprador) {
		super(items);
		this.comprador = comprador;
	}
	
	public Cliente getComprador () {
		return this.comprador;
	}
	
	public void setComprador (Cliente comprador) {
		this.comprador = comprador;
	}
	
	public double aplicarDescuento(double descuento) {
		double pcd = super.PrecioConIVA() - (super.PrecioConIVA()*descuento);
		return pcd;
	}
	@Override
	public String toString() {
		return "----------------------\n"+this.comprador+"Productos: \n"+super.toString()+"----------------------\n";
	}
}
