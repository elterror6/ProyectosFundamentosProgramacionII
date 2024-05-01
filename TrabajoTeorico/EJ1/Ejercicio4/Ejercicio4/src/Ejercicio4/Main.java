package Ejercicio4;
import java.util.InputMismatchException;
import java.util.Scanner;
import Exceptions.*;

public class Main {
	public static void main(String[] args) {
		try {
			Ortoedro();
		} catch (NumeroNegativoException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void Ortoedro () throws NumeroNegativoException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int longitud, anchura, altura;
		Rectangulo3D ortoedro;
		do {
			System.out.println("¿Cuál es la longitud?");
			longitud = sc.nextInt();
			if (longitud<0) throw new NumeroNegativoException();
		} while (longitud < 0 || !((Integer)longitud instanceof Integer));
		do {
			System.out.println("¿Cuál es la anchura?");
			anchura = sc.nextInt();
			if (anchura<0) throw new NumeroNegativoException();
		} while (anchura<0 || !((Integer)anchura instanceof Integer));
		do {
			System.out.println("¿Cuál es la altura?");
			altura = sc.nextInt();
			if (altura<0) throw new NumeroNegativoException();
		} while (altura<0 || !((Integer)altura instanceof Integer));
		sc.close();
		ortoedro = new Rectangulo3D(longitud,anchura,altura);
		System.out.println("El área del ortoedro es: "+ortoedro.Area()+";\nEl vólumen del ortoedro es: "+ortoedro.Volumen()+";");
	}
}
