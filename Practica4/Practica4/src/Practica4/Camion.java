package Practica4;

public class Camion extends Vehiculo{
	private double peso;
	
	public Camion(String matricula, String marca, double peso) {
		super(matricula,marca);
		this.peso = peso;
	}
	
	public double getPeso () {
		return this.peso;
	}
	
	public void setPeso (double peso) {
		this.peso = peso;
	}
	
	public int Velocidad (int n) {
		int velocidad = 10*n;
		return velocidad;
	}
	
	@Override
	public String toString () {
		return "CAMIÓN:\n"+super.toString()+"Peso: "+this.peso;
	}
}
