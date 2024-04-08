package Practica1;
import java.util.Scanner;

public class Teatro{
    private Show[] shows;

    public Teatro() { this.shows = new Show[0]; }

    public Show[] getShows() {
        return this.shows;
    }

    public void setShows(Show[] shows) {
        this.shows = shows;
    }
    public int countViewers() {
        int counter = 0;
        for (Show show: this.shows) {
            for (Suscriber suscriber: show.getViewers()) {
                ++counter;
            }
        }
        return counter;
    }

    public double averageAge() {
        int age = 0;
        double average = 0;
        for (Show show: this.shows) {
            for (Suscriber suscriber: show.getViewers()) {
                age+=suscriber.getAge();
            }
        }
        average = (double)age/(double)this.countViewers();
        return average;
    }
    
    public void showShows() {
    	
    	for (Show show: shows) {
    		show.showData();
    	}
    	
    }
    
    public void menu() {
    	Scanner sc = new Scanner(System.in);
    	int opt = 0;
    	while (opt != 5) {
    		System.out.println("MEN� TEATRO\n----------------------------");
        	System.out.println("1. -> A�adir espect�culo.\n2.-> Ense�ar espect�culos.\n3.-> A�adir espectador.\n4.-> Estadisticas.\n5.-> Salir.");
        	System.out.println("----------------------------");
        	System.out.println("�Cu�l opci�n desea elegir?(1-5):");
        	opt = sc.nextInt();
        	sc.nextLine();
        	switch(opt) {
        		case 1:
        			String name;
        			Show show;
        			Show[] copy = shows;
        			Suscriber[] viewers = {};
        			System.out.println("A�ADIR ESPECTACULO\n----------------------------");
        			System.out.print("\tNombre: ");
        			name = sc.nextLine();
        			System.out.println("----------------------------");
        			show = new Show(name,viewers);
        			this.shows = new Show[copy.length+1];
        			for (int i = 0; i<copy.length;i++) {
        				shows[i] = copy[i];
        			}
        			this.shows[this.shows.length-1] = show;
        	    	break;
        		case 2:
        			this.showShows();
        			break;
        		case 3:
        			int numshow;
        			Show s;
        			Suscriber[] suscribers;
        			Suscriber viewer;
        			boolean seguir=true;
        			System.out.println("A�ADIR ESPECTADORES\n----------------------------");
        			System.out.println("ESPECTACULOS DISPONIBLES: ");
        			for (int i = 0; i<this.shows.length; i++) {
        				System.out.printf("%d - %s\n",i+1,shows[i].getTitle());
        			}
        			System.out.print("�Cu�l espectaculo quiere seleccionar?: ");
        			numshow = sc.nextInt();
        			s = shows[numshow-1];
        			System.out.println("REGISTRAR ESPECTADOR:");
        			sc.nextLine();
        			while(seguir) {
        				String name_viewer, yn;
        				int id, age;
        				suscribers = new Suscriber[s.getViewers().length+1];
        				for (int i = 0; i<s.getViewers().length; i++) {
        					suscribers[i] = s.getViewers()[i];
        				}
        				System.out.print("Nombre: ");
        				name_viewer = sc.nextLine();
        				System.out.print("Edad: ");
        				age = sc.nextInt();
        				System.out.println("N�mero de abonado: ");
        				id = sc.nextInt();
        				viewer = new Suscriber(id,name_viewer,age);
        				suscribers[suscribers.length-1] = viewer;
        				s.setViewers(suscribers);
        				sc.nextLine();
        				System.out.print("�Desea registrar a otro espectador?(y/n) ");
        				yn = sc.nextLine();
        				if(yn.equals("n")) {
        					seguir = false;
        				}
        			}
        	    	break;
        		case 4:
        			System.out.printf("En este teatro ha habido un total de %d espectadores, con una edad media de %.1f a�os.",this.countViewers(),this.averageAge());
        			break;
        		case 5:
        			System.out.println("Goodbye");
        			break;
        		default:
        			System.out.printf("ERR:: La opcion %d no es v�lida.\n", opt);
        	}
    	}
    }
}