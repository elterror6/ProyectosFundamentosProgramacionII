package Ejercicio4;

public class Rectangulo {
	protected int longitud;
	protected int anchura;
	
	public Rectangulo(int longitud, int anchura) {
		this.longitud = longitud;
		this.anchura = anchura;
	}
	
	public int Area() {
		int area = this.longitud * this.anchura;
		return area;
	}
	public int Perimetro() {
		int perimetro = 2*this.longitud+2*this.anchura;
		return perimetro;
	}
}
