package Usos;

public class Profesor implements Persona{
	 private int id;
	 private String nombre;
	 private String semestre;
	 
	 
	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("Profesor saluda");
	}
	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("Profesor camina");
	}
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Profe habla");
	}
	@Override
	public void sentar() {
		// TODO Auto-generated method stub
		System.out.println("Profe se sienta");
	}
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Profe come");
	}
	 
}
