package JuegoRol;

public class Mago extends Personaje {
	private int agilidad;
	public Mago(String nombre, int nivel, int agilidad) {
		super(nombre,nivel);
		this.agilidad=agilidad;
	}
	
	public double ataque() {
		double damage = this.nivel + (this.agilidad*0.6);
		return damage;
	}
	
	public void setAgilidad(int agilidad) {
		this.agilidad=agilidad;
	}
	public int getAgilidad() {
		return this.agilidad;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Agilidad: "+this.agilidad;
	}
}
