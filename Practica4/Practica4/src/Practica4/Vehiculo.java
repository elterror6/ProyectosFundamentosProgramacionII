package Practica4;

public abstract class Vehiculo {
	protected String matricula;
	protected String marca;
	
	public Vehiculo (String matricula, String marca) {
		this.matricula = matricula;
		this.marca = marca;
	}
	
	public String getMatricula () {
		return this.matricula;
	}
	public String getMarca () {
		return this.marca;
	}
	
	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public abstract int Velocidad (int n);
	
	@Override
	public String toString () {
		return "Matrícula: "+this.matricula+"; Marca: "+this.marca+"; ";
	}
}
