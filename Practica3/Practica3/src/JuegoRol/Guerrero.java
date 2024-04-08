package JuegoRol;

public class Guerrero extends Personaje {
	private int fuerza;
	public Guerrero(String nombre, int nivel, int fuerza) {
		super(nombre, nivel);
		this.fuerza=fuerza;
	}
	
	public double ataque() {
		double damage = this.nivel + (this.fuerza*0.8);
		return damage;
	}
	
	public void setFuerza(int fuerza) {
		this.fuerza=fuerza;
	}
	public int getFuerza() {
		return this.fuerza;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Fuerza: "+this.fuerza;
	}
}
