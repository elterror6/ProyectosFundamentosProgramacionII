package Practica5;

public class Alumno {
	private String nombre, rama;
	private int curso;
	private double nota_media;
	private boolean beneficiario;
	
	public Alumno (String nombre, String rama, int curso, double nota_media, boolean beneficiario) {
		this.nombre = nombre;
		this.rama = rama;
		this.curso = curso;
		this.nota_media = nota_media;
		this.beneficiario = beneficiario;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRama() {
		return this.rama;
	}
	
	public int getCurso() {
		return this.curso;
	}
	
	public double getNotaMedia() {
		return this.nota_media;
	}
	
	public boolean getBeneficiario() {
		return this.beneficiario;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setRama(String rama) {
		this.rama = rama;
	}
	
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public void setNotaMedia(double nota_media) {
		this.nota_media = nota_media;
	}
	
	public void setBeneficiario(boolean beneficiario) {
		this.beneficiario = beneficiario;
	}
}
