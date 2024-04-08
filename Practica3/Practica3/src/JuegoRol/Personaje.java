package JuegoRol;

public abstract class Personaje implements ICombate{
	protected String nombre;
	protected int nivel;
	protected double pv;
	protected int pe;
	
	public Personaje(String nombre, int nivel) {
		this.nombre=nombre;
		this.nivel=nivel;
		this.setPV();
		this.pe=0;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setNivel(int nivel) {
		this.nivel=nivel;
	}
	public void setPV() {
		this.pv=50+(this.nivel*2);
	}
	public void setPV(double pv) {
		this.pv=pv;
	}
	public void setPE(int pe) {
		if((this.pe+pe)>=100) {
			++this.nivel;
			this.pe=(this.pe+pe)-100;
		} else {
			this.pe+=pe;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getNivel() {
		return this.nivel;
	}
	public double getPV() {
		return this.pv;
	}
	public int getPE() {
		return this.pe;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.nombre+", Nivel: "+this.nivel+", PV: "+this.pv+", PE: "+this.pe;
	}
}
