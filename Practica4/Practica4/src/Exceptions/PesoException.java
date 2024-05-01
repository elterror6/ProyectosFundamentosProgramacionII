package Exceptions;

public class PesoException extends Exception{
	public PesoException () {
		super("**PESO** Este camión es demasiado pesado para circular por esta carretera.");
	}
}
