package Practica4;

public class Coche extends Vehiculo{
	private int anquity;
	
	public Coche (String matricula, String marca, int anquity) {
		super(matricula,marca);
		this.anquity = anquity;
	}
	
	public int getAntiquity () {
		return this.anquity;
	}
	
	public void setAntiquity (int antiquity) {
		this.anquity = antiquity;
	}
	
	public int Velocidad (int n) {
		int velocidad = 10*n;
		return velocidad;
	}
	
	@Override
	public String toString () {
		return "COCHE:\n"+super.toString()+"Antigüedad: "+this.anquity;
	}
}
