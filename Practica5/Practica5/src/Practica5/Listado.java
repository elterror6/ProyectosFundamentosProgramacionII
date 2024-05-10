package Practica5;

public class Listado implements IListado{
	private int anio;
	private Alumno[] listado;
	
	public Listado(int anio, Alumno[] listado) {
		this.anio = anio;
		this.listado = listado;
	}
	
	public int getAnio() {
		return this.anio;
	}
	
	public Alumno[] getListado() {
		return this.listado;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void setListado(Alumno[] listado) {
		this.listado = listado;
	}
	
	public Alumno[] evaluar() {
		Alumno[] aceptados;
		int n = 0;
		for (Alumno alumno: listado) {
			if (alumno.getCurso() > 1 && ((alumno.getRama().equals("Artes") && alumno.getNotaMedia() >= nota_min_artes) || (alumno.getRama().equals("Ciencias") && alumno.getNotaMedia() >= nota_min_ciencias) || (alumno.getRama().equals("Salud") && alumno.getNotaMedia() >= nota_min_salud) || (alumno.getRama().equals("Sociales") && alumno.getNotaMedia() >= nota_min_sociales) || (alumno.getRama().equals("Ingeniería") && alumno.getNotaMedia() >= nota_min_ingenieria)) && !alumno.getBeneficiario()) {
				++n;
			}
		}
		
		
		aceptados = new Alumno[n];
		n = 0;
		
		for (Alumno alumno: listado) {
			if (alumno.getCurso() > 1 && ((alumno.getRama().equals("Artes") && alumno.getNotaMedia() >= nota_min_artes) || (alumno.getRama().equals("Ciencias") && alumno.getNotaMedia() >= nota_min_ciencias) || (alumno.getRama().equals("Salud") && alumno.getNotaMedia() >= nota_min_salud) || (alumno.getRama().equals("Sociales") && alumno.getNotaMedia() >= nota_min_sociales) || (alumno.getRama().equals("Ingeniería") && alumno.getNotaMedia() >= nota_min_ingenieria)) && !alumno.getBeneficiario()) {
				aceptados[n] = alumno;
				++n;
			}
		}
		return aceptados;
	}
}
