package Exceptions;

public class NumeroNegativoException extends Exception {
	public NumeroNegativoException () {
		super("Las dimensiones deben ser n�meros positivos");
	}
}
