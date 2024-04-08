package Catalogo;
import JuegoRol.Personaje;
public class Catalogo<E> {
	private E catalog[];
	private int size;
	
	public Catalogo(E[] catalog) {
		this.catalog = catalog; 
		this.size = this.catalog.length;
	}
	
	public E[] getCatalog() {
		return this.catalog;
	}
	
	public E getE(int n) {
		return this.catalog[n];
	}
	public int getSize() {
		return this.size;
	}
	public void setCatalog(E[] catalog) {
		this.catalog = catalog;
	}
	
	public void setE(E e, int n) {
		this.catalog[n] = e; 
	}
	
	public void setSize() {
		this.size = this.catalog.length;
	}
	
	public void avoidNullPointer () {
		Object[] aux;
		int n = 0, m = 0;
		for (int i = 0; i < this.size; i++) {
			if (this.catalog[i] != null) {
				++n;
			}
		}
		
		aux = new Object[n];
		
		for (int i = 0; i < this.size; i++){
			if (this.catalog[i] != null) {
				aux[m] = this.catalog[i];
				++m;
			}
		}
		
		this.setCatalog((E[])aux);
		this.setSize();
	}
	
	@Override
	public boolean equals(Object o) {
		boolean eq = false;
		for (E e: catalog) {
			if (o == e) {
				eq = true;
				break;
			} else if (o != null) {
				Personaje aux = (Personaje) o;
				if (((Personaje) e).getNombre().equals(aux.getNombre())) {
					eq = true;
					break;
				}
			}
		}
		return eq;
	}
	
	@Override
	public String toString () {
		String catalog = "\n";
		for (int i = 0; i < this.size; i++) {
			catalog += "["+ this.catalog[i].toString() +"]\n";
		}
		return catalog;
	}
}