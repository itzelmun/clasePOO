package Usos;

public class Alumno implements Persona{
 
	private int id;
	private String nombre;
	private String semestre;

	
	public Alumno() {
	this.id = 1;
	this.nombre = "Itzel Munguia";
	this.semestre = "Quinto";
	}
	
	//sobrecarga de constructores
	public Alumno(int id, String nombre, String semestre) {
		this.id=id;
		this.nombre= nombre;
		this.semestre=semestre;
		
	}
	
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", semestre=" + semestre + "]";
	}




	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno saluda");
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno camina");
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno habla");
	}

	@Override
	public void sentar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno sienta");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Alumno come");
	}
	
}
