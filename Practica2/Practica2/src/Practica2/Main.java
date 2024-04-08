package Practica2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		Alojamiento[] alojamientos = new Alojamiento[7];
		Alojamiento aloj;
		
		aloj = new Hotel("Campanile","Rue Moulin, 32",115);
		alojamientos[0] = aloj;
		
		aloj = new Apartamento("Garderobe","Rue de l'Ouest, 43",88);
		alojamientos[1] = aloj;
		
		aloj = new Hotel("Eiffel","Avenue des Princes, 71",143);
		alojamientos[2] = aloj;
		
		aloj = new Hotel("Chevalier","Rue Oudinot, 59",95);
		alojamientos[3] = aloj;

		aloj = new Apartamento("Porte de Versailles","Avenue de Javel, 33",120);
		alojamientos[4] = aloj;

		aloj = new Apartamento("Montrouge","Rue Perier, 128",116);
		alojamientos[5] = aloj;
		
		aloj = new Hotel("Felicien","Avenue Letellier, 87",163);
		alojamientos[6] = aloj;
		System.out.println("Bienvenido a nuestro buscador de alojamientos en Par�s. Actualmente disponemos de "+ Hotel.getN() +" hoteles y "+Apartamento.getN()+" apartamentos. �Qu� quieres consultar?");
		System.out.println("1.- Hoteles");
		System.out.println("2.- Apartamentos");
		System.out.println("3.- Ver todo");
		System.out.println("4.- Quiero buscar un sitio concreto");
		
		opt = sc.nextInt();
		
		switch (opt) {
			case 1:
				System.out.println("Mostrando hoteles ...");
				for(Alojamiento alojamiento: alojamientos) {
					if (alojamiento instanceof Hotel) {
						System.out.println(alojamiento);
					}
				}
				break;
			case 2:
				System.out.println("Mostrando apartamentos ...");
				for (Alojamiento alojamiento: alojamientos) {
					if (alojamiento instanceof Apartamento) {
						System.out.println(alojamiento);
					}
				}
				break;
			case 3:
				System.out.println("Mostrando hoteles y apartamentos ...");
				for (Alojamiento alojamiento: alojamientos) {
					System.out.println(alojamiento);
				}
				break;
			case 4:
				String name, address;
				boolean found=false;
				Alojamiento al;
				sc.nextLine();
				System.out.print("Perfecto. �C�mo se llama el alojamiento al que quieres ir?: ");
				name = sc.nextLine();
				System.out.print("�Y cu�l es la direcci�n?: ");
				address = sc.nextLine();
				al = new Alojamiento(name,address);
				for (Alojamiento alojamiento: alojamientos) {
					if(al.equals(alojamiento)) {
						found = true;
						System.out.println("�Lo tenemos! Este es el alojamiento que estabas buscando: ");
						System.out.println(alojamiento);
					}
				}
				if (!found) {
					System.out.println("Lo sentimos. Este alojamiento no est� disponible en nuestra web.");
				}
				break;
			default:
				System.out.println("ERR:: Opci�n no v�lida.");
		}
		sc.close();
	}

}