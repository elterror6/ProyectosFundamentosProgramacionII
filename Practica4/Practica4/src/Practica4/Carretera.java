package Practica4;
import Exceptions.*;
import java.util.Random;

public class Carretera implements ICarretera {
	Vehiculo[] infracciones;
	
	public Carretera (int limInf) {
		this.infracciones = new Vehiculo[limInf];
	}
	
	public void setInfracciones (Vehiculo[] vs) {
		int i = 0;
		for (Vehiculo v : vs) {
			try {
				radarVelocidad(v);
			} catch (VelocidadException e) {
				try {
					System.out.println(e.getMessage());  
					infracciones[i] = v;
					++i;
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("\n/// Se ha superado el límite de infracciones por velocidad en esta carretera. Se cierra la circulación.");
					System.exit(0);
				}
				try {
					evalVehiculo(v);
				} catch (AntiguoException exception) {
					System.out.println(exception.getMessage());
				} catch (PesoException exception) {
					System.out.println(exception.getMessage());
				} catch (CilindradaException exception) {
					System.out.println(exception.getMessage());
				}
			}
			System.out.println();
		} 
	}
	
	public void radarVelocidad (Vehiculo v) throws VelocidadException, ArrayIndexOutOfBoundsException {
		Random r = new Random();
		int velocidad = v.Velocidad(r.nextInt(20)+1);
		System.out.println(v+"\nVelocidad: "+velocidad+" km/h");
		if (v instanceof Coche) {
			if (velocidad < min_vel) {
				throw new VelocidadException("**VELOCIDAD** Este vehiculo circula a una velocidad demasiado baja.");
			} else if (velocidad > max_vel_coche) {
				throw new VelocidadException("**VELOCIDAD** Ha superado la velocidad máxima permitida para este tipo de vehiculo.");
			} else {
				System.out.println("--Velocidad correcta. No se solicita más información.");
			}
		} else if (v instanceof Camion) {
			if (velocidad < min_vel) {
				throw new VelocidadException("**VELOCIDAD** Este vehiculo circula a una velocidad demasiado baja.");
			} else if (velocidad > max_vel_camion) {
				throw new VelocidadException("**VELOCIDAD** Ha superado la velocidad máxima permitida para este tipo de vehiculo.");
			} else {
				System.out.println("--Velocidad correcta. No se solicita más información.");
			}
		} else if (v instanceof Moto) {
			if (velocidad < min_vel) {
				throw new VelocidadException("**VELOCIDAD** Este vehiculo circula a una velocidad demasiado baja.");
			} else if (velocidad > max_vel_moto) {
				throw new VelocidadException("**VELOCIDAD** Ha superado la velocidad máxima permitida para este tipo de vehiculo.");
			} else {
				System.out.println("--Velocidad correcta. No se solicita más información.");
			}
		}
	}
	
	public void evalVehiculo (Vehiculo v) throws AntiguoException,PesoException,CilindradaException {
		if (v instanceof Coche) {
			if (((Coche) v).getAntiquity() > 15) {
				throw new AntiguoException();
			} else {
				System.out.println("--No se han detectado más infracciones en este vehiculo.");
			}
		} else if (v instanceof Camion) {
			if (((Camion) v).getPeso() > 15000) {
				throw new PesoException();
			} else {
				System.out.println("--No se han detectado más infracciones en este vehiculo.");
			}
		} else if (v instanceof Moto) {
			if (((Moto) v).getCilindrada() < 250) {
				throw new CilindradaException();
			} else {
				System.out.println("--No se han detectado más infracciones en este vehiculo.");
			}
		}
	}
	
}
