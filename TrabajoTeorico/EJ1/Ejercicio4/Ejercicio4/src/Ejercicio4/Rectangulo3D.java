package Ejercicio4;

public class Rectangulo3D extends Rectangulo {
	private int altura;
	
	public Rectangulo3D (int longitud, int anchura, int altura) {
		super(longitud,anchura);
		this.altura = altura;
	}
	
	@Override
	public int Area () {
		int area = 2*(this.anchura*this.longitud + this.altura*this.longitud + this.altura*this.anchura);
		return area;
	}
	
	public int Volumen () {
		int volumen = this.altura * this.anchura * this.longitud;
		return volumen;
	}
	
}
