package JuegoRol;

public class Main {

	public static void main(String[] args) {
		Personaje[] personajes = new Personaje[8];
		
		Guerrero g;
		Mago m;
		
		g = new Guerrero("Thorin",5,20);
		m = new Mago("Gandalf",7,10);
		
		personajes[0] = g;
		personajes[1] = m;
		
		g = new Guerrero("Aragorn",6,60);
		m = new Mago("Saruman",6,50);
		
		personajes[2] = g;
		personajes[3] = m;
		
		g = new Guerrero("Legolas",7,40);
		m = new Mago("Pimenton",7,50);
		
		personajes[4] = g;
		personajes[5] = m;
		
		g = new Guerrero("Gimli",8,70);
		m = new Mago("Radagast",5,30);
		
		personajes[6] = g;
		personajes[7] = m;
		
		boolean end = false;
		do {
			end = torneo(personajes);
		} while (!end) ;
		
	}
	
	public static boolean torneo(Personaje[] personajes) {
		Personaje[] personajes_vivos;
		Combate combate;
		int n=0;
		boolean end = false;
		for (Personaje personaje : personajes) {
			if (itsAlive(personaje)) {
				n++;
			}
		}
		personajes_vivos = new Personaje[n];
		int iteration = 0;
		for (Personaje personaje : personajes) {
			if (itsAlive(personaje)) {
				personajes_vivos[iteration] = personaje;
				iteration++;
			}
		}
		if (personajes_vivos.length > 1) {
			for (int i = 0 ; i < personajes_vivos.length ; i+=2) {
				combate = new Combate(personajes_vivos[i],personajes_vivos[i+1]);
				combate.ronda();
			}
		} else {
			end = true;
			System.out.println("El campeón del torneo es: "+personajes_vivos[0].getNombre());
		}
		return end;
	}
	
	public static boolean itsAlive(Personaje personaje) {
		boolean itsalive = false;
		if (personaje.getPV()>0) {
			itsalive = true;
		}
		return itsalive;
	}
}
