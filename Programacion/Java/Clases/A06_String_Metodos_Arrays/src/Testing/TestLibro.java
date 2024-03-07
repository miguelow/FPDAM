package Testing;

import java.util.ArrayList;
import Ejercicios.Libro;

public class TestLibro {

	public static void main(String[] args) {
		
		ArrayList<Libro> libros = new ArrayList<>();
		
		//Añadir libros
		libros.add(new Libro(
			1L,
			"Deportes para todos",
			"Pepe el autor",
			"Planeta", 
			10,
			500
		));
		libros.add(new Libro(
			2L,
			"El mejor titulo del mundo",
			"Pepe el autor",
			"Planeta", 
			10,
			500
		));
		
		//Leer todos los libros
		System.out.println("Leer todos los libros ---");
		for(Libro libro: libros) {
			System.out.println(libro);
		}
		
		//Leer 1 libro
		System.out.println("Leer 1 libro ---");
		System.out.println(libros.get(0));
		
		Libro libroNuevo = new Libro(
			2L,
			"El mejor titulo del mundo actualizado",
			"Pepe el autor",
			"Planeta", 
			10,
			500
		);
		
		//Modificar 1 libro
		int posicion = libros.indexOf(libroNuevo);
		if(posicion != -1)
			libros.set(posicion, libroNuevo);
		System.out.println("Después de cambiar el segundo libro ---");
		for(Libro libro: libros) {
			System.out.println(libro);
		}
		
		libros.remove(libroNuevo);
		System.out.println("Después eliminar el objeto libroNuevo ---");
		for(Libro libro: libros) {
			System.out.println(libro);
		}
		
	}

}
