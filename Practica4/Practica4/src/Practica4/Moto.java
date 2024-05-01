package Practica4;

public class Moto extends Vehiculo{
	private double cilindrada;
	
	public Moto(String matricula, String marca, int cilindrada) {
		super(matricula,marca);
		this.cilindrada = cilindrada;
	}
	
	public double getCilindrada () {
		return this.cilindrada;
	}
	
	public void setPeso (int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public int Velocidad (int n) {
		int velocidad = 10*n;
		return velocidad;
	}
	
	@Override
	public String toString () {
		return "MOTO:\n"+super.toString()+"Cilindrada: "+this.cilindrada;
	}
}
