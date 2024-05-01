package Ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Estacion atocha = new Estacion("Atocha");
		Estacion est_arte = new Estacion("Estación del Arte");
		Estacion ant_martin = new Estacion("Antón Martín");
		Estacion tirso = new Estacion("Tirso de Molina");
		Estacion sol = new Estacion("Sol");
		Estacion granvia = new Estacion("Gran Vía");
		Estacion tribunal = new Estacion("Tribunal");
		Estacion stdomingo = new Estacion("Santo Domingo");
		Estacion opera = new Estacion("Ópera");
		Estacion sevilla = new Estacion("Sevilla");
		Estacion bancoesp = new Estacion("Bando de España");
		Estacion retiro = new Estacion("Retiro");
		Estacion plzesp = new Estacion("Plaza de España");
		Estacion callao = new Estacion("Callao");
		Estacion lavapies = new Estacion("Lavapiés");
		Estacion embajadores = new Estacion("Embajadores");
		
		Linea linea1, linea2, linea3;
		
		Estacion[] estaciones1 = {atocha,est_arte,ant_martin,tirso,sol,granvia,tribunal};
		linea1 = new Linea(1, estaciones1);
		
		Estacion [] estaciones2 = {stdomingo,opera,sol,sevilla,bancoesp,retiro};
		linea2 = new Linea(2, estaciones2);
		
		Estacion [] estaciones3 = {plzesp,callao,sol,lavapies,embajadores};
		linea3 = new Linea(3, estaciones3);
		
		Linea[] lineas = {linea1,linea2,linea3};
		
		menu(lineas);
		
	}
	
	public static void menu(Linea[] lineas) {
		int opt, linea;
		String est;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.- Buscar línea de metro.\n2.- Buscar estación.\n3.- Salir");
			System.out.println("¿Qué opción desea escoger?: ");
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					System.out.println("¿Qué línea desea buscar? (1 - "+lineas.length+"): ");
					linea = sc.nextInt();
					System.out.println("Info. : \n\t"+lineas[linea-1]);
					break;
				case 2:
					sc.nextLine();
					System.out.println("¿Qué estación desea buscar?: ");
					est = sc.nextLine();
					System.out.println("Las estaciones están disponibles en las siguientes lineas: ");
					for (Linea l : lineas) {
						for (int i = 0; i <  l.getEstaciones().length; i++) {
							if (est.equals(l.getEstaciones()[i].getNombre())) {
								if (i-1 <= 0) {
									System.out.println("\t*Linea "+l.getId()+": Estación anterior: NaN, Estación siguiente: "+l.getEstaciones()[i+1]);
								} else if (i+1 >= l.getEstaciones().length) {
									System.out.println("\t*Linea "+l.getId()+": Estación anterior: "+ l.getEstaciones()[i-1]+", Estación siguiente: NaN");
									
								} else {
									System.out.println("\t*Linea "+l.getId()+": Estación anterior: "+l.getEstaciones()[i-1]+", Estación siguiente: "+l.getEstaciones()[i+1]);
								}
							}
						}
					}
					break;
				case 3:
					System.out.println("\nGoodbye.");
					break;
				default:
					System.out.println("ERR:: Opción no válida.");
			}
		} while (opt < 3);
	}
}