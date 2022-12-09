package Usos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//se hace una instancia de un ArrayList
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		
		// se hacen las instancias 
		Alumno alumno = new Alumno();
	//	System.out.println(alumno);
		
		Alumno alumnoUno = new Alumno(3,"itzeliwis","Cuarto");
	//	System.out.println(alumnoUno);
	listaAlumnos.add(alumno);
	listaAlumnos.add(alumnoUno);
	
	for(Alumno alu: listaAlumnos) {
		System.out.println(alu);
	}
		Profesor profesor = new Profesor();
	//	profesor.caminar();
	//	profesor.comer();
	//	profesor.hablar();
	//	profesor.saludar();
	//	profesor.sentar();
		
	}
	
		
}


