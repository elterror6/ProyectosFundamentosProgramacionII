package Practica5;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Listado list = readFile();
		writeFile(list);
	}
	
	public static Listado readFile () {
		String filename = System.getProperty("user.dir")+"\\src\\Practica5\\Listado.txt", nombre, rama, b;
		Scanner file = null;
		boolean cnt=true, beneficiario = false;
		int n=0, curso, anio = 0;
		double nota_media;
		Alumno alumno;
		Listado list;
		
		Alumno[] alumnos = null;
		try {
			file = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			cnt = false;
		}
		if (cnt) {
			alumnos = new Alumno[countLines(file)-1];
			try {
				file = new Scanner(new File(filename));
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			anio = file.nextInt();
			while (file.hasNextLine()) {
				file.nextLine();
				nombre = file.next();
				rama = file.next();
				curso = file.nextInt();
				nota_media = file.nextDouble();
				b = file.next();
				if (b.equals("Si")) {
					beneficiario = true;
				} else {
					beneficiario = false;
				}
				alumno = new Alumno(nombre,rama,curso,nota_media,beneficiario);
				alumnos[n] = alumno;
				++n;
				
			}
		}
		list = new Listado(anio, alumnos);
		file.close();
		return list;
	}
	public static void writeFile (Listado listado) {
		String filename = System.getProperty("user.dir")+"\\src\\Practica5\\Aceptados.txt";
		PrintWriter file = null;
		Alumno[] alumnos = null;
		boolean cnt = true;
		try {
			file = new PrintWriter(filename);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			cnt = false;
		}
		if (cnt) {
			file.printf("%d\n", listado.getAnio());
			alumnos = listado.evaluar();
			for (Alumno alumno : alumnos) {
				file.printf("%s ", alumno.getNombre());
				file.printf("%s ", alumno.getRama());
				file.printf("%d ", alumno.getCurso());
				file.printf("%.1f ", alumno.getNotaMedia());
				if (alumno.getBeneficiario()) {
					file.printf("Si\n");
				} else {
					file.printf("No\n");
				}
			}
		}
		file.close();
	}
	public static int countLines (Scanner file) {
		int n = 0;
		while (file.hasNextLine()) {
			++n;
			file.nextLine();
		}
		file.close();
		return n;
	}
}
