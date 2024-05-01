package Ejercicio1;

public class Linea {
	private int id;
	private Estacion[] estaciones;
	
	public Linea(int id, Estacion[] estaciones) {
		this.id = id;
		this.estaciones = estaciones;
	}
	
	public int getId() {
		return this.id;
	}
	public Estacion[] getEstaciones() {
		return this.estaciones;
	}
	
	public void setEstaciones(Estacion[] estaciones) {
		this.estaciones = estaciones;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		String r = "Linea "+this.id+" => ";
		
		for (Estacion estacion : estaciones) {
			r += estacion.getNombre()+"; ";
		}
		
		return r;
	}
}
