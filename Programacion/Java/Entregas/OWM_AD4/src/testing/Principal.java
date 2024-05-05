package testing;

import modelo.javabean.AbstractPersona;
import modelo.javabean.Administrativo;
import modelo.javabean.Alumno;
import modelo.javabean.Profesor;

public class Principal {

	public static void main(String[] args) {
		
		AbstractPersona profAbs1 = new Profesor("3334", "Manuel", "Avenida Calamar 27", "663778902", "Ciencias e Inglés");
		AbstractPersona alumAbs1 = new Alumno("3335", "Lucía", "Avenida Calamar 28", "663778002", "4ESO");
		AbstractPersona adminAbs1 = new Administrativo("3336", "Ramón", "Avenida Calamar 29", "663778345", "Controlar asistencia");
		
		System.out.println("-- Ejecuta el método toString() sobre cada uno de ellos.");
		
		System.out.println(profAbs1.toString());
		System.out.println(alumAbs1.toString());
		System.out.println(adminAbs1.toString());

		System.out.println("-- Ejecuta el método trabajar() sobre cada uno de ellos.");
		
		System.out.println(profAbs1.trabajar());
		System.out.println(alumAbs1.trabajar());
		System.out.println(adminAbs1.trabajar());
		
		System.out.println("-- Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.");
		
		System.out.println(alumAbs1.llamar(profAbs1));
		
		System.out.println("-- Ejecuta el método ponerNotas() del objeto Profesor.");
		
		System.out.println(((Profesor)profAbs1).ponerNotas());
		
		System.out.println("-- Ejecuta el método hacerExamen() del objeto Alumno.");
		
		System.out.println(((Alumno)alumAbs1).hacerExamen());
		
		System.out.println("-- Ejecuta el método gestionarMatricula() del objeto Administrativo.");
		
		System.out.println(((Administrativo)adminAbs1).gestionarMatricula());
	}
}
