package JuegoRol;

public class Combate {
	private Personaje[] personajes = new Personaje[2];
	private static int r = 0;
	
	public Combate(Personaje p1, Personaje p2) {
		this.personajes[0] = p1;
		this.personajes[1] = p2;
		++r;
	}
	
	public Personaje[] getPersonajes() {
		return this.personajes;
	}
	public void setPersonajes(Personaje[] personajes) {
		this.personajes = personajes;
	}
	
	public boolean turno(Personaje atacante, Personaje atacado) {
		boolean end=false;
		if (atacante instanceof Guerrero) {
			System.out.println(atacante.getNombre()+" ataca a "+atacado.getNombre()+" infligiendo "+atacante.ataque()+" puntos de daño.");
		} else {
			System.out.println(atacante.getNombre()+" lanza un hechizo a "+atacado.getNombre()+" causando "+atacante.ataque()+" puntos de daño.");
		}
		atacado.setPV(atacado.getPV()-atacante.ataque());
		if (atacado.getPV()<=0) {
			end = true;
		}
		return end;
	}
	public void ronda() {
		boolean win=false;
		double pv1 = personajes[0].getPV();
		double pv2 = personajes[1].getPV();
		System.out.println(this);
		System.out.println("\n"+this.personajes[0].getNombre()+" vs "+this.personajes[1].getNombre());
		do {
			win = this.turno(personajes[0], personajes[1]);
			if (win) {
				break;
			}
			win = this.turno(personajes[1], personajes[0]);
		} while (!win);
		for (Personaje personaje : personajes) {
			if(personaje.getPV()>0) {
				System.out.println(personaje.getNombre()+" a ganado "+ICombate.pe_winner+" puntos de experiencia y es nivel "+personaje.getNivel()+".");
				personaje.setPE(ICombate.pe_winner);
			} else {
				System.out.println(personaje.getNombre()+" a ganado "+ICombate.pe_losser+" puntos de experiencia y es nivel "+personaje.getNivel()+".");
				personaje.setPE(ICombate.pe_losser);
			}
		}
		System.out.print("\nGanador: ");
		for (int i = 0 ; i < personajes.length ; i++) {
			if (personajes[i].getPV()>0) {
				System.out.println(personajes[i].getNombre());
				if (i == 0) {
					personajes[i].setPV(pv1);
				} else {
					personajes[i].setPV(pv2);
				}
			}
		}
		System.out.println("____________________\n\n------------------------------------------\n");
	}
	
	@Override
	public String toString() {
		return "Ronda "+r+"\n------------------------------------------\nCombatiente 1: "+this.personajes[0]+"\nCombatiente 2: "+this.personajes[1]+"\n";
	}
}
