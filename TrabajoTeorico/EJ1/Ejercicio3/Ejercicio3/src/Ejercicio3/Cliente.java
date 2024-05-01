package Ejercicio3;

public class Cliente {
	private String nombre;
	private int nif;
	
	public Cliente (String nombre, int nif) {
		this.nombre = nombre;
		this.nif = nif;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getNif () {
		return this.nif;
	}
	
	@Override
	public String toString() {
		return "NIF: "+this.nif+"; Nombre: "+this.nombre+";\n";
	}
}
