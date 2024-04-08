package OptionalFunctions;

import java.util.Scanner;

import Catalogo.Catalogo;
import JuegoRol.Combate;
import JuegoRol.Guerrero;
import JuegoRol.Mago;
import JuegoRol.Personaje;

public class Main {
	public static void main(String[] args) {
		Personaje[] c;
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("¿Cuántos personajes se van a crear? (Número par)");
			n = sc.nextInt();
		} while (n%2!=0);
		c = new Personaje[n];
		Catalogo<Personaje> cat = new Catalogo<Personaje>(c);
		Personaje[] pjs = addCharacter(cat,n);

		System.out.println(cat.toString());
		
		boolean end = false;
		do {
			end = torneo(pjs);
		} while (!end) ;
		
		System.out.println(cat.toString());
		sc.close();
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
	
	public static Personaje[] addCharacter(Catalogo<Personaje> cat, int n) {
		Scanner sc = new Scanner(System.in);
		Personaje p;
		Personaje[] pjs;
		String type, name, ans;
		int fa, lv;
		
		
		pjs = new Personaje[n];
		
		for (int i = 0; i < pjs.length; i++) {
			sc.nextLine();
			System.out.println("Nombre del personaje: ");
			name = sc.nextLine();
			System.out.println("Nivel del personaje: ");
			lv = sc.nextInt();
			sc.nextLine();
			System.out.println("¿Qué tipo de personaje quieres crear?: ");
			type = sc.nextLine();
			
			switch (type) {
				case "Guerrero":
					System.out.println("Fuerza del personaje: ");
					fa = sc.nextInt();
					sc.nextLine();
					p = new Guerrero(name,lv,fa);
					System.out.println("¿Desea añadirlo al catalogo? ");
					ans = sc.nextLine();
					switch (ans) {
						case "Si","S","si","s","Yes","Y","yes","y":
							cat.setE(p, i);
							System.out.println("Personaje añadido al catálogo.");
							break;
						case "No","N","no","n":
							break;
					}
					pjs[i] = p;
					break;
				case "Mago":
					System.out.println("Agilidad del personaje: ");
					fa = sc.nextInt();
					sc.nextLine();
					p = new Mago(name,lv,fa);
					System.out.println("¿Desea añadirlo al catalogo? ");
					ans = sc.nextLine();
					switch (ans) {
						case "Si","S","si","s","Yes","Y","yes","y":
							cat.setE(p, i);
							System.out.println("Personaje añadido al catálogo.");
							break;
						case "No","N","no","n":
							break;
					}
					pjs[i] = p;
					break;
			}
		}
		cat.avoidNullPointer();
		sc.close();
		return pjs;
	}
}
