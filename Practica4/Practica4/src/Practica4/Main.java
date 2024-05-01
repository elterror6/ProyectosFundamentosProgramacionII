package Practica4;

import Exceptions.AntiguoException;
import Exceptions.CilindradaException;
import Exceptions.PesoException;
import Exceptions.VelocidadException;

public class Main {

	public static void main(String[] args) throws VelocidadException, AntiguoException, PesoException, CilindradaException {
		Vehiculo v;
		Vehiculo[] vs = new Vehiculo[7];
		
		Carretera c = new Carretera(3);
		
		v = new Coche("1111AAA","Citroen",12);
		vs[0] = v;
		
		v = new Camion("2222BBB","Mercedes",17000);
		vs[1] = v;
		
		v = new Moto("3333CCC","Yamaha",500);
		vs[2] = v;
		
		v = new Camion("4444DDD","Vieco",13000);
		vs[3] = v;
		
		v = new Coche("5555EEE","Ford",19);
		vs[4] = v;
		
		v = new Moto("6666FFF","Vespa",125);
		vs[5] = v;
		
		v = new Coche("7777GGG","Peugeot",8);
		vs[6] = v;
		
		c.setInfracciones(vs);
	}

}
