package Ejercicio3;

public class Producto {
	private int codigo;
	private double precio;
	private int impuestos;
	
	public Producto(int codigo, double precio, int impuestos) {
		this.codigo = codigo;
		this.precio = precio;
		this.impuestos =  impuestos;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public double getPrecio() {
		return this.precio;
	}
	public int getImpuestos() {
		return this.impuestos;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setImpuestos(int impuestos) {
		this.impuestos = impuestos;
	}
	public double calcularPVP() {
		double PVP = this.precio+(this.precio*this.impuestos);
		return PVP;
	}
	public String toString() {
		return "Código: "+this.codigo+"; Precio: "+this.precio+"; Impuestos: "+this.impuestos+";\n";
	}
}
